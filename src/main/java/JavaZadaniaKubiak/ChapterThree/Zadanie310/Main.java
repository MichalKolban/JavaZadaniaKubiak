package JavaZadaniaKubiak.ChapterThree.Zadanie310;

public class Main {

    public static void main(String[] args) {

        int count = 0;

        for(int i = 1 ; i <= 100; i++ ){
            if(i % 2 == 0){
                count += i;
            }
        }
        System.out.println("Score is : " + count);
    }
}
