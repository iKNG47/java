package sumKlientNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sum=0;
        Scanner scanner= new Scanner(System.in) ;
        System.out.print("wprowadz ilość liczb: ");
        int counterOfNumbers=scanner.nextInt();
        for (int i = 0; i < counterOfNumbers; i++) {
            System.out.print("wprowadz liczbe: ");
            double numbers= scanner.nextInt();
            sum+=numbers;



        }
        System.out.println(sum);
    }


}
