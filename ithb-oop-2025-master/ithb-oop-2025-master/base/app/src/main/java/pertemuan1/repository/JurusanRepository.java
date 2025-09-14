package pertemuan1.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pertemuan1.App.Jurusan;

public class JurusanRepository {
    private final Connection conn;

    public JurusanRepository(Connection conn) {
        this.conn = conn;
    }

    // liat daftar jurusan
    public List<Jurusan> findAll() {
        List<Jurusan> list = new ArrayList<>();
        String sql = "SELECT kodeJRSN, namaJRSN FROM jurusan";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Jurusan j = new Jurusan();
                j.kodeJRSN = rs.getString("kodeJRSN");
                j.namaJRSN = rs.getString("namaJRSN");
                j.listMataKuliah = new ArrayList<>(); // load later if needed
                list.add(j);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    // liat dafatr jurusan pake kodeJRSN
    public Jurusan findBykodeJRSN(String kodeJRSN) {
        String sql = "SELECT kodeJRSN, namaJRSN FROM jurusan WHERE kodeJRSN = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, kodeJRSN);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Jurusan j = new Jurusan();
                    j.kodeJRSN = rs.getString("kodeJRSN");
                    j.namaJRSN = rs.getString("namaJRSN");
                    j.listMataKuliah = new ArrayList<>();
                    return j;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // insert jurusan baru
    public void insert(Jurusan jurusan) {
        String sql = "INSERT INTO jurusan (kodeJRSN, namaJRSN) VALUES (?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, jurusan.kodeJRSN);
            stmt.setString(2, jurusan.namaJRSN);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ganti jurusan
    public void update(Jurusan jurusan) {
        String sql = "UPDATE jurusan SET namaJRSN = ? WHERE kodeJRSN = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, jurusan.namaJRSN);
            stmt.setString(2, jurusan.kodeJRSN);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // hapus jurusan
    public void delete(String kodeJRSN) {
        String sql = "DELETE FROM jurusan WHERE kodeJRSN = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, kodeJRSN);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
