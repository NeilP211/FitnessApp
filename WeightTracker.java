import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;

public class WeightTracker extends JPanel {

    ArrayList<Double> weight = new ArrayList<>();
    final int PAD = 20;

    public WeightTracker() {
        String input = JOptionPane.showInputDialog("Enter :");
        if (input != null && !input.isEmpty()) {
            String[] values = input.split(",");
            for (int i = 0; i < values.length; i++) {
                try {
                    double value = Double.parseDouble(values[i].trim());
                    weight.add(value);
                } catch (NumberFormatException e) {
                    // Handle invalid input if needed
                    e.printStackTrace();
                }
            }
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        g2.draw(new Line2D.Double(PAD, PAD, PAD, h - PAD)); // Draw y axis
        g2.draw(new Line2D.Double(PAD, h - PAD, w - PAD, h - PAD)); // Draw x axis

        // Draw labels.
        Font font = g2.getFont();
        FontRenderContext frc = g2.getFontRenderContext();
        LineMetrics lm = font.getLineMetrics("0", frc);
        float sh = lm.getAscent() + lm.getDescent();

        // Y label (Weight).
        String yAxisLabel = "Weight";
        float sy = (h - 2 * PAD) / 2 + lm.getAscent();
        float sx = PAD - sh / 2;

        // Rotate the label vertically.
        AffineTransform at = AffineTransform.getQuadrantRotateInstance(3, sx, sy);
        g2.setTransform(at);
        g2.drawString(yAxisLabel, sx, sy);

        g2.setTransform(new AffineTransform());

        // x axis (Time).
        String xAxisLabel = "Time";
        sy = h - PAD + (PAD - sh) / 2 + lm.getAscent();
        float sw = (float) font.getStringBounds(xAxisLabel, frc).getWidth();
        sx = (w - sw) / 2;
        g2.drawString(xAxisLabel, sx, sy);

        // Draw lines and dots.
        double xInc = (double) (w - 2 * PAD) / (weight.size() - 1);
        double scale = (double) (h - 2 * PAD) / getMax();


        g2.setColor(new Color(128, 0, 128));

        for (int i = 0; i < weight.size(); i++) {
            double x = PAD + i * xInc;
            double y = h - PAD - scale * weight.get(i);

            // Draw dots.
            g2.fill(new Ellipse2D.Double(x - 2, y - 2, 4, 4));

            
            g2.setColor(Color.blue);

            // Draw lines.
            if (i < weight.size() - 1) {
                double x2 = PAD + (i + 1) * xInc;
                double y2 = h - PAD - scale * weight.get(i + 1);
                g2.draw(new Line2D.Double(x, y, x2, y2));
            }
        }
    }

    private double getMax() {
        double max = Double.MIN_VALUE;
        for (int i = 0; i < weight.size(); i++) {
            if (weight.get(i) > max) {
                max = weight.get(i);
            }
        }
        return max;
    }
    
    
}
