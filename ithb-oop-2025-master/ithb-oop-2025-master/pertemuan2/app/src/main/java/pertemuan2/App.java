package pertemuan2;

import java.util.List;
import java.util.Scanner;

import pertemuan2.models.Mahasiswa;
import pertemuan2.models.MahasiswaMatkul;
import pertemuan2.models.Matkul;
import pertemuan2.repository.JurusanRepository;
import pertemuan2.repository.MahasiswaRepository;
import pertemuan2.repository.MatkulRepository;

import pertemuan2.models.Jurusan;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu : ");
        System.out.println("A.");
        System.out.println("    1. Input jurusan baru");
        System.out.println("    2. Lihat daftar jurusan");
        System.out.println("    3. Hapus jurusan");
        System.out.println("B.");
        System.out.println("    4. Input matakuliah baru");
        System.out.println("    5. Hapus matakuliah");
        System.out.println("    6. Input matakuliah ke jurusan");
        System.out.println("C.");
        System.out.println("    7. Input mahasiswa baru");
        System.out.println("    8. Lihat daftar mahasiswa");
        System.out.println("    9. Lihat detail mahasiswa berdasarkan NIM");
        System.out.println("D.");
        System.out.println("    10. Input nilai mahasiswa ke matakuliah yang diambil");
        System.out.println("E.");
        System.out.println("    11. Hitung IP mahasiswa berdasarkan nilai matakuliah yang diambil");

        System.out.println("Pilih menu : ");
        int pilihMenu = sc.nextInt();

        switch (pilihMenu) {
            case 1:
                System.out.print("Kode jurusan : ");
                String kode_jurusan = sc.next();
                System.out.print("Nama jurusan : ");
                String nama_jurusan = sc.next();

                Jurusan jurusan_baru = new Jurusan(kode_jurusan, nama_jurusan);
                JurusanRepository.insert(jurusan_baru);

                System.out.println("Berhasil add jurusan baru : " + nama_jurusan);
                break;
            case 2:
                List<Jurusan> listJurusan = JurusanRepository.findAll();
                for (Jurusan j : listJurusan) {
                    System.out.println(j.kode_jurusan + " - " + j.nama);
                }
                break;
            case 3:
                System.out.print("Kode jurusan : ");
                String kode_jurusan_delete = sc.next();
                
                JurusanRepository.delete(kode_jurusan_delete);

                System.out.println("Berhasil hapus jurusan : " + kode_jurusan_delete);
                break;
            case 4:
                System.out.print("Kode matkul : ");
                String kode_matkul = sc.next();
                System.out.print("Nama matkul : ");
                String nama_matkul = sc.next();
                System.out.print("SKS : ");
                int sks = sc.nextInt();
                System.out.print("Kode jurusan : ");
                String kode_jurusan_matkul = sc.next();

                Matkul matkul_baru = new Matkul(kode_matkul, nama_matkul, sks, kode_jurusan_matkul);
                MatkulRepository.addMatkul(matkul_baru);

                System.out.println("Berhasil add matkul baru : " + nama_matkul);
                break;
            case 5:
                System.out.print("Kode matkul : ");
                String kode_matkul_delete = sc.next();
                
                MatkulRepository.deleteMatkul(kode_matkul_delete);

                System.out.println("Berhasil hapus matkul : " + kode_matkul_delete);
                break;
            case 6:
                System.out.print("Kode matkul : ");
                String kode_matkul_input = sc.next();
                System.out.print("Kode jurusan : ");
                String kode_jurusan_input = sc.next();
                
                MatkulRepository.updateMatkul(kode_matkul_input, kode_jurusan_input);

                System.out.println("Berhasil input matkul : " + kode_matkul_input + " ke jurusan : " + kode_jurusan_input);
                break;
            case 7:
                System.out.println("NIM : ");
                String nim = sc.next();
                System.out.println("Nama : ");
                String nama = sc.next();
                System.out.println("Kode jurusan : ");
                String kode_jurusan_mhs = sc.next();

                Mahasiswa mhs_baru = new Mahasiswa(nim, nama, kode_jurusan_mhs);
                MahasiswaRepository.addMahasiswa(mhs_baru);

                System.out.println("Berhasil add mahasiswa baru : " + nama);
                break;
            case 8:
                List<Mahasiswa> listMhs = MahasiswaRepository.getAllMahasiswa();
                for (Mahasiswa m : listMhs) {
                    System.out.println(m.nim + " - " + m.nama + " - " + m.kode_jurusan);
                }
                break;
            case 9:
                System.out.print("NIM : ");
                String nim_cari = sc.next();

                Mahasiswa mhs_cari = MahasiswaRepository.getMahasiswaByNim(nim_cari);
                if (mhs_cari != null) {
                    System.out.println("NIM : " + mhs_cari.nim);
                    System.out.println("Nama : " + mhs_cari.nama);
                    System.out.println("Kode jurusan : " + mhs_cari.kode_jurusan);
                } else {
                    System.out.println("Mahasiswa " + nim_cari + " tdk ketemu");
                }
                break;
            case 10:
                System.out.print("NIM : ");
                String nim_nilai = sc.next();
                System.out.print("Kode matkul : ");
                String kode_matkul_nilai = sc.next();
                System.out.print("Indeks nilai : ");
                String indeks_nilai = sc.next();
                
                MahasiswaMatkul nilai = new MahasiswaMatkul(nim_nilai, kode_matkul_nilai, indeks_nilai);
                MatkulRepository.tambahNilai(nilai);
                break;
            case 11:
                System.out.print("NIM : ");
                String nim_ip = sc.next();

                double ip = MahasiswaRepository.hitungIP(nim_ip);

                if (ip == 0.0) {
                    System.out.println("Gagal ngitung IP");
                } else {
                    System.out.println("IP : " + ip);
                }
            default:
                throw new AssertionError();
        }
        sc.close();
    }
}
