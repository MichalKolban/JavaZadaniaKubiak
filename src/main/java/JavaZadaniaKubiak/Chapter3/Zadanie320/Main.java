package JavaZadaniaKubiak.Chapter3.Zadanie320;

public class Main {
    public static void main(String[] args) {

        int i = 1;

        do{
            int j = 1;
            do{
                System.out.print(i * j + "\t");
                j++;
            }while (j <=10);
            i++;
            System.out.println();
        }while (i <= 10);
    }
}
