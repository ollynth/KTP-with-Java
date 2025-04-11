package Model;

import java.util.Date;

public class DataPenduduk {
    private String nik, nama, tempatLahir;
    private Date tanggalLahir;
    private String jenisKelamin, golDarah, alamat, rtrw, kelDesa, kecamatan, agama, statKawin, pekerjaan,
            kewarganegaraan, masaBerlaku, kotaDibuatKtp;
    private Date tanggalDibuatKtp;
    private static String foto;
    private static String ttd;

    public DataPenduduk() {
    }

    public DataPenduduk(String nik, String nama, String tempatLahir, Date tanggalLahir, String jenisKelamin,
            String golDarah, String alamat, String rtrw, String kelDesa, String kecamatan, String agama,
            String statKawin, String pekerjaan, String kewarganegaraan, String masaBerlaku,
            String kotaDibuatKtp, Date tanggalDibuatKtp) {
        this.nik = nik;
        this.nama = nama;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.golDarah = golDarah;
        this.alamat = alamat;
        this.rtrw = rtrw;
        this.kelDesa = kelDesa;
        this.kecamatan = kecamatan;
        this.agama = agama;
        this.statKawin = statKawin;
        this.pekerjaan = pekerjaan;
        this.kewarganegaraan = kewarganegaraan;
        this.masaBerlaku = masaBerlaku;
        this.kotaDibuatKtp = kotaDibuatKtp;
        this.tanggalDibuatKtp = tanggalDibuatKtp;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public Date getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(Date tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getGolDarah() {
        return golDarah;
    }

    public void setGolDarah(String golDarah) {
        this.golDarah = golDarah;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getRtrw() {
        return rtrw;
    }

    public void setRtrw(String rtrw) {
        this.rtrw = rtrw;
    }

    public String getKelDesa() {
        return kelDesa;
    }

    public void setKelDesa(String kelDesa) {
        this.kelDesa = kelDesa;
    }

    public String getKecamatan() {
        return kecamatan;
    }

    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public String getStatKawin() {
        return statKawin;
    }

    public void setStatKawin(String statKawin) {
        this.statKawin = statKawin;
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public void setPekerjaan(String pekerjaan) {
        this.pekerjaan = pekerjaan;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String getMasaBerlaku() {
        return masaBerlaku;
    }

    public void setMasaBerlaku(String masaBerlaku) {
        this.masaBerlaku = masaBerlaku;
    }

    public String getKotaDibuatKtp() {
        return kotaDibuatKtp;
    }

    public void setKotaDibuatKtp(String kotaDibuatKtp) {
        this.kotaDibuatKtp = kotaDibuatKtp;
    }

    public Date getTanggalDibuatKtp() {
        return tanggalDibuatKtp;
    }

    public void setTanggalDibuatKtp(Date tanggalDibuatKtp) {
        this.tanggalDibuatKtp = tanggalDibuatKtp;
    }

    public static String getFoto() {
        return foto;
    }

    public static void setFoto(String foto) {
        DataPenduduk.foto = foto;
    }

    public static String getTtd() {
        return ttd;
    }

    public static void setTtd(String ttd) {
        DataPenduduk.ttd = ttd;
    }

}
