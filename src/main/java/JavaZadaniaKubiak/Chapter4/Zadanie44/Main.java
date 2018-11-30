package JavaZadaniaKubiak.Chapter4.Zadanie44;

public class Main {

    public static void main(String[] args) {

        int table[][] = new int[10][10];
        int sum = 0;

        for(int i =0; i < table.length; ++i){
            for(int j = 0; j<table.length; ++j){
                if(i == j)
                    table[i][j] = i;                    // i jest za każdym razem podmieniane na kolejny element tabeli
                else
                    table[i][j] = 0;
            }
        }

        for(int i = 0; i< table.length; i++){
            for(int j = 0; j<table.length; j++){
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }

        for(int i=0; i<table.length; i++){
            for(int j = 0; j<table.length; j++)
            sum += table[i][j];
        }

        System.out.println();

        System.out.println("Suma wynosi : " + sum);
    }
}
