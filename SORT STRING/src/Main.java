import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> signList = new ArrayList<String>();
        Scanner scanner =new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("wpisz");
            signList.add(scanner.nextLine());
        }
        System.out.println("przsed "+signList);


        Collections.sort(signList);
        System.out.println("Po "+signList);

    }
}
