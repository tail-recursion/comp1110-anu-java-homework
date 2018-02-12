package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Mean {
    /*
    create a class `Mean` that will create an `ArrayList` of `Double`, reading
    `double`s from the console into it, each on a separate line (until the user
    types `ctrl-D`, by pressing the control and `D` keys, (`ctrl-Z` on Windows),
    to indicate the end of the list), and calculate and print the arithmetic mean
    of the numbers in this list.
     */
    public static void main(String[] args) {
        ArrayList<Double> doubles = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            doubles.add(in.nextDouble());
        }
        double sum = doubles.stream().reduce(0.0,(a,b)->a+b);
        System.out.println(sum/doubles.size());
    }
}
