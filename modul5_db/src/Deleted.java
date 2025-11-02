public class Deleted {
    // MahasiswaRepository.java
    //    public static List<MahasiswaSarjana> findAllSarjana() {
//        return mhssS1;
//    }
//
//    public static void addMahasiswaSarjana(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
//        mhss.add(new MahasiswaSarjana(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
//        mhssS1.add(new MahasiswaSarjana(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
//    }
//
//    public static MahasiswaSarjana findByNimS1(String nim) {
//        for (MahasiswaSarjana mhsS1 : mhssS1) {
//            if (mhsS1.getNim().equals(nim)) {
//                return mhsS1;
//            }
//        }
//        return null;
//    }
//
//    public static List<MahasiswaMagister> findAllMagister() {
//        return mhssS2;
//    }
//
//    public static void addMahasiswaMagister(String tesis, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
//        mhss.add(new MahasiswaMagister(tesis, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
//        mhssS2.add(new MahasiswaMagister(tesis, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
//    }
//
//    public static MahasiswaMagister findByNimS2(String nim) {
//        for (MahasiswaMagister mhsS2 : mhssS2) {
//            if (mhsS2.getNim().equals(nim)) {
//                return mhsS2;
//            }
//        }
//        return null;
//    }
//
//    public static List<MahasiswaDoktor> findAllDoktor() {
//        return mhssS3;
//    }
//
//    public static void addMahasiswaDoktor(String disertasi, int sidang1, int sidang2, int sidang3, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
//        mhss.add(new MahasiswaDoktor(disertasi, sidang1, sidang2, sidang3, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
//        mhssS3.add(new MahasiswaDoktor(disertasi, sidang1, sidang2, sidang3, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
//    }
//
//    public static MahasiswaDoktor findByNimS3(String nim) {
//        for (MahasiswaDoktor mhsS3 : mhssS3) {
//            if (mhsS3.getNim().equals(nim)) {
//                return mhsS3;
//            }
//        }
//        return null;
//    }



    // MahasiswaController.java
    //    public void add(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
//        MahasiswaRepository.add(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
//    }

//    public void add(String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
//        this.mahasiswaRepository.addMahasiswaSarjana(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
//    }

//    public void delete() {
//
//    }
//
//    public void update(String nim, Mahasiswa mhs) {
//
//    }

    //    public void addMahasiswa(UserType type, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
//        mahasiswaRepository.addMahasiswa(new Mahasiswa(type, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
//    }
//
//    public void addMahasiswa(boolean isSarjana, boolean isMagister, String tesis, boolean isDoktor, String disertasi, int sidang1, int sidang2, int sidang3, UserType type, String nim, String kodeJurusan, String nama, String alamat, String tempatLahir, String tanggalLahir, String telepon) {
//        if (isSarjana) {
//            mahasiswaRepository.addMahasiswa(new Mahasiswa(UserType.MAHASISWA_SARJANA, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
//        } else if (isMagister) {
//            mahasiswaRepository.addMahasiswa(new Mahasiswa(tesis, UserType.MAHASISWA_MAGISTER, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon));
//        } else if (isDoktor) {
//            mahasiswaRepository.addMahasiswa(new Mahasiswa(disertasi, sidang1, sidang2, sidang3, UserType.MAHASISWA_DOKTOR, nim, nama, alamat, tempatLahir, tanggalLahir, telepon));
//        }
//    }

    // pake array krn nampilin semua mhs masuk ke list
//    public Mahasiswa[] findAll() {
//        // conn prepstat get all mhs
//        // conn prepstat get all jurusan (ada di JurusanController.findAll())
//        // resolve object 1 per 1
//
//        return new Mahasiswa[];
//    }
//
//    // kl ini cmn nampilin 1 mhs aja brdsrkn nim
//    public Mahasiswa get(String nim) {
//        return null;
//    }



    // MahasiswaListView.java
    //    public void renderMhs() {
//        var mhss = mahasiswaSarjanaController.getAllMhssS1();
//        renderMhs(mhss);
//    }
}
