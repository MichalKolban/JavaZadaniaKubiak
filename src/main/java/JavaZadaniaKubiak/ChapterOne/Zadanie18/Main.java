package JavaZadaniaKubiak.ChapterOne.Zadanie18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        double a, b, ractangle;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {


            System.out.println("Enter first size of ractangle");
            a = Double.parseDouble(bufferedReader.readLine());

            System.out.println("Enter second size of ractangle");
            b = Double.parseDouble(bufferedReader.readLine());

            ractangle = a * b;


            System.out.println("Filed of Ractangle is : " + ractangle);
        } catch (NumberFormatException num){
            System.out.println("you probably enter wrong number");
        }
    }
}
