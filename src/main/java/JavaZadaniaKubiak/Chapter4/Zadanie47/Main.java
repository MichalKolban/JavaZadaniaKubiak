package JavaZadaniaKubiak.Chapter4.Zadanie47;

public class Main {

    public static void main(String[] args) {

        int table[][] = new int[10][10];

        int sum = 0;

        int sum2 = 0;

        for(int i = 0; i<table.length; i++){
            for(int j = 0; j<table.length; j++){
                if(j == 0) table[i][j] = i;
                if(j == 1) table[i][j] = i * i;
                if(j > 1)table[i][j] = 0;
            }
        }

        for(int i=0; i < table.length; i++){
            for(int j=0; j<table.length; j++){
                System.out.print(table[i][j] + "\t");
            }
            System.out.println();
        }

        for(int i=0; i<table.length ; i++){         // oblicza sume w kolumnie [0]
            sum += table[i][0];
        }
        System.out.println(sum);

        for(int i=0; i<table.length; i++){          // oblicza sume w kolumnie [1]
            sum2+= table[i][1];
        }
        System.out.println(sum2);
    }
}
