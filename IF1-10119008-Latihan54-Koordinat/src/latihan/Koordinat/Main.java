package latihan.Koordinat;

/*
 * @author Raihan Giffari
 *
 * Nama  : Raihan Giffari
 * Nim   : 10119008
 * Kelas : IF1
 */

public class Main {
    public static void main(String[] args) {
        WarnaKoordinat warnaKoordinat1 = new WarnaKoordinat(10, 4, "Jingga");
        System.out.printf("Warna Koordinat : %s", warnaKoordinat1.getNamaWarna());
        System.out.printf("\nKoordinat Sumbu x : %d, y : %d", warnaKoordinat1.getX(), warnaKoordinat1.getY());
    }
}