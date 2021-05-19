public class MathOperation implements MathBasicOperation{
    private double side1,side2,side3, radius;


    public MathOperation(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public MathOperation(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public MathOperation(double radius) {
        this.radius = radius;
    }

    @Override
    public void areaShow() {
        double area=side1*2+side2*2;
        System.out.println("Area is "+area);
    }

    @Override
    public void perimeterShow() {
        double perimeter=side1*side2;
        System.out.println("Perimeter is "+perimeter);

    }

    @Override
    public void areaShowTriangle() {
        double s=(side1+side2+side3)/2;
        double areaShowTriangle=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("Area of triangle is "+areaShowTriangle);
    }

    @Override
    public void areaShowCircle() {
        double areaCircle=PI*Math.pow(radius, 2);
        System.out.println("Area of circle is "+areaCircle);
    }

    @Override
    public void perimeterShowTriangle() {
        double perimeter=side1*side2*side3;
        System.out.println("Perimeter of triangle is "+perimeter);
    }

    @Override
    public void perimeterShowCircle() {
        double perimeterCircle=2*PI*radius;
        System.out.println("Perimeter of circle is "+perimeterCircle);

    }
}
