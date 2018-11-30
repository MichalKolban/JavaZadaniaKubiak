package JavaZadaniaKubiak.Chapter3.Zadanie32;

public class Main {

    public static void main(String[] args) {

        int x = 0;
        int y;

        do{
            y = 3 * x;
            System.out.println("For x = " + x + " y = 3x  is " + y );
            x++;
        }while (x <= 10);
    }
}
