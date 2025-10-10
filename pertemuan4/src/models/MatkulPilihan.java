package models;

public class MatkulPilihan extends Matkul{
    private int minMhs;

    public MatkulPilihan(String kodeMatkul, String namaMatkul, int sks, int minMhs) {
        super(kodeMatkul, namaMatkul, sks);
        this.minMhs = minMhs;
    }

    public int getMinMhs() {
        return minMhs;
    }

    public void setMinMhs(int minMhs) {
        this.minMhs = minMhs;
    }
}
