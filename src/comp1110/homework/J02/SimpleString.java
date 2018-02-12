package comp1110.homework.J02;

public class SimpleString {
    /*
     * it declares an String, `s` and initializes it to empty string (`''`)
     * it  prints out `s` (using `system.out.println()`)
     * it assigns `"Foo"` to `s` (use the `=` sign for assignment)
     * it prints out `s`
     * it assigns `"Bar"` to `s`
     * it prints out `s`
     * it concatenates a `"!"` to the end of `s` (use the `+` symbol for string concatenation)
     * it prints out `s`
     */
    public static void main(String[] args) {
        String s="";
        System.out.println(s);
        s="Foo";
        System.out.println(s);
        s="Bar";
        System.out.println(s);
        s+="!";
        System.out.println(s);
    }
}
