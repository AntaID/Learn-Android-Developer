import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char[][] ticTacToe = new char[3][3];

        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe.length; j++) {
                ticTacToe[i][j] = '-';
            }
        }

        for (int i = 0; i < ticTacToe.length; i++) {
            for (int j = 0; j < ticTacToe[i].length; j++) {
                System.out.print(ticTacToe[i][j] + "  ");
            }
            System.out.println();
        }

        char giliran = 'X';

        while (true) {
            System.out.print("Masukan baris: ");
            int baris = input.nextInt();
            System.out.print("Masukan kolom: ");
            int kolom = input.nextInt();


            ticTacToe[baris][kolom] = giliran;

            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < ticTacToe[i].length; j++) {
                    System.out.print(ticTacToe[i][j] + "  ");
                }
                System.out.println();

            }
            if (ticTacToe[baris][0] == giliran && ticTacToe[baris][1] == giliran && ticTacToe[baris][2] == giliran) {
                System.out.println("Hore! Kamu Menang!");
                break;
            }
            if (ticTacToe[0][kolom] == giliran && ticTacToe[1][kolom] == giliran && ticTacToe[2][kolom] == giliran) {
                System.out.println("Hore! Kamu Menang!");
                break;
            }
            if (ticTacToe[0][0] == giliran && ticTacToe[1][1] == giliran && ticTacToe[2][2] == giliran) {
                System.out.println("Hore! Kamu Menang!");
                break;
            }
            if (ticTacToe[0][2] == giliran && ticTacToe[1][1] == giliran && ticTacToe[2][0] == giliran) {
                System.out.println("Hore! Kamu Menang!");
                break;
            }

            boolean papanPenuh = true;

            for (int i = 0; i < ticTacToe.length; i++) {
                for (int j = 0; j < ticTacToe[i].length; j++) {
                    if (ticTacToe[i][j] == '-') {
                        papanPenuh = false;
                        break;
                    }
                }
                if (!papanPenuh) break;
            }
            if (papanPenuh == true) {
                System.out.println("Permainan Seri! Papan Penuh.");
                break;
            }

            if (giliran == 'X') {
                giliran = 'O';
            } else {
                giliran = 'X';
            }
        }
    }
}
