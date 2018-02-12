package comp1110.homework.J13;

import java.util.HashMap;
import java.util.Scanner;

public class People {
    /*
    create a class `People` that will store a table of people's first names and ages
    (using a `HashMap`, the people's names as the key, and integer ages as the value).
    Read people and ages from the console (e.g. `Bob 19`) and add to the `HashMap`.
    For this example, assume ages are integers and names do not contain spaces. After
    a list of name, age pairs, a name will be entered without an age (e.g. `Mary`) and
    the user will terminate their input by typing `ctrl-D`, by pressing the control and
    'D' keys (`ctrl-Z` on Windows).  Treat the last name (`Mary` in this example) as a
    query.  Print out the age of the person entered last, or print `unknown` if the
    person's name is unknown (i.e. it did not appear earlier in the list).
     */
    public static void main(String[] args) {
        HashMap<String,Integer> people=new HashMap<>();
        Scanner in=new Scanner(System.in);
        String query=null;
        while (in.hasNext()) {
            String input=in.nextLine();
            if (input.contains(" ")) {
                people.put(input.split(" ")[0], Integer.parseInt(input.split(" ")[1]));
            }
            else {
                query=input;
                break;
            }
        }
        if (people.containsKey(query)) System.out.println(people.get(query));
        else System.out.println("unknown");
    }
}
