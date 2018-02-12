package comp1110.homework.J06;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Permute {
    /*
    reads in two strings one line after the other from
    the console then determines whether the characters of one string are some
    permutation of the characters of another string (a permutation is a strict
    reordering, no additions, no deletions). The strings will be made up only of
    lower case letters and not contain white spaces (e.g. tab, space character). If
    the strings are perumtations of each other, print `Yes` otherwise print `No`.
    So for exampl `cats` is a permutation of `acst`, so you would print `Yes` whereas,
    neither `cats` nor `catt` are permutations of `cate`, so you would print `No`
    (Hint - use `.length` to find the length of a `String` and the `charAt()`
    method to get the character at a given position in a `String`).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        if (a.length() != b.length()) System.out.println("No");
        else {
            for (int i=0; i<a.length();i++) {
                if (!b.contains(a.charAt(i)+"")) {
                    System.out.println("No");
                    return;
                }
                else {
                    b.replaceFirst(a.charAt(i)+"","");
                }
            }
            System.out.println("Yes");
        }
    }
}
