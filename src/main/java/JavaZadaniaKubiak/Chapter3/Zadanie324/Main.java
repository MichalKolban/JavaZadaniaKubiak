package JavaZadaniaKubiak.Chapter3.Zadanie324;

public class Main {
    public static void main(String[] args) {

        char sign = 'A';

        while (sign <= 'Z'){
            if(sign < 'Z'){
                System.out.print(sign + ", ");
            }else {
                System.out.print(sign + ". ");
            }
            sign++;
        }

        System.out.println();

        char sign2 = 'Z';

        while(sign2 >= 'A'){
            if(sign2 > 'A'){
                System.out.print(sign2 + ", ");
            }else {
                System.out.print(sign2 + ". ");
            }
            sign2--;
        }
    }
}
