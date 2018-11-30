package JavaZadaniaKubiak.Chapter3.Zadanie322;

public class Main {

    public static void main(String[] args) {

        char sign;
        for(sign = 'A'; sign <='Z'; sign++){
            if (sign < 'Z')
                System.out.print(sign + ", ");
            else
                System.out.println(sign + ". ");
        }



        for(sign = 'Z'; sign >= 'A'; sign--)
            if (sign > 'A')
                System.out.print(sign + ", ");
            else
                System.out.print(sign + ". ");
    }
}
