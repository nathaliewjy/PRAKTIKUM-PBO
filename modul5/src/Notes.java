public class Notes {
    // 1
    // StaffRepository & MahasiswaRepostiroy nambah findByNama
    // UserController findByNama
    // UserSearchView render buar dipanggil di MenuView

    // 2
    // di model MatkulAmbil, MhsDok namhahin method hitungNA
    // NilaiAkgirController hitungNA
    // NilaiAkhirView render nnt dipanggil di MenuView

    // 3
    // NilaiAKhirController hitungRataNA, cuma s1 s2 krn yg ada list matkulnya cmn mereka
    // RataNilaiAkhirView ernder dipanggil di MenuView

    // 4
    // NilaiAKhirController hitungMahasiswaGagal
    // MahasiswaGagalView render tar dipanggil

    // 5
    // di model MatkulAmbil nambah method hitungTotalPresensi
    // MatkulPresensiView render (btw logicny disatuin disini krn mikirnya dia g ngitung apa" jd lgsg aja di view gausah pake cont)

    // 6
    // DosenController hitungJamNgajar
    // DosenNgajarView render

    // 7
    // Staff -> Karyawan, DOsenTetap, DosenHonorer nambah method hitungGaji (tar pke ovverride)
    // Staff nambah method hitungUnit, trus dipake di dalem method hitungGaji pas override
    // tdnya ArrayList<PresensiStaff> cmm ada di Karyawan, trs dipindah ke Staff krn dosen jg butuh preesensi
    // StaffCont getGaji, dia nyari staff trus manggil stf.hitungGaji (polymor) -> manggil method hitungGaji yg dioverride di objek stf
    // GajiView render



}
