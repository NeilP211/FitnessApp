import java.util.*;
public class Weight {
    private ArrayList<Double> weight;
    private double goalweight;
    private int day;
    private boolean kg;
    
    public void addWeight(double w){
        day++;
        weight.add(w);
    }
    
    public ArrayList<Double> Weightarr(){
        return weight;
    }
    public void changeKG(){
        kg = true;
    }
    public void changegw (double g){
        goalweight = g;
    }
    
    public void displayweight(){
        if(kg){
            for(int i = 0; i < weight.size(); i++){
                System.out.println(weight.get(i) + " kg");
            }
        }
        else{
            for(int i = 0; i < weight.size(); i++){
                System.out.println(weight.get(i) + " lbs");
            }
        }
        
    }
    
}
