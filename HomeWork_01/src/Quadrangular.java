public abstract class Quadrangular extends Figure {
    double Side_1;
    double Side_2;
    double Side_3;
    double Side_4;
    double Angel_1;
    double Angel_2;
    double Angel_3;
    double Angel_4;

    public Quadrangular() {
        super();
        double Side_1 = 1;
        double Side_2 = 1;
        double Side_3 = 1;
        double Side_4 = 1;
        double Angel_1 = 90;
        double Angel_2 = 90;
        double Angel_3 = 90;
        double Angel_4 = 90;

        if (Angel_1 + Angel_2 + Angel_3 + Angel_4 != 360) {
            throw new RuntimeException("Сумма углов четырехугольника не должна превышать 360 градусов");
        }
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

    public double getAngel_1() {
        return Angel_1;
    }

    public double getAngel_2() {
        return Angel_2;
    }

    public double getAngel_3() {
        return Angel_3;
    }

    public double getAngel_4() {
        return Angel_4;
    }
}
