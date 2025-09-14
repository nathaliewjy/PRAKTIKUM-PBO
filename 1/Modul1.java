import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Jurusan {

    String kode;
    String jurusan;
    ArrayList<Matkul> listMatkul;

    public Jurusan(String kode, String jurusan) {
        this.kode = kode;
        this.jurusan = jurusan;
        this.listMatkul = new ArrayList<>();
    }
}

class Mahasiswa {

    String NIM;
    String nama;
    Jurusan jurusan;
    Map<Matkul, String> indeksNilai;

    public Mahasiswa(String NIM, String nama, Jurusan jurusan) {
        this.NIM = NIM;
        this.nama = nama;
        this.jurusan = jurusan;
        this.indeksNilai = new HashMap<>();
    }
}

class Matkul {

    String kode;
    String matkul;
    int SKS;

    public Matkul(String kode, String matkul, int SKS) {
        this.kode = kode;
        this.matkul = matkul;
        this.SKS = SKS;
    }
}

public class Modul1 {

    private static ArrayList<Jurusan> listJurusan = new ArrayList<>();
    private static ArrayList<Matkul> listMatkul = new ArrayList<>();
    private static ArrayList<Mahasiswa> listMaba = new ArrayList<>();
    private static final Map<String, Integer> indeksNilaiMap = Map.of("A", 4, "B", 3, "C", 2, "D", 1, "E", 0);

    // tambah jurusan
    public static String tambahJurusan(String kodeJ, String namaJ) {
        Jurusan jurusanBaru = new Jurusan(kodeJ, namaJ);
        listJurusan.add(jurusanBaru);

        return "Berhasil add " + jurusanBaru.jurusan;
    }

    // liat jurusan
    public static void lihatJurusan() {
        if (listJurusan.isEmpty()) {
            System.out.println("Gaada jurusan");
        } else {
            System.out.println("List jurusan : ");
            for (Jurusan j : listJurusan) {
                System.out.println(j.jurusan);
            }
        }
    }

    // hapus jurusan
    public static String hapusJurusan(String kodeJ) {
        int indexHapus = -1;
        for (int i = 0; i < listJurusan.size(); i++) {
            if (listJurusan.get(i).kode.equals(kodeJ)) {
                indexHapus = i;
                break;
            }
        }

        if (indexHapus != -1) {
            String namaJ = listJurusan.get(indexHapus).jurusan;
            listJurusan.remove(indexHapus);

            return "Berhasil hapus " + namaJ;
        }

        return "Gagal";
    }

    // tambah matkul
    public static String tambahMatkul(String kodeMK, String namaMK, int SKS) {
        Matkul matkulBaru = new Matkul(kodeMK, namaMK, SKS);
        listMatkul.add(matkulBaru);

        return "Berhasil add " + matkulBaru.matkul;
    }

    // hapus matkul
    public static String hapusMatkul(String kodeMK) {
        int indexHapus = -1;
        for (int i = 0; i < listMatkul.size(); i++) {
            if (listMatkul.get(i).kode.equals(kodeMK)) {
                indexHapus = i;
                break;
            }
        }

        if (indexHapus != -1) {
            String namaMK = listMatkul.get(indexHapus).matkul;
            listMatkul.remove(indexHapus);

            return "Berhasil hapus " + namaMK;
        }

        return "Gagal";
    }

    // tambah matkul ke jurusan
    public static String tambahMkeJ(String kodeMK, String kodeJ) {
        Matkul matkul = null;
        Jurusan jurusan = null;

        for (int i = 0; i < listMatkul.size(); i++) {
            if (listMatkul.get(i).kode.equals(kodeMK)) {
                matkul = listMatkul.get(i);
                break;
            }
        }

        for (int i = 0; i < listJurusan.size(); i++) {
            if (listJurusan.get(i).kode.equals(kodeJ)) {
                jurusan = listJurusan.get(i);
                break;
            }
        }

        jurusan.listMatkul.add(matkul);

        return "Berhasil add " + matkul.matkul;
    }

    // tambah maba
    public static String tambahMaba(String NIM, String nama, String kodeJ) {
        Jurusan jurusan = null;

        for (int i = 0; i < listJurusan.size(); i++) {
            jurusan = listJurusan.get(i);
            break;
        }

        Mahasiswa maba = new Mahasiswa(NIM, nama, jurusan);
        listMaba.add(maba);

        return "Berhasil add " + maba.nama;
    }

    // liat maba
    public static void lihatMaba() {
        if (listMaba.isEmpty()) {
            System.out.println("Kosong");
        } else {
            System.out.println("List maba : ");
            for (int i = 0; i < listMaba.size(); i++) {
                Mahasiswa maba = listMaba.get(i);
                System.out.println(i + 1 + "NIM : " + maba.NIM + " Nama : " + maba.nama + " Jurusan : " + maba.jurusan.jurusan);
            }
        }
    }

    // detail maba
    public static void detailMaba(String NIM) {
        Mahasiswa maba = null;

        for (int i = 0; i < listMaba.size(); i++) {
            if (listMaba.get(i).NIM.equals(NIM)) {
                maba = listMaba.get(i);
                break;
            }
        }

        System.out.println("Detail maba : ");
        System.out.println("NIM : " + maba.NIM);
        System.out.println("Nama : " + maba.nama);
        System.out.println("Jurusan : " + maba.jurusan.jurusan);
    }

    // nilai sesuai matkul yg diambil
    public static String hitungNilai(String NIM, String kodeMK, String nilai) {
        Mahasiswa maba = null;
        Matkul matkul = null;

        for (int i = 0; i < listMaba.size(); i++) {
            if (listMaba.get(i).NIM.equals(NIM)) {
                maba = listMaba.get(i);
                break;
            }
        }

        for (int i = 0; i < listMatkul.size(); i++) {
            if (listMatkul.get(i).kode.equals(kodeMK)) {
                matkul = listMatkul.get(i);
                break;
            }
        }

        maba.indeksNilai.put(matkul, nilai);
        return "Berhasil memberi nilai : " + nilai;
    }

    // ngitung IP berdasarkan nilai matkul
    public static void hitungIP(String NIM) {
        Mahasiswa maba = null;

        for (int i = 0; i < listMaba.size(); i++) {
            if (listMaba.get(i).NIM.equals(NIM)) {
                maba = listMaba.get(i);
                break;
            }
        }

        double totalNilai =  0;
        int totalSKS = 0;

        for (Map.Entry<Matkul, String> entry : maba.indeksNilai.entrySet()) {
            Matkul matkul = entry.getKey();
            String nilai = entry.getValue();
            int indeks = indeksNilaiMap.getOrDefault(nilai, 0);
            
            totalNilai += indeks * matkul.SKS;
            totalSKS += matkul.SKS;
        }

        double IP = totalNilai / totalSKS;
        System.out.println("IP " + maba.nama + " : " + IP);
    }

    public static void main(String[] args) {
        System.out.println(tambahJurusan("IF", "Teknik Informatika"));
        System.out.println(tambahJurusan("SI", "Sistem Informasi"));

        System.out.println();
        lihatJurusan();
        System.out.println();

        System.out.println(hapusJurusan("SI"));

        System.out.println();
        lihatJurusan();
        System.out.println();

        System.out.println(tambahMatkul("PBO", "Pemrograman Berorientasi Objek", 4));
        System.out.println(tambahMkeJ("PBO", "IF"));
        System.out.println();

        System.out.println(tambahMaba("1124001", "Nathalie", "IF"));
        System.out.println(tambahMaba("1124002", "Shinta", "SI"));

        System.out.println();
        lihatMaba();
        System.out.println();

        detailMaba("1124001");
        System.out.println();

        System.out.println(hitungNilai("1124001", "PBO", "A"));
        hitungIP("1124001");
        System.out.println();
    }
}
