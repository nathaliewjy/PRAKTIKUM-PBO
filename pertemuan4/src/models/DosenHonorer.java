package models;

public class DosenHonorer extends Dosen{
    private int honorPerSKS;

    public DosenHonorer(int honorPerSKS, String nik, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }
}
