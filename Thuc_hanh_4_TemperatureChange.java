import com.sun.org.apache.bcel.internal.generic.BREAKPOINT;

import java.util.Scanner;
public class Thuc_hanh_4_TemperatureChange {
    public static void main(String[] args) {
        int choice;
        double check;
        double fah;
        double cel;
        Scanner input=new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        System.out.println("Please enter your choice");
        choice=input.nextInt();
        switch (choice){
            case 1 :
                System.out.println("Fahrenheit to Celsius Converting");
                System.out.println("Enter Fahrenheit temperature");
                fah=input.nextInt();
                fahToCel(fah);
                System.out.println(fahToCel(fah));
                break;
            case 2 :
                System.out.println("Celsius to Fahrenheit Converting");
                System.out.println("Enter Celsius temperature");
                cel=input.nextInt();
                celToFah(cel);
                System.out.println(celToFah(cel));
                break;
            case 3 :
                System.out.println("Exit");
                System.exit(0);
        }
    }
    public static double celToFah(double cel) {
            double fah=(9.0/5)*cel+32;
            return fah;
    }
    public static double fahToCel(double fah){
            double cel=(5.0/9)*(fah-32);
            return cel;
    }
}
