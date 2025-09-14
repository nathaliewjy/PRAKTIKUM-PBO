import java.util.Scanner;

public class Pertemuan1 {
    public String getGreeting() {
        return "Hello World";
    }

    public static double hitungNilaiAkhir(int jumlahAlpha, double nilaiAkhir) {
        if (jumlahAlpha <= 2) {
            return nilaiAkhir;
        } else {
            return nilaiAkhir - 5 * (jumlahAlpha - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Alpha : ");
        int jumlahAlpha = sc.nextInt();
        System.out.print("Nilai akhir : ");
        double nilaiAkhir = sc.nextDouble();

        double hasil = hitungNilaiAkhir(jumlahAlpha, nilaiAkhir);
        System.out.println("Alpha : " + jumlahAlpha);
        System.out.println("Nilai akhir : " + hasil);
    }
}