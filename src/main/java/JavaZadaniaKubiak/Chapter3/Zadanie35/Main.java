package JavaZadaniaKubiak.Chapter3.Zadanie35;

public class Main {

    public static void main(String[] args) {

        int i = 1;

        do{
            if(i < 20){
                System.out.print(i+",");
            }else {
                System.out.println(i+".");
            }i++;
        }while (i <= 20);
    }
}
