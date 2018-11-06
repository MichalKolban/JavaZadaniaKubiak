package JavaZadaniaKubiak.ChapterOne.Zadanie11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first size of ractangle");
        double a = scanner.nextDouble();

        System.out.println("Enter second size of ractangle");
        double b = scanner.nextDouble();

        double ractangle = a * b;


        System.out.println("Filed of Ractangle is : " + ractangle);
    }
}
