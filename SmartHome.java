package javaSmartHome;

public class SmartHome {
     private SmartDevice[] objects;
    
    int index;
   
    public SmartHome(int maxObjects){
        objects = new SmartDevice[maxObjects];
        index = 0;
    }

    public SmartHome(SmartDevice[] objects){
        this.objects = objects;
    }
    
    public void insertDevice(SmartDevice obj){
        if(index >= objects.length) {
        addDevice(obj);
        }
        else{
        objects[index] = obj;
        index++;
        }
    }   
    
    public void insertDevice(String name, double location, boolean switchedOn){
        SmartDevice obj = new SmartDevice(name, location, switchedOn); 
        if(index >= objects.length) {
        addDevice(obj);
        }       
        else{ 
        objects[index] = obj;
        index++;
        }
    }
     
    public SmartDevice getDevice(int index){
        return objects[index];
    }
    
    public SmartDevice getDevice(double location){
        for(SmartDevice object : objects){
            if(location == object.location()){
                return object;
            }
        }
        return null;
    }
    
    public void toggle(double location){
        for (SmartDevice object : objects) {
            if (location == object.location()) {
                if (object.switchedOn() == true){
                object.switchOff();
                }else{
                    object.switchOn();
                }
            }
        }
    }
    
    public void addDevice(SmartDevice obj){
        SmartDevice[] temp;
        if(index >= objects.length) {
        temp = new SmartDevice[objects.length+1];
        for(int i = 0; i < objects.length; i++){
            temp[i] = objects[i];
        }
        objects = temp;
        }       
        objects[index] = obj;
        index++;
    }    
    
    public void setAllInRoom(int roomChoice, boolean switchedOn){
        for(SmartDevice object : objects) {
            int compare = (int) object.location();
            if(compare == roomChoice) {
                object.isSwitchedOn(switchedOn);
            }
        }
    }
    
    public void shutdown(){
        for(SmartDevice object : objects) {
            object.isSwitchedOn(false);
        }
    }
    
    @Override
    public String toString(){ 
        String values = "";     
        for(int i = 0; i < objects.length;i++){
            if(objects[i] != null){
                values += "OBJECT: " + (i+1) +"\n";
                values += objects[i].toString();
            }
        }           
        return values;     
    } 
}
