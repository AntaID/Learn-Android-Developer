import java.util.Scanner;
import java.util.Random;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random acak = new Random();

//        for
//        for (int i = 10; i >= 1; i--) {
//            System.out.println("Penerbangan Roket dalam : " + i);
//        }
//        System.out.println("GO! Meluncur ke angkasa!");
//
//        while
//        int energy = 5;
//        while (energy >0) {
//            System.out.println("Sedang Push Up... Energi tersisa: " + energy);
//            energy--;
//        }
//        System.out.println("Capek! Butuh istirahat.");

//        game tebak angka

        int angkaRahasia = acak.nextInt(10) + 1;
        int tebakanUser;

        System.out.println("=== GAME TEBAK ANGKA ===");
        System.out.println("Komputer sudah memilih angka 1 s/d 10.");
        System.out.println("Coba tebak!");

        do {
            System.out.print("Tebak angka (1-10): ");
            tebakanUser = input.nextInt();
            if (tebakanUser == angkaRahasia) {
                System.out.println("🎉 HEBAT! Tebakan kamu benar: " + angkaRahasia);
            } else if (tebakanUser > angkaRahasia){
                System.out.println("Terlalu besar! Coba lagi.");
            } else {
                System.out.println("Terlalu kecil! Coba lagi.");
            }

        } while (tebakanUser != angkaRahasia);
    }
}
