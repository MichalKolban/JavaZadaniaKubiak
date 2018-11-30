package JavaZadaniaKubiak.Chapter2.Zadanie22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double a,b,c,delta,x1,x2;

        System.out.println("Program oblicza pierwiastek równiania ax^2+bx+c");
        System.out.println("Podaj a");
        a = Double.parseDouble(bufferedReader.readLine());

        if(a == 0){
            System.out.println("Błędny parametr");
        }else
            System.out.println("Podaj b");
        b = Double.parseDouble(bufferedReader.readLine());
        if(b == 0){
            System.out.println("Błędny parametr");
        }else
            System.out.println("Podaj c");
            c = Double.parseDouble(bufferedReader.readLine());

        delta = b*b - 4*a*c;

        if(delta < 0){
            System.out.println("Brak pierwiastków rzeczywistych");
        }else
            if(delta == 0){
                x1 = -b/(2*a);
                System.out.println("Dla a = " + a);
                System.out.println("Dla b = " + b);
                System.out.println("Dla c = " + c);
                System.out.println("Trójmian ma jeden pierwiastek " + x1);
            }else {
            x1 = (-b-Math.sqrt(delta))/(2*a);
            x2 = (-b+Math.sqrt(delta))/(2*a);
                System.out.println("Trójmian ma 2 pierwiastki");
                System.out.println("Pierwszy " + x1);
                System.out.println("Drugi " + x2);
            }


    }
}
