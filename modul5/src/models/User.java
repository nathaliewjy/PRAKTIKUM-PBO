package models;

public abstract class User {
    private UserType type;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private String tanggalLahir;
    private String telepon;

    public User(UserType type, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
        this.type = type;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.telepon = telepon;
    }

    public UserType getUserType() {
        return this.type;
    }


    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getTempatTanggalLahir(){
        return tempatLahir + ", " + tanggalLahir;
    };

    @Override
    public String toString() {
        return this.type + " " + this.nama + " " + this.alamat + " " + this.tanggalLahir + " " + this.tempatLahir + " " + this.telepon;
    }
}
