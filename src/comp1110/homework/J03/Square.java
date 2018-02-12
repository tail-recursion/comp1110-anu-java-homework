package comp1110.homework.J03;

import java.util.Scanner;

public class Square {
    /*
    The class will read from the console an
    integer that represents the length of a side and then calculate
     and print an integer that reprents the area of a square. Test
     your solution using the `J03` test.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int side = in.nextInt();
        System.out.println(side*side);
    }
}
