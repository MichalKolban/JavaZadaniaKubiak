package JavaZadaniaKubiak.Chapter2.Zadanie21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter first lenght");

        int first = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter second length");

        int two = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter third length");

        int three = Integer.parseInt(bufferedReader.readLine());

        if((first * first + two * two) == three * three){
            System.out.println("triangle of length a : " + first);
            System.out.println("triangle of length b : " + two);
            System.out.println("triangle of length c : " + three);
            System.out.println("is ractangular");
        }else {
            System.out.println("triangle of length a : " + first);
            System.out.println("triangle of length b : " + two);
            System.out.println("triangle of length c : " + three);
            System.out.println(" is NOT ractangular");
        }
    }
}
