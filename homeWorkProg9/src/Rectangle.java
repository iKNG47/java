
public class Rectangle implements Shape {
    float side1, side2, area, perimeter;

    public Rectangle(float side1, float side2) {
        this.side1 = side1;
        this.side2 = side2;
    }
    @Override
    public void area() {
        float area=side1*2+side2*2;
        this.area=area;
    }

    @Override
    public void perimeter() {
        float perimeter=side1*side2;
        this.perimeter= (float) perimeter;
    }

    @Override
    public String toString() {
        return "Prostokąt " +
                "StronaA=" + side1 +
                ", StronaB=" + side2 +
                ", Pole=" + area +
                ", Obwód=" + perimeter;
    }

}
