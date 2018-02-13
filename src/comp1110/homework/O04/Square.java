package comp1110.homework.O04;

public class Square extends Shape {
    double side;
    @Override
    public double perimeter() {
        return side*4;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public boolean overlaps(Shape other) {
        if (other instanceof Square) {
            // distance between centers <= half side length of either square
            double distance=Math.sqrt(Math.pow(this.x-other.x,2) + Math.pow(this.y-other.y,2));
            return distance<= this.side || distance<=((Square)other).side;
        }
        else { // square circle

        }
        return false;
    }

    public Square(double side) {
        this.side=side;
    }

    public Square(double side, double x, double y) {
        this.side=side;
        this.x=x;
        this.y=y;
    }
}
