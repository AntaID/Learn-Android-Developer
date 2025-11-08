public class Operator {
    public static void main(String[] args) {
        int angka = 3;
        if (angka % 2 == 0){
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }

        int nilai = 80;
        if (nilai <= 75){
            System.out.println("Tidak lulus");
        } else {
            System.out.println("Lulus");
        }

        if (nilai != 90) {
            System.out.println("B");
        }

        int angka1 = 80;

        if (angka1 >= 75 && angka1 <= 80) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }

        boolean lapar = false;
        boolean punyaMakanan = true;

        if (lapar || punyaMakanan) {
            System.out.println("Anda bisa makan");
        } else {
            System.out.println("Anda tidak bisa makan");
        }

        boolean punyaUang = true;
        if (!punyaUang) {
            System.out.println("Kerja!");
        } else {
            System.out.println("Santai");
        }
    }
}
