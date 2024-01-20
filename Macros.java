import java.util.ArrayList;
public class Macros {
    


    //public ArrayList<String> meals;
    public int calories;
    public int protein;
    public int fat;
    public int carbs;
    public int water;
    public int sodium;
    
    public int goalcalories;
    public int goalprotein;
    public int goalfat;
    public int goalcarbs;
    public int goalwater;
    public int goalsodium;
    
    public Macros(){
        calories = 0;
        protein = 0;
        fat = 0;
        carbs = 0;
        water = 0;
        sodium = 0;
        goalcalories = 0;
        goalprotein = 0;
        goalfat = 0; 
        goalcarbs = 0;
        goalwater = 0;
        goalsodium = 0;
         
    }
    public void setgoal(int cal,int p, int f,int c, int w, int s){
        goalcalories = cal;
        goalprotein = p;
        goalfat = f;
        goalcarbs = c;
        goalwater = w;
        goalsodium = s;
        System.out.println("-------------");
        System.out.println("Your Goal");
        System.out.println("Goal Calories: " + goalcalories);
        System.out.println("Goal Protein: " + goalprotein);
        System.out.println("Goal Carbs: " + goalcarbs);
        System.out.println("Goal Fat: " + goalfat);
        System.out.println("Goal Water: " + goalwater);
        System.out.println("Goal Salt: " + sodium);
        System.out.println("-------------");
    }
    public void addmeal(int p,int f,int c,int s){
        carbs = c;
        protein = p;
        fat = f;
        sodium = s;
    }
    public void drinkwater(int w){
        water = w;
    }
    

    public void displaymacros(){
        System.out.println("-------------");
        System.out.println("Total calories: " + calories +"/Goal Calories: " + calories);
        System.out.println("Protein: " + protein + "/Goal Protein: " + protein);
        System.out.println("Carbs: " + carbs + "/Goal Carbs: " + carbs);
        System.out.println("Fat: " + fat + "/Goal Fat: " + fat);
        System.out.println("-------------");
    }
    
    public void displaymicros(){
        System.out.println("-------------");
        System.out.println("Total water: " + water + "Goal Water: " + water);
        System.out.println("Total salt intake: " + sodium);
        System.out.println("-------------");
    }
    
    
    
    
}
