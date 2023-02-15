public abstract class Quadrangular extends Figure {
    double Side_1;
    double Side_2;
    double Side_3;
    double Side_4;

    public Quadrangular(double FigureArea, double FigurePerimeter, double side_1, double side_2, double side_3, double side_4) {
        super(FigureArea, FigurePerimeter);
        Side_1 = side_1;
        Side_2 = side_2;
        Side_3 = side_3;
        Side_4 = side_4;
        if (Side_1 <= 0 || Side_2 <= 0 || Side_3 <= 0 || Side_4 <= 0) {
            throw new RuntimeException("Сторона в четырехугольнике не может быть меньше или равной 0");
        }
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

    public double getSide_4() {
        return Side_4;
    }
}
