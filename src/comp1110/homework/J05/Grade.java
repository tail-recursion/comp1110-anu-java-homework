package comp1110.homework.J05;

import java.util.Scanner;

public class Grade {
    /*
    reads a mark for a subject (an integer) from the
    console and then prints the final grade based on this mark. Assume final
    grades are calculated using the following: marks between and including 0
    and 49 will given a grade of `N`, 50 and 59 will give `P`, 60 and 69 will
    give `C`, 70 and 79 will give `D`, and finally 80 and 100 will give `HD`.
    If the mark is less than zero or greater than 100, print `Bad mark`.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mark=in.nextInt();
        if (mark <0||mark>100) System.out.println("Bad mark");
        else if (mark <= 49) System.out.println("N");
        else if (mark <= 59) System.out.println("P");
        else if (mark <= 69) System.out.println("C");
        else System.out.println("HD");
    }
}
