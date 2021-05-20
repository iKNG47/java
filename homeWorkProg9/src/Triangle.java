public  class Triangle implements Shape {
    float side1, side2, side3,area,perimeter;

    public Triangle(float side1, float side2, float side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public void area() {
        float s=(side1+side2+side3)/2;
        float areaTriangle= (float) Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        this.area=area;

    }
    @Override
    public void perimeter() {
        double perimeter=side1*side2*side3;
        this.perimeter= (float) perimeter;

    }
}


