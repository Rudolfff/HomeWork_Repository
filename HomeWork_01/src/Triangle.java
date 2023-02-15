public class Triangle extends Figure{
    double Side_1;
    double Side_2;
    double Side_3;

    public Triangle(double side_1, double side_2, double side_3) {
        super(Math.sqrt((side_1 + side_2 + side_3) / 2 * ((side_1 + side_2 + side_3) / 2 - side_1) * ((side_1 + side_2 + side_3) / 2 - side_2) * ((side_1 + side_2 + side_3) / 2 - side_3)) , side_1 + side_2 + side_3);
        Side_1 = side_1;
        Side_2 = side_2;
        Side_3 = side_3;
    }

    public double getSide_1() {
        return Side_1;
    }

    public double getSide_2() {
        return Side_2;
    }

    public double getSide_3() {
        return Side_3;
    }
}
