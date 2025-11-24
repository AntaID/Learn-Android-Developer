import java.lang.reflect.Constructor;

public class OOP {
    public static void main(String[] args) {
        Player hero = new Player("Yuki", 80, 100);
        Player p1 = new Player("Rangga", 90, 100);
        Player p2 = new Player("Arfan");

        System.out.println(" ");
        System.out.println("--- PERTARUNGAN DIMULAI ---");

        while (! (p1.isDead()) && ! (hero.isDead())) {
            p1.serang(hero);
            if (hero.isDead()){
                break;
            }
                hero.serang(p1);
        }
        System.out.println("--- PERTARUNGAN SELESAI ---");
    }
}
//class player
class Player {
    String nama;
    int speed;
    int healtPoin;

//    Constructor 1 VIP
    Player(String nama, int speed, int healtPoin){
        this.nama = nama;
        this.speed = speed;
        this.healtPoin = healtPoin;
        System.out.println("Player VIP " + nama + " berhasil dibuat!");
    }

//    Constructor 2 Non-VIP
    Player(String nama) {
        this.nama = nama;
        this.speed = 10;
        this.healtPoin = 100;
        System.out.println("Player " + nama + " berhasil dibuat!");
    }

//    method lari
    void lari(){
        System.out.println(nama + " sedang berlari secepat " + speed + " km/jam!");
    }

//    method serang
    void serang(Player lawan) {
        lawan.healtPoin -= 10; // atau healtPoin = healtPoin - 10
        System.out.println(this.nama + " memukul " + lawan.nama + "!");
        System.out.println("HP " + lawan.nama + " tersisa " + lawan.healtPoin);
    }

    boolean isDead() {
        if (healtPoin <= 0){
            return true;
        }
        return false;
    }

}
