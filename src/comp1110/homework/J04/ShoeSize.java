package comp1110.homework.J04;

import java.util.Scanner;

public class ShoeSize {
    /*
    estimate your shoe size
    by reading in your height (in meters) from the console,
    multiplying by 5.0, rounding it to the nearest integer
    (rounding up on ties), and printing the result.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float height = in.nextFloat();
        System.out.println(Math.round(height*5.0));
    }
}
