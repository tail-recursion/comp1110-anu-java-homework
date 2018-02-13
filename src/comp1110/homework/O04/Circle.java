package comp1110.homework.O04;

public class Circle extends Shape {
    double radius;
    @Override
    public double perimeter() {
        return Math.PI*2*radius;//    pi=circumference/diameter    diameter*pi=circumference
    }

    @Override
    public double area() {
        return Math.PI*(radius*radius);
    }

    @Override
    public boolean overlaps(Shape other) {
        if (other instanceof Circle) {
            //https://math.stackexchange.com/a/275515
            return Math.pow(this.radius-((Circle)other).radius,2) >= Math.pow(this.x-other.x,2) + Math.pow(this.y-other.y,2);
        }
        else { // square circle

        }
        return false;
    }

    public Circle(double radius) {
        this.radius=radius;
    }

    public Circle(double radius, double x, double y) {
        this.radius=radius;
        this.x=x;
        this.y=y;
    }
}
