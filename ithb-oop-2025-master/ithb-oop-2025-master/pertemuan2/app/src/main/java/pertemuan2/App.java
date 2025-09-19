package pertemuan2;

import java.util.List;
import java.util.Scanner;

import pertemuan2.models.Mahasiswa;
import pertemuan2.repository.JurusanRepository;
import pertemuan2.repository.MahasiswaRepository;

import pertemuan2.models.Jurusan;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu : ");
        System.out.println("A.");
        System.out.println("1. Input jurusan baru");
        System.out.println("2. Lihat daftar jurusan");
        System.out.println("3. Hapus jurusan");
        System.out.println("B.");
        System.out.println("4. Input matakuliah baru");
        System.out.println("5. Hapus matakuliah");
        System.out.println("6. Input matakuliah ke jurusan");
        System.out.println("C.");
        System.out.println("7. Input mahasiswa baru");
        System.out.println("8. Lihat daftar mahasiswa");
        System.out.println("9. Lihat detail mahasiswa berdasarkan NIM");

        System.out.println("Pilih menu : ");
        int pilihMenu = sc.nextInt();
        Jurusan jurusan = new Jurusan();
        switch (pilihMenu) {
            case 1:
                JurusanRepository.insert(jurusan);
                break;
            case 2:
                JurusanRepository.findAll();
                break;
            default:
                throw new AssertionError();
        }

        
        // System.out.print("Masukkan NIM: ");
        // String nim = scanner.nextLine();

        // System.out.print("Masukkan Nama: ");
        // String nama = scanner.nextLine();

        // System.out.print("Masukkan kode jurusan : ");
        // String kode_jurusan = scanner.nextLine();
        
        // Mahasiswa mhs = new Mahasiswa(nim, nama, kode_jurusan);
        // MahasiswaRepository.addMahasiswa(mhs);

        // List<Mahasiswa> allMahasiswa = MahasiswaRepository.getAllMahasiswa();
        // System.out.println("\n📋 Daftar Mahasiswa:");
        // for (Mahasiswa m : allMahasiswa) {
        //     System.out.println(m.nim + " - " + m.nama + " - " + m.kode_jurusan);
        // }


        // scanner.close();
    }
}
