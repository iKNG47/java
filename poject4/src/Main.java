
import model.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("wprowadz liczbe(od 0 do 2)\n1 - zapisz pacjenta\n2 - wyświetlić wszystkich pacijentów\n0 - skoncz program");
        Scanner scanner = new Scanner(System.in);
        int sw = scanner.nextInt();

            switch (sw) {
                case 0:
                    model.Hospital1.Exit();
                case 1:
                    if (model.Hospital1.getDocList().size() > 10) {
                        System.out.println("maksymalina liczba pacijentów");
                        model.Hospital1.Exit();
                    }
                    System.out.println("Wpisz imie:");
                    String firstName = scanner.nextLine();
                    System.out.println("Wpisz nazwisko:");
                    String lastName = scanner.nextLine();
                    System.out.println("Wpisz PESEL:");
                    String personalIdentityNumber = scanner.nextLine();
                    Patient patient = new Patient(firstName, lastName, personalIdentityNumber);
                case 2:
                    Hospital1 hospital1 = new Hospital1();
                    hospital1.getList();
                 break;
            }
        }
    }

