public class Method {

    static void pukulanApi(String musuh) {
        System.out.println("Hiaaat! Pukulan Api membakar " + musuh + "!\uD83D\uDD25");
    }

    static int hitungDamage(int baseDamage){
        baseDamage = baseDamage + 10;
        return baseDamage;
    }

    static void sapa(){
        System.out.println("Halo, user!");
    }

    static String sapa(String nama){
        return "Halo " + nama;
    }

    public static void main(String[] args) {
        pukulanApi("Slime");
        pukulanApi("Raja Iblis");

        System.out.println(hitungDamage(100));

        sapa();
        System.out.println(sapa("Rangga"));

    }
}
