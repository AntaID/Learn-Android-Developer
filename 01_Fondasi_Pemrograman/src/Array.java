import java.sql.SQLOutput;

public class Array {
    public static void main(String[] args) {

        String[] inventoryGame =  {"AK47", "SCAR", "M1080"};
        inventoryGame[0] = "AK47 Gold";
        System.out.println("Senjata terpilih: " + inventoryGame[0]);

        int[][] matriks = {
                {1, 3, 5},
                {2, 4, 6}
        };
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++){
                System.out.print((matriks[i][j]) + " ");
            }
            System.out.println();
        }


    }
}
