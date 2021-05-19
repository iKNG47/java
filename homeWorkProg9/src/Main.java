import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3, radius;
        System.out.println("Jestem kalkulatoorem obwodu i pola prostokątu, trójkąnta oraz kola");
        while (true) {
            System.out.println("wybierz ksztalt 1-prostokąt 2-trzykąt 3-koło");
            int choice = scanner.nextInt();
            System.out.println("Co chcesz obliczyc 1-pole 2-obwód");
            int choice1 = scanner.nextInt();
            if (choice == 1 && choice1 == 1) {
                System.out.println("Wpisz pirszą strone");
                side1 = scanner.nextDouble();
                System.out.println("Wpisz drugą strone");
                side2 = scanner.nextDouble();
                MathOperation rectangle = new MathOperation(side1, side2);
                rectangle.areaShow();
            }
            if (choice == 1 && choice1 == 2) {
                System.out.println("Wpisz pirszą strone");
                side1 = scanner.nextDouble();
                System.out.println("Wpisz drugą strone");
                side2 = scanner.nextDouble();
                MathOperation rectangle1 = new MathOperation(side1, side2);
                rectangle1.perimeterShow();
            }
            if (choice == 2 && choice1 == 1) {
                System.out.println("Wpisz pirszą strone");
                side1 = scanner.nextDouble();
                System.out.println("Wpisz drugą strone");
                side2 = scanner.nextDouble();
                System.out.println("Wpisz trzecia strone");
                side3 = scanner.nextDouble();
                MathOperation triangle = new MathOperation(side1, side2, side3);
                triangle.areaShowTriangle();
            }
            if (choice == 2 && choice1 == 2) {
                System.out.println("Wpisz pirszą strone");
                side1 = scanner.nextDouble();
                System.out.println("Wpisz drugą strone");
                side2 = scanner.nextDouble();
                System.out.println("Wpisz trzecia strone");
                side3 = scanner.nextDouble();
                MathOperation triangle = new MathOperation(side1, side2, side3);
                triangle.areaShowTriangle();
            }
            if (choice == 3 && choice1 == 1) {
                System.out.println("Wpisz radius");
                radius = scanner.nextDouble();
                MathOperation circle = new MathOperation(radius);
                circle.areaShowCircle();
            }
            if (choice == 3 && choice1 == 2) {
                System.out.println("Wpisz radius");
                radius = scanner.nextDouble();
                MathOperation circle = new MathOperation(radius);
                circle.areaShowCircle();
            }
        }
    }
}
