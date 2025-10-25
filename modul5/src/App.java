import models.*;
import repository.MahasiswaRepository;
import repository.StaffRepository;
import views.MenuView;
import models.MahasiswaSarjana;

public class App {
    public static void main(String[] args) {

        // NOTE : IJIN BIKIN DATA DUMMY PAKE AI YAH GAKUAT
        // kata ko hans kalo data dummy boleh AI :)
// --- Dosen & Staff ---
        DosenTetap dsnTtp1 = new DosenTetap(
                10000000, "111001", "Informatika", "Dr. Budi Santoso",
                "Jl. Mawar No. 10", "Bandung", "19/05/1975", "081123123");

        DosenHonorer dsnHnr1 = new DosenHonorer(
                500000, "111003", "Informatika", "Mr. Antonius",
                "Jl. Kenanga No. 22", "Bogor", "05/12/1985", "082234234");

        Karyawan kryn1 = new Karyawan(
                4500000, "222001", "Siti Nurjanah",
                "Jl. Anggrek No. 1", "Yogyakarta", "20/03/1990", "085545545");

        StaffRepository.addStaff(dsnTtp1);
        StaffRepository.addStaff(dsnHnr1);
        StaffRepository.addStaff(kryn1);
        System.out.println("✅ 3 Staff (Dosen & Karyawan) ditambahkan.");

        // --- Mahasiswa ---
        MahasiswaSarjana mhsS1_1 = new MahasiswaSarjana(
                "1301201001", "IF", "Andi Pratama",
                "Jl. Lembah No. 5", "Tangerang", "01/01/2002", "081234567");

        MahasiswaMagister mhsS2_1 = new MahasiswaMagister(
                "Penerapan AI dalam Logistik", "230219001", "SI", "Bella Cahyani",
                "Jl. Bukit Raya No. 12", "Surabaya", "15/07/1998", "081212121");

        MahasiswaDoktor mhsS3_1 = new MahasiswaDoktor(
                "Optimalisasi Jaringan 6G", 90, 85, 92,
                "330318001", "EL", "Dr. Chandra Wijaya",
                "Jl. Kota Tua No. 1", "Semarang", "22/11/1980", "087765654");

        MahasiswaRepository.addMahasiswa(mhsS1_1);
        MahasiswaRepository.addMahasiswa(mhsS2_1);
        MahasiswaRepository.addMahasiswa(mhsS3_1);
        System.out.println("✅ 3 Mahasiswa (S1, S2, S3) ditambahkan.");

        // --- Relasi Matkul Ambil & Presensi ---
        MatkulAmbil s1_matkul = new MatkulAmbil(90, 80, 75, "IF101", "Algoritma", 3);
        s1_matkul.addListPresensi("01/10/2025", Status.HADIR);
        MahasiswaRepository.findByNimS1("1301201001").addMatkulAmbil(s1_matkul);

        // --- Relasi Matkul Ajar & Presensi Staff ---
        MatkulAjar dsn_matkul = new MatkulAjar("IF101", "Algoritma", 3);
        dsn_matkul.getListPresensiStaff().add(new PresensiStaff(8, "01/10/2025", Status.HADIR));
        StaffRepository.findByNikDsn("111001").addMatkulAjar(dsn_matkul);

        // --- Presensi Karyawan ---
        kryn1.addPresensiStaff(8, "01/10/2025", Status.HADIR);
        System.out.println("✅ Relasi & Presensi ditambahkan.");
        System.out.println("--- Inisialisasi Data Selesai ---");
        System.out.println("\n");

        MenuView menu = new MenuView();
        menu.render();
    }
}
