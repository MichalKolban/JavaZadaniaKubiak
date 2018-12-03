package JavaZadaniaKubiak.Chapter4.Zadanie49;

public class Main {

    public static void main(String[] args) {



        int table1[][] = new int[10][10];

        int table2[][] = new int[10][10];

        int table3[][] = new int[10][10];


        for(int i=0; i<table1.length; i++){
            for(int j = 0; j<table1.length; j++){
                table1[i][j] = 1;
            }
        }

        for(int i=0; i<table2.length; i++){
            for(int j=0; j<table2.length; j++){
                table2[i][j] = 2;
            }
        }

        for(int i = 0; i<table1.length; i++){
            for(int j=0; j<table1.length; j++){
                System.out.print(table1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        for(int i=0; i<table2.length; i++){
            for(int j =0; j<table2.length; j++){
                System.out.print(table2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("Table C = Table A + Table B");
        System.out.println();

        for(int i = 0; i<table3.length; i++){
            for(int j = 0; j<table2.length; j++){
                table3[i][j] = table1[i][j] + table2[i][j];
            }
        }

        for(int i = 0; i<table3.length; i++){
            for(int j = 0; j<table3.length; j++){
                System.out.print(table3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
