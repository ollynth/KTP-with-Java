package Controller;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Model.DataPenduduk;

public class MainController {
    static DatabaseController connect = new DatabaseController();

    public static boolean insertNewUser(Model.DataPenduduk dataPenduduk) {
        connect.connect();
        String query = "INSERT INTO users VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connect.con.prepareStatement(query);
            stmt.setString(1, dataPenduduk.getNik());
            stmt.setString(2, dataPenduduk.getNama());
            stmt.setString(3, dataPenduduk.getTempatLahir());
            stmt.setDate(4, new Date(dataPenduduk.getTanggalLahir().getTime()));
            stmt.setString(5, dataPenduduk.getJenisKelamin());
            stmt.setString(6, dataPenduduk.getGolDarah());
            stmt.setString(7, dataPenduduk.getAlamat());
            stmt.setString(8, dataPenduduk.getRtrw());
            stmt.setString(9, dataPenduduk.getKelDesa());
            stmt.setString(10, dataPenduduk.getKecamatan());
            stmt.setString(11, dataPenduduk.getAgama());
            stmt.setString(12, dataPenduduk.getStatKawin());
            stmt.setString(13, dataPenduduk.getPekerjaan());
            stmt.setString(14, dataPenduduk.getKewarganegaraan());
            stmt.setString(15, dataPenduduk.getMasaBerlaku());
            stmt.setString(16, dataPenduduk.getKotaDibuatKtp());
            stmt.setDate(17, new Date(dataPenduduk.getTanggalDibuatKtp().getTime()));
            stmt.setString(18, DataPenduduk.getFoto());
            stmt.setString(19, DataPenduduk.getTtd());
            stmt.executeUpdate();
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

    // SELECT WHERE
    public static DataPenduduk getUser(String nik) {
        connect.connect();
        String query = "SELECT * FROM users WHERE nik ='" + nik + "'";
        DataPenduduk data = new DataPenduduk();
        try {
            PreparedStatement stmt = connect.con.prepareStatement(query);
            // stmt.setString(1, nik);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                // Ambil nilai dari hasil query dan buat objek DataPenduduk
                data.setNama(rs.getString("nama"));
                data.setTempatLahir(rs.getString("tempatlahir"));
                data.setTanggalLahir(rs.getDate("tanggallahir"));
                data.setJenisKelamin(rs.getString("jeniskelamin"));
                data.setGolDarah(rs.getString("goldarah"));
                data.setAlamat(rs.getString("alamat"));
                data.setRtrw(rs.getString("rtrw"));
                data.setKecamatan(rs.getString("kecamatan"));
                data.setKelDesa(rs.getString("kelurahandesa"));
                data.setAgama(rs.getString("agama"));
                data.setStatKawin(rs.getString("statuskawin"));
                data.setPekerjaan(rs.getString("pekerjaan"));
                data.setKewarganegaraan(rs.getString("kewarganegaraan"));
                data.setMasaBerlaku(rs.getString("masaberlaku"));
                data.setKotaDibuatKtp(rs.getString("kotadibuatktp"));
                data.setTanggalDibuatKtp(rs.getDate("tanggalDibuatKtp"));
                DataPenduduk.setFoto(rs.getString("pathfoto"));
                DataPenduduk.setTtd(rs.getString("pathttd"));
            }
            // new View.PerekamanData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (data);
    }

    // UPDATE
    public static boolean updateUser(DataPenduduk dataPenduduk, String nik) {
        connect.connect();
        String query = "UPDATE users SET "
                + "nama='" + dataPenduduk.getNama() + "', "
                + "tempatlahir='" + dataPenduduk.getTempatLahir() + "', "
                + "tanggallahir='" + dataPenduduk.getTanggalLahir() + "', "
                + "jeniskelamin='" + dataPenduduk.getJenisKelamin() + "', "
                + "goldarah='" + dataPenduduk.getGolDarah() + "', "
                + "alamat='" + dataPenduduk.getAlamat() + "', "
                + "rtrw='" + dataPenduduk.getRtrw() + "', "
                + "kelurahandesa='" + dataPenduduk.getKelDesa() + "', "
                + "kecamatan='" + dataPenduduk.getKecamatan() + "', "
                + "agama='" + dataPenduduk.getAgama() + "', "
                + "statuskawin='" + dataPenduduk.getStatKawin() + "', "
                + "pekerjaan='" + dataPenduduk.getPekerjaan() + "', "
                + "kewarganegaraan='" + dataPenduduk.getKewarganegaraan() + "', "
                + "masaberlaku='" + dataPenduduk.getMasaBerlaku() + "', "
                + "kotadibuatktp='" + dataPenduduk.getKotaDibuatKtp() + "', "
                + "tanggaldibuatktp='" + dataPenduduk.getTanggalDibuatKtp() + "', "
                + "pathfoto='" + DataPenduduk.getFoto() + "', "
                + "pathttd='" + DataPenduduk.getTtd() + "' "
                + "WHERE nik='" + nik + "'";
        try {
            Statement stmt = connect.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // DELETE
    public static boolean deleteUser(String nik) {
        connect.connect();

        String query = "DELETE FROM users WHERE nik='" + nik + "'";
        try {
            Statement stmt = connect.con.createStatement();
            stmt.executeUpdate(query);
            return (true);
        } catch (SQLException e) {
            e.printStackTrace();
            return (false);
        }
    }

}
