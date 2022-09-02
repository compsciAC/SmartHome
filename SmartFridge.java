package javaSmartHome;

public class SmartFridge extends SmartDevice{
    private double currentTemprature;
    
    public SmartFridge(String name, double location, double currentTemprature){
        super(name, location, true);
        this.currentTemprature = currentTemprature;
    }
    
    public void currentTemprature (double value){ 
        this.currentTemprature = value;
    }
    public double currentTemprature(){ 
        return currentTemprature;
    }
    
    public void increment(){
        currentTemprature++;
    }
    
    public void decrement(){
        currentTemprature--;
    }
    
    @Override
    public void switchOff(){
        
    }
    
    public String toString(){
        
        String check = "";
        check += super.toString();
        check += "SWITCHED ON/OFF:  " + currentTemprature + "\n";
        return check; 
    }
}

