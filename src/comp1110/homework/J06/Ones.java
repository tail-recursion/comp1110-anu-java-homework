package comp1110.homework.J06;

import java.util.Arrays;
import java.util.Scanner;

public class Ones {
    public static void main(String[] args) {
        /*
        create a class `Ones` that reads from the console a positive integer and prints
        out the number of '1's in the underlining binary pattern representation. This
        program need only work with positive numbers. e.g. The integer 5 has 2 '1's its
        binary representation, so you would print out `2`.
         */
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        String s = Integer.toBinaryString(x);
        int count = 0;
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == '1') count++;
        }
        System.out.println(count);
    }
}
