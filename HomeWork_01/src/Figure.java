public abstract class Figure {
    double FigureArea;
    double FigurePerimeter;

    public Figure(double FigureArea, double FigurePerimeter) {
    this.FigureArea = FigureArea;
    this.FigurePerimeter = FigurePerimeter;
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
