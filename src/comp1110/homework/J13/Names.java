package comp1110.homework.J13;

import java.util.ArrayList;
import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        /*
        create an `ArrayList` of `String`, read names
        from the console into it, each on a separate line (until the user indicates the
        end of the list by typing `ctrl-D`, by pressing the control and `D` keys,
        (`ctrl-Z` on Windows)), and print the names out in reverse order on separate lines
        (using a `for` loop ).
         */
        ArrayList<String> names = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            names.add(in.nextLine());
        }
        for (int i=names.size()-1; i >=0; i--) {
            System.out.println(names.get(i));
        }
    }
}
