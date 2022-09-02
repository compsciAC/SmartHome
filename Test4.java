package javaSmartHome;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        int size = inputINT("How many smart devices would you like in the array? ");
        SmartHome smartdevices = new SmartHome(size);
        int i = 0;
        while(i < size){
            if(i % 2 == 0){
            SmartDevice obj = new SmartDevice(
                inputSTR("Input name? "), 
                inputDBL("Input location? "), 
                inputBOOL("Is device on or off? "));
            smartdevices.insertDevice(obj);
            }else{SmartFridge obj2 = new SmartFridge(
                inputSTR("Input name? "), 
                inputDBL("Input location? "), 
                inputDBL("Input temprature? "));
            smartdevices.insertDevice(obj2);
            }
            i++;
            }
        
        print(smartdevices.toString());
        
        int size2 = inputINT("How many smart devices would you like in the array? ");
        SmartDevice[] smartdevices2 = new SmartDevice[size2];
        
        while(i < size){
            smartdevices2[i] = new SmartDevice(
                inputSTR("Input name? "), 
                inputDBL("Input location? "), 
                inputBOOL("Is device on or off? "));
            smartdevices2[i+1] = new SmartFridge(
                inputSTR("Input name? "), 
                inputDBL("Input location? "), 
                inputDBL("Input temprature? "));
            }
            
        SmartHome obj = new SmartHome(smartdevices2);
        SmartFridge temp = (SmartFridge) smartdevices.getDevice(1);
        print(obj.toString());
        
        obj.shutdown();
        print(obj.toString());
        
        temp.increment();
        print(obj.toString());
        temp.decrement();
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

