public class OOP {
    public static void main(String[] args) {
        Player hero = new Player("Yuki", 80, 100);
        Player p1 = new Player("Rangga", 90, 100);

        System.out.println(" ");
        System.out.println("--- PERTARUNGAN DIMULAI ---");
        p1.serang(hero);
        hero.serang(p1);

        }
    }

class Player {
    String nama;
    int speed;
    int healtPoin;

    Player(String nama, int speed, int healtPoin){
        this.nama = nama;
        this.speed = speed;
        this.healtPoin = healtPoin;
        System.out.println("Player " + nama + " berhasil dibuat!");
    }
    void lari(){
        System.out.println(nama + " sedang berlari secepat " + speed + " km/jam!");
    }

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
