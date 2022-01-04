
/**
 * Fan - Write a description here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// Standard import for the Scanner class
import java.util.*;
public class FanTest {
    public static void main (String [] args) {
    Fan fan1 = new Fan();
    fan1.setspeed(Fan.MAX);
    fan1.setradius(10);
    fan1.setColor("yellow");
    fan1.setOn(true);
    System.out.println("Fan 1"+ fan1.toString());
    
    Fan fan2 = new Fan();
    fan2.setspeed(Fan.MEDIUM);
    fan2.setradius(5);
    //fan2.setColor("blue");
    fan2.setOn(false);
    System.out.println("Fan 2" +"\n "+ fan2.toString());
    
    }
    
     
}
class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int MAX = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan(){
        
    }
    public int getspeed(){
        
        return speed;
    }
    public boolean getOn(){
        
        return on;
    }
    public double getradius(){
       
        return speed;
    }
     public String getcolor(){
       
        return color;
    }
    
    
    public void setradius(double radius){
        this.radius = radius;
        
    }
    public void setspeed(int speed){
        this.speed = speed;
        
    }
    public void setOn(boolean on){
       this.on = on;
        
    }
    public void  setColor(String color){
       
        this.color = color;
    }
    
    
    public String toString(){
        return "\n"+"speed "+ speed +"\n" + "color "+ color +"\n" + "radius " 
        +radius +"\n" + ((on) ? "fan is on" : "fan is off");
        
        
    
    
    }
}