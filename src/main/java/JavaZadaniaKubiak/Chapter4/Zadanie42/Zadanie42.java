package JavaZadaniaKubiak.Chapter4.Zadanie42;

public class Zadanie42 {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = 10 - 1 - i;
            System.out.println("[ " + i + " ]  = " + numbers[i]);
        }
    }
}
