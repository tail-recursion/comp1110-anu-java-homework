package comp1110.homework.J05;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        /*
        create a class `Odd` that reads an integer from the console and then determines
        whether it is odd. If the input is a number, X, the program will print `X is odd`.
        if X is odd, otherwise it will print `X is even`. For exanple, if the number was 3,
                the program would print `3 is odd`. This program must use a method with the
        signature `public static boolean isOdd(int i)`.
        */
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        if (isOdd(i)) System.out.println(i + " is odd");
        else System.out.println(i + " is even");
    }
    public static boolean isOdd(int i) {
        return i %2 != 0;
    }
}
