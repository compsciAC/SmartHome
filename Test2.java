package javaSmartHome;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        int size = inputINT("How many smart devices would you like in the array? ");
        SmartHome smartdevices = new SmartHome(size);
        
        for(int i = 0; i < size; i++){
        smartdevices.insertDevice(
                inputSTR("Input name? "), 
                inputDBL("Input location? "), 
                inputBOOL("Is device on or off?(Enter true or false) "));
        }
        print(smartdevices.toString());
        
        int size2 = inputINT("How many smart devices would you like in the array?  ");
        SmartDevice[] smartdevices2 = new SmartDevice[size2];
        
        for(int i = 0; i < size;i++){
            smartdevices2[i]  = new SmartDevice(
                    inputSTR("Input name? "), 
                    inputDBL("Input location? "), 
                    inputBOOL("Is device on or off?(Enter true or false) "));  
        }
        
        SmartHome obj = new SmartHome(smartdevices2);
        print(obj.toString());
        
        int index = inputINT("Input index? ");
        if (obj.getDevice(index).switchedOn() == true){
                obj.getDevice(index).switchOff();
                }else{
                    obj.getDevice(index).switchOn();
                }
        print(obj.toString());
        
        double location = inputDBL("Input location? ");
        if (obj.getDevice(location).switchedOn() == true){
                obj.getDevice(location).switchOff();
                }else{
                    obj.getDevice(location).switchOn();
                }
        print(obj.toString());
        
        obj.toggle(inputDBL("Input location "));
        print(obj.toString());
    }
     
    public static double inputDBL(String prompt){
        
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextDouble();
    }
    
    public static boolean inputBOOL(String prompt){
        
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextBoolean();
    }
    
    public static String inputSTR(String prompt){
        
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextLine();
    }
    
    public static int inputINT(String prompt){
        Scanner input = new Scanner(System.in);
        System.out.println(prompt);
        return input.nextInt();
    }
    public static void print(String data){System.out.println(data);  }
    public static void print(int data){System.out.println(data);}
    public static void print(double data){System.out.println(data); }
    public static void print(boolean data){System.out.println(data); }
}
