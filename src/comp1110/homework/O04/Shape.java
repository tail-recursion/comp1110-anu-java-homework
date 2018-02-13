package comp1110.homework.O04;

public abstract class Shape {
    /*

        create an abstract class, `Shape`, that stores information about simple shapes.

        * `Shape` includes two abstract public methods, `double perimeter()`, and `double area()`, which return
        the length of the perimeter and the area of the shape respectively.

        Add the ability of store the xy-position of the center of each shape:

        * Add `x` and `y` fields to `Shape`.

        * For each shape add a second constructor that takes three `double`s as arguments,
        `length`, `x`, and `y`.

        * Add an abstract public method `boolean overlaps(Shape other)` to `Shape` that
        takes a single `Shape` as an argument and returns `true` if the other shape
        overlaps the shape it is called on. Assume the squares are upright (parallel
        to the axis).

     */
    public abstract double perimeter();
    public abstract double area();
    public abstract boolean overlaps(Shape other);

    public static void main(String[] args) {
        Shape s1 = new Square(10);    // a square with sides of 10.0 units
        Shape s2 = new Circle(1.0);   // a circle of radius 1.0 units
        System.out.println(s1.perimeter());
        System.out.println(s1.area());
        System.out.println(s2.perimeter());
        System.out.println(s2.area());
    }

    double x,y;
}
