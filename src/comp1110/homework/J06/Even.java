package comp1110.homework.J06;

import java.util.Scanner;

public class Even {
    /*
    create a class `Even` that reads an integer (`n`) from the console and then
    prints all the even numbers between 1 and n, inclusive of n, each on a new line.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i=2; i<=n; i+=2) System.out.println(i);
    }
}
