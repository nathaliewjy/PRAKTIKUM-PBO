package repository;

import models.*;
import models.Staff;
import util.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StaffRepository {

    public static final Connection conn;

    static {
        conn = Database.connect();
    }

    private static Staff resultSetStaff (ResultSet rs) throws SQLException {
        // ni ngambil dta
        String nama = rs.getString("nama");
        String alamat = rs.getString("alamat");
        String tempatLahir = rs.getString("tempatLahir");
        String tanggalLahir = rs.getString("tanggalLahir");
        String telepon = rs.getString("telepon");

        String nik = rs.getString("nik");
        String departemen = rs.getString("departemen");
        int salary = rs.getDouble("salary");
        int honorPerSKS = rs.getDouble("honorPerSKS");
        String tipe = rs.getString("tipe");
        UserType type = UserType.valueOf(tipe);

        // ni bikin objk
        if (type == UserType.KARYAWAN) {
            return new Karyawan(salary, nik, nama, alamat, tempatLahir, tanggalLahir, telepon);
        } else if (type == UserType.DOSEN_TETAP) {
            return new DosenTetap(salary, nik, departemen, nama, alamat, tempatLahir, tanggalLahir, telepon);
        } else if (type == UserType.DOSEN_HONORER) {
            return new DosenHonorer(honorPerSKS, nik, departemen, nama, alamat, tempatLahir, tanggalLahir, telepon);
        }

        return null;
    }

    public static List<Staff> findAll() {
        List<Staff> stfs = new ArrayList<Staff>();

        String sql = "SELECT u.*, s.* FROM users u INNER JOIN staff s ON u.id = s.userID";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                stfs.add(resultSetStaff(rs));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stfs;
    }

    public static Staff findByNik(String nik) {
        String sql = "SELECT u.*, s.* FROM users u INNER JOIN staff s ON u.id = s.userID WHERE s.nik = ?";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                return resultSetStaff(rs);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
