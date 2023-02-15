public class Circle extends Figure{
    static final double pi = 3.14159265359;
    double Radius;

    public Circle(double radius) {
        super(pi * Math.pow(radius, 2), 2 * pi * radius);
        Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }
}
