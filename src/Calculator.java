import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    System.out.println(add(1,2));

    }


    public static int add(int a ,int b){
        System.out.print("dodam teraz "+ a+" i "+b+ ": wynik ");
        return a+b;
    }
    public static int subtract(int a, int b){
        System.out.print("odejme teraz "+ a+" i "+b+": wynik ");
        return a-b;
    }
    public static int multiply(int a , int b){
        System.out.print("pomnoze teraz "+ a+" i "+b+": wynik ");
        return a*b;
    }
    public static double divide(double a, double b){
        System.out.print("podziele teraz "+ a+" i "+b+": wynik ");
        return a/b;
    }
}
