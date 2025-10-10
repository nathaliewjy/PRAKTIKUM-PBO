package models;

public class Matkul {
    private String kodeMatkul;
    private String namaMatkul;
    private int sks;

    public Matkul(String kodeMatkul, String namaMatkul, int sks) {
        this.kodeMatkul = kodeMatkul;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }

    public String getKodeMatkul() {
        return kodeMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSKS() {
        return sks;
    }
}
