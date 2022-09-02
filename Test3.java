package javaSmartHome;

import java.util.Scanner;

public class Step3 {
    public static void main(String[] args) {
        int size = inputINT("How many smart devices would you like in the array? ");
        SmartHome smartdevices = new SmartHome(size);
        for(int i = 0; i < size; i++){
        smartdevices.insertDevice(
                inputSTR("Input name? "), 
                inputDBL("Input location? "), 
                inputBOOL("Is device on or off?(Enter true or false) "));
        }
        
        SmartDevice obj = new SmartDevice(
                inputSTR("Input name? "), 
                inputDBL("Input location? "), 
                inputBOOL("Is device on or off?(Enter true or false) "));
        
        smartdevices.addDevice(obj);
        print(smartdevices.toString());
        
        smartdevices.setAllInRoom(10, true);
        print(smartdevices.toString());
        
        smartdevices.shutdown();
        print(smartdevices.toString());
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
