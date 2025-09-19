package pertemuan2.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pertemuan2.models.Jurusan;
import pertemuan2.database.Database;

public class JurusanRepository {
    static Connection conn;

    static {
        conn = Database.connect();
    }
    
    // liat daftar jurusan
    public static List<Jurusan> findAll() {
        List<Jurusan> list = new ArrayList<>();
        String sql = "SELECT kode_jurusan, nama FROM jurusan";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Jurusan j = new Jurusan();
                j.kode_jurusan = rs.getString("kode_jurusan");
                j.nama = rs.getString("nama");
                // j.listMataKuliah = new ArrayList<>(); // load later if needed
                list.add(j);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // liat dafatr jurusan pake kode_jurusan
    public static Jurusan findBykode_jurusan(String kode_jurusan) {
        String sql = "SELECT kode_jurusan, nama FROM jurusan WHERE kode_jurusan = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, kode_jurusan);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Jurusan j = new Jurusan();
                    j.kode_jurusan = rs.getString("kode_jurusan");
                    j.nama = rs.getString("nama");
                    // j.listMataKuliah = new ArrayList<>();
                    return j;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // insert jurusan baru
    public static void insert(Jurusan jurusan) {
        String sql = "INSERT INTO jurusan (kode_jurusan, nama) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, jurusan.kode_jurusan);
            stmt.setString(2, jurusan.nama);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ganti jurusan
    public static void update(Jurusan jurusan) {
        String sql = "UPDATE jurusan SET nama = ? WHERE kode_jurusan = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, jurusan.nama);
            stmt.setString(2, jurusan.kode_jurusan);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // hapus jurusan
    public static void delete(String kode_jurusan) {
        String sql = "DELETE FROM jurusan WHERE kode_jurusan = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, kode_jurusan);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
