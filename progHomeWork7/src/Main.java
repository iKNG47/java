import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
        System.out.println("Wprowadz dowolny text:");
        String inputUsersText;
        inputUsersText = scanner.nextLine();

            char firstChar = inputUsersText.charAt(0);

            if (Character.isUpperCase(firstChar)) {
                System.out.println(inputUsersText.toUpperCase(Locale.ROOT));
            } else if ((Character.isLowerCase(firstChar))) {
                System.out.println(inputUsersText.toLowerCase(Locale.ROOT));
            } else {
                System.out.println(inputUsersText);
            }
        }
    }
}