package pertemuan2.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// import pertemuan2.database.Database;
// import pertemuan2.models.Mahasiswa;
import pertemuan2.database.Database;
import pertemuan2.models.Mahasiswa;

public class MahasiswaRepository {

    private static final Connection conn;

    static {
        conn = Database.connect();
    }

    // CREATE
    public static void addMahasiswa(Mahasiswa mhs) {
        String sql = "INSERT INTO mahasiswa (nim, nama) VALUES (?, ?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, mhs.nim);
            preparedStatement.setString(2, mhs.nama);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ ALL
    public static List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> result = new ArrayList<Mahasiswa>();
        String sql = "SELECT nim, nama FROM mahasiswa";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet resultSet = stmt.executeQuery();

            while (resultSet.next()) {
                result.add(new Mahasiswa(resultSet.getString("nim"), resultSet.getString("nama"), resultSet.getNString("kode_jurusan")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    // READ BY NIM
    public static Mahasiswa getMahasiswaByNim(String nim) {
        String sql = "SELECT nim, nama FROM mahasiswa WHERE nim = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nim);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                return new Mahasiswa(resultSet.getString("nim"), resultSet.getString("nama"), resultSet.getString("kode_jurusan"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // UPDATE
    public static void updateMahasiswa(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE nim = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, mhs.nama);
            preparedStatement.setString(2, mhs.nim);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public static void deleteMahasiswa(String nim) {
        String sql = "DELETE FROM mahasiswa WHERE nim = ?";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nim);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // NGITUNG IP
    public static double hitungIP(String nim) {
        String sql = "SELECT mtkl.sks, mhs_mtkl.indeks_nilai FROM mahasiswa_matakuliah JOIN matakuliah ON mhs_mtkl.kode_matakuliah WHERE mhs_mtkl.nim = ?";
        double bobotSKS = 0.0;
        int totalSKS = 0;

        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, nim);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int sks = resultSet.getInt("sks");
                String indeksNilai = resultSet.getString("indeks_nilai");
                double bobot = 0.0;

                switch (indeksNilai) {
                    case "A":
                        bobot = 4.0;
                        break;
                    case "B":
                        bobot = 3.0;
                        break;
                    case "C":
                        bobot = 2.0;
                        break;
                    case "D":
                        bobot = 1.0;
                        break;
                    case "E":
                        bobot = 0.0;
                        break;
                    default:
                        bobot = 0.0; // Nilai tidak valid
                        break;
                }

                bobotSKS += bobot * sks;
                totalSKS += sks;
            }

            return bobotSKS / totalSKS;
        } catch (SQLException e) {
            System.out.println("Gagal ngitung IP");
            e.printStackTrace();
        }
        return 0.0;
    }
}
