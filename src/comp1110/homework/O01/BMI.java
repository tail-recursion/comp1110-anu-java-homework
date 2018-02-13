package comp1110.homework.O01;

public class BMI {
    /*
    Within the `comp1110.homework.O01` package of the `comp1110-homework` project,
    create a class `BMI` that stores information about a person including: name,
    height, and weight.
    * The class will have a constructor `BMI(String name, double height,
    double weight)`.
    * The class should have a public instance method, `getBMI()` that returns a `double` reflecting the person's BMI (Body Mass Index = weight (kg) / height2 (m2) ).
    * The class should have a public `toString()` method that returns a `String` like `Fred is 1.9m tall and is 87.0Kg and has a BMI of 24.099722991689752Kg/m^2` (just print the `double`s without special formatting).
    * Implement this class (if you wish you may implement a main method that demonstrates its use).
     */
    String name;
    double weight,height;

    BMI(String name, double height, double weight) {
        this.name=name;
        this.height=height;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return String.format("%s is "+this.height+"m tall and is "+this.weight+"Kg and has a BMI of "+this.getBMI()+"Kg/m^2",this.name);
    }

    double getBMI() {
        return this.weight / Math.pow(this.height,2);
    }

}
