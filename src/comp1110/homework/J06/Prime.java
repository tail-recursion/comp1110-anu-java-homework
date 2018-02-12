package comp1110.homework.J06;

import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    /*
    reads a positive integer from the console and
    then prints all of the prime numbers from 1 to n (inclusive)
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=2; i<=n; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    static boolean isPrime(int i) {
        if (i==1) return true;
        for (int j=2; j < i; j++) {
            if (i%j==0) return false;
        }
        return true;
    }
}
