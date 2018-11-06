package JavaZadaniaKubiak.ChapterOne.Zadanie17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float x , y, sum, substract, multiply, divide;

        System.out.println("Enter the first number :");

        x = scanner.nextFloat();

        System.out.println("Enter the second number :");

        y = scanner.nextFloat();


        sum = x + y;
        substract = x - y;
        multiply = x * y;
        divide = x / y;

        System.out.println("Result of summary " + x + " + " + y);
        System.out.printf("%2.2f", + sum);
        System.out.println();
        System.out.println("Result of substract " + x + " - " + y);
        System.out.printf("%2.2f", + substract);
        System.out.println();
        System.out.println("Result of multiply " + x + " * " + y);
        System.out.printf("%2.2f", + multiply);
        System.out.println();
        System.out.println("Result of divide " + x + " / " + y);
        System.out.printf("%2.2f", + divide);
    }
}
