package javaSmartHome;

import java.util.Scanner;

public class Step5 {
    public static void main(String[] args) {
        SmartHome smartdevices = new SmartHome(6);
        SmartDevice smartdevice1 = new SmartDevice("Device 1", 8.1,false);
        smartdevices.insertDevice(smartdevice1);
        SmartDevice smartdevice2 = new SmartDevice("Device 2", 6.8, false);
        smartdevices.insertDevice(smartdevice2);
        SmartDevice smartdevice3 = new SmartDevice("Device 3", 7.7, false);
        smartdevices.insertDevice(smartdevice3);
        SmartDevice smartdevice4 = new SmartFridge("Device 4", 10.3, 37.8);
        smartdevices.insertDevice(smartdevice4);
        SmartDevice smartdevice5 = new SmartLamp("Device 5", 11.7, true, LightModes.SOFT_MODE);
        smartdevices.insertDevice(smartdevice5);
        SmartDevice smartdevice6 = new SmartLamp("Device 6", 5.8, true, LightModes.SOFT_MODE);
        smartdevices.insertDevice(smartdevice6);
        
        
        ((SmartLamp)smartdevices.getDevice(inputINT("Input index: "))).lightMode(LightModes.NIGHT_MODE);
        print(smartdevice5.toString());
        ((SmartLamp) smartdevices.getDevice(inputDBL("Input location: "))).lightMode(LightModes.STANDARD_MODE);
        print(smartdevice5.toString());
       
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
