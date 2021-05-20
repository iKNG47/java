
public  class Circle implements Shape {
    float radius, area, perimeter;

    public Circle(float radius) {
        this.radius = radius;
    }
    @Override
    public void perimeter() {
        float perimeterCircle=2*PI*radius;
        this.perimeter= (float) perimeter;
    }

    @Override
    public void area() {
        float area=2*PI*radius;
        this.area=area;
    }

    @Override
    public String toString() {
        return "Kolo" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
