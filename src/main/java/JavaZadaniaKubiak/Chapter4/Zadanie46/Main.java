package JavaZadaniaKubiak.Chapter4.Zadanie46;

public class Main {

    public static void main(String[] args) {

        int n = 10;

        int sum = 0;

        int table[][] = new int[10][10];

        for(int i =0; i<table.length; i++){
            for(int j=0; j<table.length; j++)
                if(n == i + j + 1){
                    table[i][j] = 1;
                }else
                    table[i][j] = 0;
        }

        for(int i = 0; i<table.length ; i++){
            for(int j = 0; j<table.length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        for(int i = 0; i < table.length; i++){
            for(int j=0; j<table.length; j++){
                sum += table[i][j];
            }
        }

        System.out.println(sum);

    }
}
