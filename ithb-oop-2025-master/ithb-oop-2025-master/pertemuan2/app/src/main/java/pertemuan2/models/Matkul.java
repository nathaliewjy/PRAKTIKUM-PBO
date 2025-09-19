package pertemuan2.models;

public class Matkul {
    public String kode_matakuliah;
    public String nama;
    public int sks;
    public String kode_jurusan;

    public Matkul() {
        
    }

    public Matkul(String kode_matakuliah, String nama, int sks, String kode_jurusan) {
        this.kode_matakuliah = kode_matakuliah;
        this.nama = nama;
        this.sks = sks;
        this.kode_jurusan = kode_jurusan;
    }
}
