public class Method {

//    game
    static void pukulanApi(String musuh) {
        System.out.println("Hiaaat! Pukulan Api membakar " + musuh + "!\uD83D\uDD25");
    }

    static int hitungDamage(int baseDamage){
        baseDamage = baseDamage + 10;
        return baseDamage;
    }

//    menyapa
    static void sapa(){
        System.out.println("Halo, user!");
    }

    static String sapa(String nama){
        return "Halo " + nama;
    }

//    grade
    static char tentukanGrade(int nilai){
        if (nilai >= 90) {
            return 'A';
        }
        if (nilai >= 80) {
            return 'B';
        }
        if (nilai >= 75) {
            return 'C';
        }
        return 'D';
    }

    public static void main(String[] args) {
//        game
        pukulanApi("Slime");
        pukulanApi("Raja Iblis");

        System.out.println(hitungDamage(100));

//        menyapa
        sapa();
        String pesan = sapa("Rangga");
        System.out.println(pesan);

//        grade
        char input = tentukanGrade(80);
        System.out.println(input);
    }
}
