import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;
public class MyProgram
{
    public static void main(String[] args) {
        
        
        
        //introduction
        System.out.println("Hello, welcome to the workout program tracker and macro counter, WPTMC for short.");
        System.out.println("Do you want a quick overview on the application (Y/N)");
        Scanner kb = new Scanner(System.in);
        String ans1 = kb.nextLine();
        if(ans1.equals("Y")){
            System.out.println("This program takes in your calories, water, and individual macros like protein, fat, and carbs. You can also find workout and fitness programs that suit your needs. This is in all in one fitness app that will allow you to set goals and be able to view them and your progress.");
        }
        System.out.println();
        boolean play = true;
        
        
        
        
        Macros M1 = new Macros();
        Weight W1 = new Weight();
        
        //the selection loop
        while(play){
            System.out.println("Do you want to head to the Weight tracker, Macros tab, Programs tab, Diets tab, or Exit. (W/M/P/D/E)");
            String ans2 = kb.nextLine();
            
            
            if(ans2.equals("W")){
                System.out.println("Do you want to change weight settings to kg, check weight graph, check weights, enter a weight, or enter a weight goal (KG/WG/W/EW/EWG)");
                String ans3 = kb.nextLine();
                if(ans3.equals("KG")){
                    W1.changeKG();
                }
                if(ans3.equals("WG")){
                    JFrame f = new JFrame();
                    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    f.add(new WeightTracker());
                    f.setSize(400, 400);
                    f.setLocation(100, 0);
                    f.setVisible(true);
                }
                if(ans3.equals("W")){
                   W1.displayweight();
                }
                if(ans3.equals("EW")){
                    System.out.println("what weight do you wanna add");
                    String ans4 = kb.nextLine();
                    W1.addWeight(Double.parseDouble(ans4));
                }
                if(ans3.equals("EWG")){
                    System.out.println("what is your goalweight");
                    String ans4 = kb.nextLine();
                   W1.changegw(Double.parseDouble(ans4));
                }
                
                
            }
            if(ans2.equals("M")){
                System.out.println("Do you want to check your macros for today, adjust your goal, add a meal, or add water consumption (C/A/M/E/W)");
                String ans3 = kb.nextLine();
                if(ans3.equals("C")){
                    M1.displaymacros();
                    M1.displaymicros();
                }
                if(ans3.equals("A")){
                    System.out.println("Enter calories, protein, fats, carbs, water, and sodium in that order");
                    int cal = kb.nextInt();
                    int p = kb.nextInt();
                    int f = kb.nextInt();
                    int c = kb.nextInt();
                    int w = kb.nextInt();
                    int s = kb.nextInt();
                    M1.setgoal(cal,p,f,c,w,s);
                }
                if(ans3.equals("M")){
                    System.out.println("Enter protein, fats, carbs, and sodium in that order");
                    
                    int p = kb.nextInt();
                    int f = kb.nextInt();
                    int c = kb.nextInt();
                    int s = kb.nextInt();
                    M1.addmeal(p,f,c,s);
                }
                if(ans3.equals("W")){
                   System.out.println("Enter the water amount"); 
                   int w = kb.nextInt();
                   M1.drinkwater(w);
                }
            
            }
            if(ans2.equals("P")){
                SwingUtilities.invokeLater(() -> {
                    Programs programs = new Programs();
                    programs.createAndShowGUI();
                });
            }
            if(ans2.equals("D")){
                SwingUtilities.invokeLater(() -> {
                    Diets diets = new Diets();
                    diets.createAndShowGUI();
                });
            }
            if(ans2.equals("E")){
                play = false;
            }
        }
        

        
    }
 
}
