package JavaZadaniaKubiak.Chapter3.Zadanie38;

public class Zadanie38 {

    public static void main(String[] args) {

        int i = 1;
        int count = 0;

        do{
            count+= i;
             i++;

        }while(i <= 100);

        System.out.println("Score is : " + count);
    }
}
