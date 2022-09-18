import java.util.Scanner;

public class Second {
    public static void main(String[] args) {

        System.out.println("suma liczby a i b rowna sie "+add(getNumber("a"),getNumber("b")));




    }

    public static int add(int a, int b) {
        return a + b;

    }

    public static int getNumber( String nazwa) {
        System.out.println("podaj liczbę " + nazwa+" :");
        Scanner scr = new Scanner(System.in);
        return scr.nextInt();
    }

}
