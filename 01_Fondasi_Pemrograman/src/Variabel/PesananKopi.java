package Variabel;
import java.util.Scanner;

public class PesananKopi {
    public static void main(String[] args) {
        String namaPelanggan = "Rangga";
        String jenisKopi = "Latte";
        int jumlahPesanan = 2;
        int jumlahGula = 1;
        boolean isReady = true;

        System.out.println("Pesanan: " + jenisKopi + ", gula: "+ jumlahGula + "g" + ", jumlah: " + jumlahPesanan +
                ", ketersediaan: " + isReady + ", atas nama: " + namaPelanggan);
    }
}
