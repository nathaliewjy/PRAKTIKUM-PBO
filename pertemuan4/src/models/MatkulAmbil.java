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

    public void setListPresensi(ArrayList<Presensi> listPresensi) {
        this.listPresensi = listPresensi;
    }

    public int getN1() {
        return n1;
    }

    public void setN1() {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2() {
        this.n2 = n2;
    }

    public int getN3() {
        return n3;
    }

    public void setN3() {
        this.n3 = n3;
    }


}
