import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("podaj liczbe elementow:");
        int number=scr.nextInt();
        int[] numba=new int[number];

        for (int i = 0; i < numba.length; i++) {
            System.out.println("podaj liczbe dla indeksu "+i);
            int newNumber=scr.nextInt();
            numba[i]=newNumber;
        }
        System.out.println(Arrays.toString(numba));
        int sum =0;
        int out=0;
        for (int i = 0; i < numba.length; i++) {
            sum += numba[i];
            out=sum/numba.length;
        }
        System.out.println("sredia "+out);

        int max=numba[0];
        for (int i = 0; i < numba.length; i++) {
            if (numba[i]>max) {
                max = numba[i];
            }
        }
        System.out.println("max liczba:"+max);
        Arrays.sort(numba);
        System.out.println(Arrays.toString(numba));
        int pozycja;

        if (numba.length%2==0){
            pozycja=numba.length/2;
            System.out.println("mediana "+((double)(numba[pozycja]+numba[pozycja-1])/2));

        } else{
            pozycja=(numba.length-1)/2;

            System.out.println(numba[pozycja]);
        }

    }

}
