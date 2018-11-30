package JavaZadaniaKubiak.Chapter4.Zadanie48;

public class Main {

    public static void main(String[] args) {


        int table[][] = new int[10][10];

        int tableZero[][] = new int[10][10];

        for(int i = 0; i< table.length; i++){           // wyświetlanie tablicy pierwszej wypełnionej
            for(int j = 0; j< table.length; j++){
                System.out.print(j + "\t");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i<tableZero.length; i++){        // przepisywanie tablicy "table" do "tableZero"
            for(int j = 0; j<tableZero.length; j++){    // w taki sposób
                table[i][j] = tableZero[j][i];          // 0 0 0 0
            }                                           // 1 1 1 1  etc.
        }

        System.out.println();

        for(int i=0; i<tableZero.length; i++){              // wyswietlanie tablicy tableZero
            for(int j=0; j<tableZero.length; j++){
                System.out.print(i + "\t");                 // wyżej wyswietlałem 'j' teraz 'i' zmiana kolumn na wiersze
            }
            System.out.println();
        }
    }
}
