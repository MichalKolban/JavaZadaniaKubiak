package JavaZadaniaKubiak.Chapter3.Zadanie311;

public class Main {

    public static void main(String[] args) {

        int i = 1;
        int count = 0;

        do{
            if(i%2==0)
                count += i;
                i++;

        }while (i <= 100);

        System.out.println("Score is : " + count);


    }
}
