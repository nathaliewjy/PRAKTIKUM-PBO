package models;

public class DosenHonorer extends Dosen{
    private int honorPerSKS;

    public DosenHonorer(int honorPerSKS, String nik, String departemen, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        super(UserType.DOSEN_HONORER, nik, departemen, nama, alamat, tempatLahir, tanggalLahir, telepon);
        this.honorPerSKS = honorPerSKS;
    }

    public int getHonorPerSKS() {
        return honorPerSKS;
    }

    public void setHonorPerSKS(int honorPerSKS) {
        this.honorPerSKS = honorPerSKS;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.honorPerSKS;
    }

    @Override
    public double hitungGaji(int unit) {
        return unit * honorPerSKS;
    }
}
