package comp1110.homework.J04;

import java.util.Scanner;

public class Name {
    /*
    reads in your name from the console
    and then prints out your name in upper case (hint: use the
    `toUpperCase()` method of `String`), and then on a new line,
    print the number of characters in your name. e.g. if your
    name is Bill the program should print out `BILL` on one line
    and `4` on the next.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
    }
}
