import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        if else  else-if
        int healtBar = 20;

        if (healtBar > 50) {
            System.out.println("Masih Hidup");
        } else if (healtBar > 0) {
            System.out.println("Kritis, Cari Medkit");
        } else {
            System.out.println("Game Over!");
        }

//        switch case
        System.out.println("-----Menu Makan-----");
        System.out.println("1. Ayam Goreng");
        System.out.println("2. Ayam Geprek");
        System.out.println("3. Ayam Pangang");
        System.out.println("--------------------");
        System.out.print("Pilih Menu: ");
        int menuMakan = input.nextInt();
        switch (menuMakan) {
            case 1:
                System.out.println("Ayam Goreng");
                break;
            case 2:
                System.out.println("Ayam Geprek");
                break;
            case 3:
                System.out.println("Ayam Pangang");
                break;
            default:
                System.out.println("Menu tidak ada!");
        }
    }
}
