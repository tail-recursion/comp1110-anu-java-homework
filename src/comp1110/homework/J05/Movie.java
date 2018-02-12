package comp1110.homework.J05;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        /*
        reads in the name of a movie and its length in minutes,
        entered one line after the other at the console. The program must print the name
        of the film followed by `runs for `, then its length in hours and minutes.
        e.g. if the inputs are `Finding Nemo` and `104`, then the program would output
        `Finding Nemo runs for 1 hour and 44 minutes`. If the movie is less than one hour,
        you should not print hours, if it is greater than one hour you should print
        `hours` instead of `hour`. Likewise for minutes; if there are no minutes,
        do not print them, if there is one, print `minute`, and if more than one, print
        `minutes`. (Hint - use the `%` operator).
         */
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        int mins = in.nextInt();
        String out = "";
        if (mins % 60 == 0) {
            if (mins == 60) out="1 hour";
            else out = (mins/60) + " hours";
        }
        else {
            int mins_rem = (mins%60);
            int hours = mins / 60;
            if (hours==1) out += "1 hour and ";
            else if (hours > 0) out += hours + " hours and ";
            out += mins_rem + " " + ((mins_rem==1)?"minute":"minutes");
        }
        System.out.println(name + " runs for " + out);
    }
}
