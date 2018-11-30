package JavaZadaniaKubiak.Chapter4.Zadanie43;

public class Main {

    public static void main(String[] args) {

        int sum = 0;

        int table[][] = new int[10][10];

        for(int i = 0; i<table.length; i++){                        // budowanie tabeli
            for(int j = 0; j < table.length; j++){
                if( i == j){
                    table[i][j] = 1;
                }else
                    table[i][j] = 0;
            }
        }

        for(int i = 0; i < table.length; i++){                      // wyświetlanie tabeli
            for(int j = 0; j < table.length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < table.length; i++){                      // obliczanie sumy elementow z tabeli
            sum += table[i][i];
        }

        System.out.println();

        System.out.println("Suma elementów tablicy wynosi : " + sum);


    }
}
