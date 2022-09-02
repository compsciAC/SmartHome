package javaSmartHome;

public class SmartDevice {
    private String name;
    private double location;
    private boolean switchedOn;
    
    public SmartDevice(String name, double location, boolean switchedOn){
        this.name = name;
        this.location = location;
        this.switchedOn = switchedOn;
    }

    public void name(String value){
        this.name = value;
    }
    public void location (double value){
        this.location = value;
    } 
    public void isSwitchedOn (boolean value){
        this.switchedOn = value;
    }
    public void switchOn(){
        this.switchedOn = true;
    }
    public void switchOff(){
        this.switchedOn = false;
    }
    public String name(){
        return name;
    }
    public double location(){ 
        return location;
    }
    public boolean switchedOn(){ 
        return switchedOn;
    }
      
    public String toString(){
        
        String check = "";
        check += "-----------------\n";
        check += "NAME:             " + name + "\n";
        check += "LOCATION:         " + location + "\n";
        check += "SWITCHED ON/OFF:  " + switchedOn + "\n";
        return check; 
    }
}
