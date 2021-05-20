import java.util.NoSuchElementException;
import java.util.Scanner;

public  class Operation implements Shape {
    private float side1, side2, side3, radius;
    private int shape;
    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Jestem kalkulatoorem obwodu i pola prostokątu, trójkąnta oraz kola");
        System.out.println("wybierz ksztalt " + Shape.RECTANGLE + "-prostokąt " + Shape.TRIANGLE + "-trzykąt " + Shape.CIRCLE + "-koło");
        boolean s=false;
        shape = scanner.nextInt();
        switch (shape) {
            case RECTANGLE:
                System.out.println("Wpisz pirszą strone");
                side1 = scanner.nextFloat();
                System.out.println("Wpisz drugą strone");
                side2 = scanner.nextFloat();
                Rectangle rectangle = new Rectangle(side1, side2);
                rectangle.area();
                rectangle.perimeter();
                System.out.println(rectangle.toString());
                break;
            case TRIANGLE:
                System.out.println("Wpisz pirszą strone");
                side1 = scanner.nextFloat();
                System.out.println("Wpisz drugą strone");
                side2 = scanner.nextFloat();
                System.out.println("Wpisz trzecia strone");
                side3 = scanner.nextFloat();
                Triangle triangle = new Triangle(side1, side2, side3);
                triangle.area();
                System.out.println(triangle.toString());
            case CIRCLE:
                System.out.println("Wpisz radius");
                radius = scanner.nextFloat();
                Circle circle = new Circle(radius);
                circle.perimeter();
                circle.area();
                System.out.println( circle.toString());
        }
        scanner.close();



    }


    @Override
    public void area() {

    }

    @Override
    public void perimeter() {

    }
}




