import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan kelas: ");
        int kelas = input.nextInt();

        input.nextLine();

        System.out.print("Masukan umur anda: ");
        String umur = input.nextLine();

        int umurr = Integer.parseInt(umur);

        System.out.print("Masukan nama anda: ");
        String nama = input.nextLine();

        System.out.println("Umur anda: " + umurr + " Nama anda: " + nama + " Kelas: " + kelas);
    }
}
