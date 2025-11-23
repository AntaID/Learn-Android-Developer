public class Variabel_TipeData {
    public static void main(String[] args) {

        String nama = "Ahmad Anta";
        int umur = 19;
        double tingiBadan = 176;
        char inisialNamaDepan = 'A';
        boolean ststusKuliah = true;

        System.out.println("--- DATA DIRI AWAL ---");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Tinggi: " + tingiBadan);
        System.out.println("Inisial: " + inisialNamaDepan);
        System.out.println("Status Aktif: " + ststusKuliah);

        int umurKembaran = umur;
        String namaKembaran = nama;
        umur = 25;
        nama = "Rangga";

        System.out.println("--- DATA DIRI UPDATE ---");
        System.out.println("Nama: " +nama);
        System.out.println("Nama Kembaran: " +namaKembaran);

        System.out.println("Umur Asli: " +umur);
        System.out.println("Umur Kembaran: " +umurKembaran);
    }
}
