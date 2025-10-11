package models;

import java.util.ArrayList;

public class MatkulAjar extends Matkul {
    private ArrayList<PresensiStaff> listPresensiStaff;

    public MatkulAjar(String kodeMatkul, String namaMatkul, int sks) {
        super(kodeMatkul, namaMatkul, sks);
        this.listPresensiStaff = new ArrayList<>();
    }

    public ArrayList<PresensiStaff> getListPresensiStaff() {
        return listPresensiStaff;
    }

    public void setListPresensiStaff(ArrayList<PresensiStaff> listPresensiStaff) {
        this.listPresensiStaff = listPresensiStaff;
    }
}
