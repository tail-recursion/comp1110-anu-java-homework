package comp1110.homework.J04;

import java.util.Scanner;

public class Radix {
    public static void main(String[] args) {
        /*
        create a class `Radix` that is able to convert numbers between
        different radices (also known as bases) (for simplicity we
        restrict the possible radices to 2, 3, 4, ... , 16). The
        program should read in three variables from the console one
        line after another; an integer, the source base, an integer,
        the destination base, and a string. The program should
        interpret the string as a number in source base and output
         it as a number in destination base (using the source and
         destination base number system). e.g. Say your source base
         was 3 and the destination base was 5. Then if the string
         was 21, then `12` should be printed. You do not need to
         handle negative numbers.
         */
        Scanner in = new Scanner(System.in);
        Integer base = Integer.parseInt(in.nextLine());
        Integer destination = Integer.parseInt(in.nextLine());
        String s = in.nextLine();
        System.out.println(Integer.toString(Integer.parseInt(s,base),destination));
    }
}
