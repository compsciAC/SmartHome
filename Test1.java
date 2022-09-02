package javaSmartHome;

import java.util.Scanner;

public class Step1 {
     public static void main(String[] args) {
        SmartDevice sd = new SmartDevice("Device 1", 12.1,false);
        print(sd.toString());
        
        int size = inputINT("How many smart devices would you like in the array? ");
        SmartDevice[] smartdevices = new SmartDevice[size];
        
        for(int i = 0; i < size;i++){
            smartdevices[i]  = new SmartDevice(
                    inputSTR("Input name? "), 
                    inputDBL("Input location? "), 
                    inputBOOL("Is device on or off?(Enter true or false) "));  
        }
        
        for(int i = 0; i < size;i++){
        print(smartdevices[i].toString());
        }
        
        int index = inputINT("device index? ");
        if(smartdevices[index].switchedOn() == false){
            smartdevices[index].switchOn();
        }else{
            smartdevices[index].switchOff();
        }
        
        for(int i = 0; i < size;i++){
        print(smartdevices[i].toString());
        }
        
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


