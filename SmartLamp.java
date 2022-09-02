package javaSmartHome;

public class SmartLamp extends SmartDevice{
    private LightModes lightMode; 
    
    public SmartLamp(String name, double location, boolean switchedOn, LightModes lightMode){
       super(name, location, switchedOn);
       this.lightMode = lightMode;
    }
    
    public void lightMode(LightModes mode){this.lightMode = mode;}
    public LightModes lightMode(){return lightMode;}
    
    public String toString(){

       String check = "";

       check += super.toString();
       check += "Mode:  " + lightMode + "\n";
       return check; 
   }
    
}
