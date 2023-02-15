public class Rectangle extends Quadrangular{
    public Rectangle(double side_1, double side_2) {
        super(side_1 * side_2, (side_1 + side_2) * 2, side_1, side_2, side_1, side_2);
    }
}
