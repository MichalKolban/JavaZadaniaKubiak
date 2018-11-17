package JavaZadaniaKubiak.ChapterThree.Zadanie312;

public class Main {

    public static void main(String[] args) {

        int i = 1;
        int count = 0;

        while(i <= 100){
            if(i%2 == 0)
                count += i;
            i++;
        }

        System.out.println(count);
    }
}
