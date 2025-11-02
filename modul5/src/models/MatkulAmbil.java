package models;

import java.util.ArrayList;

public class MatkulAmbil extends Matkul {
//    private ArrayList<MatkulAmbil> matkulAmbil;
    private ArrayList<Presensi> listPresensi;
    private int n1;
    private int n2;
    private int n3;

    public MatkulAmbil(int n1, int n2, int n3, String kodeMatkul, String namaMatkul, int sks) {
        super(kodeMatkul, namaMatkul, sks);
        this.listPresensi = new ArrayList<>();
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public ArrayList<Presensi> getListPresensi() {
        return listPresensi;
    }

    public void addListPresensi(String tanggal, Status status) {
        this.listPresensi.add(new Presensi(tanggal, status));
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3(int n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.listPresensi + " " + this.n1 + " " + this.n2 + " " + this.n3;
    }

    // 2. Print Nilai Akhir (NA) untuk seorang mahasiswa apabila diinput NIM dan KodeMK-nya.
    public double hitungNA() {
        return (n1 + n2 + n3) / 3.0;
    }

    // 5. Print Matkul Ambil apa saja untuk mahasiswa tertentu (input NIM) beserta total presensinya.
    public int hitungTotalPresensi() {
        int totalPres = 0;

        for (Presensi presensi : getListPresensi()) {
            if (presensi.getStatus() == Status.HADIR) {
                totalPres++;
            }
        }

        return totalPres;
    }
}
