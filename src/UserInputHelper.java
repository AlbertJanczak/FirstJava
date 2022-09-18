import java.util.Scanner;

public class UserInputHelper {
    public static int getNumberFromUser( String numberName) {
        System.out.println("prosze podaj liczbę " + numberName + " :");
        Scanner scr = new Scanner(System.in);
        return scr.nextInt();
    }

    public static String getActionFromUser() {
        System.out.println("prosze podaj nazwe dzialania: ");
        Scanner scr = new Scanner(System.in);
        return scr.nextLine();
    }
}
