package JavaZadaniaKubiak.Chapter3.Zadanie323;

public class Main {

    public static void main(String[] args) {

        char sign = 'A';

        do {
            if (sign < 'Z') {
                System.out.print(sign + ", ");
            } else
                System.out.print(sign + ". ");
            sign++;
        } while (sign <= 'Z');

        System.out.println();

        char sign2 = 'Z';

        do{
            if(sign2 > 'A'){
                System.out.print(sign2 + ", ");
        } else
                System.out.print(sign2 + ". ");
            sign2--;
        }while (sign2 >= 'A');
    }
}
