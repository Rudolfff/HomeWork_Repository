public abstract class Figure {
    double FigureArea;
    double FigurePerimeter;

    public Figure() {
    }

    public double getFigureArea() {
        return FigureArea;
    }

    public double getFigurePerimeter() {
        return FigurePerimeter;
    }

    protected void setFigureArea(double figureArea) {
        FigureArea = figureArea;
    }

    protected void setFigurePerimeter(double figurePerimeter) {
        FigurePerimeter = figurePerimeter;
    }
}
