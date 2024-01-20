import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Diets {
    private JFrame mainFrame;

    // Main page variables
    private String mainPageName = "Diets";
    private String mainPageButton1Text = "Carnivore";
    private String mainPageButton2Text = "Keto";
    private String mainPageButton3Text = "Vegan";
    private String mainPageButton4Text = "Balanced High Protein";

    // Page variables
    private String page1Name = "Carnivore";
    private String page1Text = "The carnivore diet is a dietary approach centered around the exclusive or predominant consumption of animal products while excluding most or all plant-based foods. Followers of this diet primarily eat meat, fish, eggs, and other animal-derived products, omitting fruits, vegetables, grains, and other plant sources. Advocates of the carnivore diet claim potential benefits such as rapid weight loss, improved mental clarity, and enhanced energy levels. Proponents argue that animal products provide essential nutrients in a highly bioavailable form and that eliminating certain plant compounds can reduce inflammation and digestive issues. However, it's important to note that scientific support for the long-term sustainability and overall health benefits of the carnivore diet is limited, and potential risks, such as nutrient deficiencies and lack of dietary diversity, should be carefully considered. Individuals interested in this diet should consult with healthcare professionals for personalized advice and monitor their health closely.";

    private String page2Name = "Keto";
    private String page2Text = "The ketogenic (keto) diet is a low-carbohydrate, high-fat diet designed to induce a state of ketosis, where the body burns fat for fuel instead of carbohydrates. By drastically reducing carbohydrate intake, the body enters a metabolic state that encourages the production of ketones. The primary benefit of the keto diet is its potential for effective weight loss, as the body taps into stored fat for energy. Additionally, some people report improved mental clarity, increased energy levels, and better blood sugar control. However, it's essential to note that individual responses may vary, and long-term health effects and sustainability of the keto diet require further research. Consultation with healthcare professionals is advisable before starting such a diet.";

    private String page3Name = "Vegan";
    private String page3Text = "A vegan diet is a plant-based dietary approach that excludes all animal products, including meat, dairy, eggs, and honey. It is rooted in ethical, environmental, and health considerations. Vegans consume a variety of plant-based foods, such as fruits, vegetables, grains, legumes, nuts, and seeds. The primary benefits associated with a vegan lifestyle include potential weight management, lower risk of certain chronic diseases, and reduced environmental impact due to lower greenhouse gas emissions associated with plant-based agriculture. Proper planning is essential to ensure adequate intake of essential nutrients like protein, iron, calcium, and vitamin B12, which are commonly found in animal products. Many people adopt a vegan diet for ethical reasons, aiming to reduce animal exploitation and promote more sustainable and compassionate living.";

    private String page4Name = "Balanced High Protein";
    private String page4Text = "A balanced high-protein diet is a nutritional approach that emphasizes the consumption of foods rich in protein while maintaining a balance of other essential nutrients. Protein is crucial for various bodily functions, including muscle repair, immune function, and hormone production. A balanced high-protein diet typically includes lean sources of protein such as poultry, fish, lean meats, eggs, dairy products, legumes, and plant-based protein sources like tofu and beans. Additionally, incorporating a variety of fruits, vegetables, whole grains, and healthy fats ensures a well-rounded intake of essential vitamins, minerals, and fiber. This diet is often favored by individuals engaged in regular physical activity, such as athletes and those aiming for muscle development, as protein plays a vital role in muscle maintenance and growth. It's important to personalize protein intake based on individual health goals, activity levels, and overall nutritional needs while considering the balance with other macronutrients. Consulting with a healthcare professional or a registered dietitian can provide personalized guidance for achieving a balanced and high-protein diet.";

    public void createAndShowGUI() {
        mainFrame = new JFrame(mainPageName);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setBackground(new Color(245, 222, 179));  // Brown background
        mainFrame.setLayout(new GridLayout(2, 2, 10, 10)); // 2 rows, 2 columns, with 10 pixels horizontal and vertical gap

        JButton button1 = createStyledButton(mainPageButton1Text);
        JButton button2 = createStyledButton(mainPageButton2Text);
        JButton button3 = createStyledButton(mainPageButton3Text);
        JButton button4 = createStyledButton(mainPageButton4Text);

        button1.addActionListener(new ButtonListener(page1Name, page1Text));
        button2.addActionListener(new ButtonListener(page2Name, page2Text));
        button3.addActionListener(new ButtonListener(page3Name, page3Text));
        button4.addActionListener(new ButtonListener(page4Name, page4Text));

        mainFrame.add(button1);
        mainFrame.add(button2);
        mainFrame.add(button3);
        mainFrame.add(button4);

        mainFrame.setSize(600, 600);
        mainFrame.setVisible(true);
    }

    private JButton createStyledButton(String text) {
        JButton button = new JButton(text);
        button.setBackground(new Color(245, 222, 179));  // Brown background
        button.setForeground(new Color(205, 133, 63));  // Cream text color
        button.setFocusPainted(false);
        return button;
    }

    private void openNewPage(String pageName, String pageText) {
        JFrame pageFrame = new JFrame(pageName);
        pageFrame.setSize(400, 300);
        pageFrame.setLayout(new BorderLayout());
        pageFrame.setBackground(new Color(245, 222, 179));  // Brown background

        JTextArea textArea = new JTextArea(pageText);
        textArea.setEditable(false);
        textArea.setLineWrap(true); // Enable line wrapping
        textArea.setWrapStyleWord(true); // Wrap at word boundaries
        textArea.setBackground(new Color(245, 222, 179));  // Brown background
        textArea.setForeground(new Color(205, 133, 63));  // Cream text color

        JScrollPane scrollPane = new JScrollPane(textArea); // Add a JScrollPane to handle scrolling
        pageFrame.add(scrollPane, BorderLayout.CENTER);

        // Back button with an arrow
        JButton backButton = new JButton("Back  \u2190");
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pageFrame.dispose();
                mainFrame.setVisible(true);
            }
        });
        backButton.setFocusPainted(false);
        backButton.setBackground(new Color(245, 222, 179));  // Brown background
        backButton.setForeground(new Color(205, 133, 63));  // Cream text color
        pageFrame.add(backButton, BorderLayout.NORTH);

        pageFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pageFrame.setLocationRelativeTo(mainFrame);
        pageFrame.setVisible(true);
    }

    class ButtonListener implements ActionListener {
        private String pageName;
        private String pageText;

        ButtonListener(String pageName, String pageText) {
            this.pageName = pageName;
            this.pageText = pageText;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            mainFrame.setVisible(false);
            openNewPage(pageName, pageText);
        }
    }
}
