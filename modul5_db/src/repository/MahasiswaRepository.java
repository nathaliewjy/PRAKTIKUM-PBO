package repository;

import models.*;
import util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MahasiswaRepository {

    public static final Connection conn;

    static {
        conn = Database.connect();

        if (conn == null) {
            System.out.println("Ga konek db nya di mhs repo");
        }
    }

    private static Mahasiswa resultSetMhs (ResultSet rs) throws SQLException {
        // ni ngambil dta
        String nama = rs.getString("nama");
        String alamat = rs.getString("alamat");
        String tempatLahir = rs.getString("tempatLahir");
        String tanggalLahir = rs.getString("tanggalLahir");
        String telepon = rs.getString("telepon");

        String nim = rs.getString("nim");
        String kodeJurusan = rs.getString("kodeJurusan");
        String tipe = rs.getString("tipe");
        UserType type = UserType.valueOf(tipe);
        String tesis = rs.getString("judulPenelitian");
        String disertasi = rs.getString("judulPenelitian");
        int sidang1 = rs.getInt("sidang1");
        int sidang2 = rs.getInt("sidang2");
        int sidang3 = rs.getInt("sidang3");

        // ni bikin objek
        if (type == UserType.MAHASISWA_SARJANA) {
            return new MahasiswaSarjana(nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        } else if (type == UserType.MAHASISWA_MAGISTER) {
            return new MahasiswaMagister(tesis, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        } else if (type == UserType.MAHASISWA_DOKTOR) {
            return new MahasiswaDoktor(disertasi, sidang1, sidang2, sidang3, nim, kodeJurusan, nama, alamat, tempatLahir, tanggalLahir, telepon);
        }

        return null;
    }

    public static List<Mahasiswa> findAll() {
        List<Mahasiswa> mhss = new ArrayList<Mahasiswa>();

        String sql = "SELECT u.*, m.* FROM users u INNER JOIN mahasiswa m ON u.id = m.userID";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                mhss.add(resultSetMhs(rs));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mhss;
    }

    public static Mahasiswa findByNim(String nim) {
        String sql = "SELECT u.*, m.* FROM users u INNER JOIN mahasiswa m ON u.id = m.userID WHERE m.nim = ?";

        try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
            preparedStatement.setString(1, nim);
            ResultSet rs = preparedStatement.executeQuery();

            if (rs.next()){
                return resultSetMhs(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
