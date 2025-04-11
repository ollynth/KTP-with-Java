package View;


import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Model.DataPenduduk;

public class ShowKTP {
    JFrame frame;
    JPanel panelFoto, panelTtd;

    public ShowKTP(ArrayList<DataPenduduk> data, ImageIcon foto, ImageIcon ttd) {
        frame = new JFrame("Kartu Tanda Penduduk");
        frame.setSize(500, 300);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Title
        JLabel title = new JLabel("REPUBLIK HARAPAN BANGSA");
        title.setBounds(155, 5, 200, 20);
        title.setFont(new Font(null, Font.BOLD, 13));
        frame.add(title);

        // nik
        JLabel nik = new JLabel("NIK");
        nik.setBounds(10, 20, 200, 20);
        nik.setFont(new Font(null, Font.BOLD, 15));
        frame.add(nik);
        JLabel valueNik = new JLabel(": " + data.get(0).getNik());
        valueNik.setBounds(80, 20, 200, 20);
        valueNik.setFont(new Font(null, Font.BOLD, 15));
        frame.add(valueNik);

        // nama
        JLabel nama = new JLabel("Nama");
        nama.setBounds(10, 40, 200, 20);
        nama.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(nama);
        JLabel valueNama = new JLabel(": " + data.get(0).getNama().toUpperCase());
        valueNama.setBounds(120, 40, 200, 20);
        valueNama.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueNama);

        // tempat, tanggal lahir
        JLabel tempatTanggalLahir = new JLabel(
                "Tempat/Tgl Lahir");
        tempatTanggalLahir.setBounds(10, 55, 200, 20);
        tempatTanggalLahir.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(tempatTanggalLahir);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String tanggalLahirStr = dateFormat.format(data.get(0).getTanggalLahir());
        JLabel valueTtl = new JLabel(": " + data.get(0).getTempatLahir().toUpperCase() + ", " + tanggalLahirStr);
        valueTtl.setBounds(120, 55, 200, 20);
        valueTtl.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueTtl);

        // jenis kelamin
        JLabel jenisKelamin = new JLabel("Jenis kelamin");
        jenisKelamin.setBounds(10, 70, 200, 20);
        jenisKelamin.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(jenisKelamin);
        JLabel valueJenisKelamin = new JLabel(": " + data.get(0).getJenisKelamin().toUpperCase());
        valueJenisKelamin.setBounds(120, 70, 200, 20);
        valueJenisKelamin.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueJenisKelamin);

        // goldar
        JLabel goldar = new JLabel("Gol. Darah");
        goldar.setBounds(200, 70, 200, 20);
        goldar.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(goldar);
        JLabel valueGoldar = new JLabel(": " + data.get(0).getGolDarah());
        valueGoldar.setBounds(270, 70, 200, 20);
        valueGoldar.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueGoldar);

        // alamat
        JLabel alamat = new JLabel("Alamat");
        alamat.setBounds(10, 85, 200, 20);
        alamat.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(alamat);
        JLabel valueAlamat = new JLabel(": " + data.get(0).getAlamat().toUpperCase());
        valueAlamat.setBounds(120, 85, 200, 20);
        valueAlamat.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueAlamat);

        // rt/rw
        JLabel rtrw = new JLabel("RT/RW");
        rtrw.setBounds(50, 100, 200, 20);
        rtrw.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(rtrw);
        JLabel valueRtrw = new JLabel(": " + data.get(0).getRtrw());
        valueRtrw.setBounds(120, 100, 200, 20);
        valueRtrw.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueRtrw);

        // kel/desa
        JLabel kelDesa = new JLabel("Kel/Desa");
        kelDesa.setBounds(50, 115, 200, 20);
        kelDesa.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(kelDesa);
        JLabel valueKelDesa = new JLabel(": " + data.get(0).getKelDesa().toUpperCase());
        valueKelDesa.setBounds(120, 115, 200, 20);
        valueKelDesa.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueKelDesa);

        // kecamatan
        JLabel kecamatan = new JLabel("Kecamatan");
        kecamatan.setBounds(50, 130, 200, 20);
        kecamatan.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(kecamatan);
        JLabel valueKecamatan = new JLabel(": " + data.get(0).getKecamatan().toUpperCase());
        valueKecamatan.setBounds(120, 130, 200, 20);
        valueKecamatan.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueKecamatan);

        // agama
        JLabel agama = new JLabel("Agama");
        agama.setBounds(10, 145, 200, 20);
        agama.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(agama);
        JLabel valueAgama = new JLabel(": " + data.get(0).getAgama().toUpperCase());
        valueAgama.setBounds(120, 145, 200, 20);
        valueAgama.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueAgama);

        // status kawin
        JLabel statusKawin = new JLabel("Status Perkawinan");
        statusKawin.setBounds(10, 160, 200, 20);
        statusKawin.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(statusKawin);
        JLabel valueStatusKawin = new JLabel(": " + data.get(0).getStatKawin().toUpperCase());
        valueStatusKawin.setBounds(120, 160, 200, 20);
        valueStatusKawin.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueStatusKawin);

        // pekerjaan
        JLabel pekerjaan = new JLabel("Pekerjaan");
        pekerjaan.setBounds(10, 175, 200, 20);
        pekerjaan.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(pekerjaan);
        JLabel valuePekerjaan = new JLabel(": " + data.get(0).getPekerjaan().toUpperCase());
        valuePekerjaan.setBounds(120, 175, 200, 20);
        valuePekerjaan.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valuePekerjaan);

        // kewarganegaraan
        JLabel kewarganegaraan = new JLabel("Kewarganegaraan");
        kewarganegaraan.setBounds(10, 190, 200, 20);
        kewarganegaraan.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(kewarganegaraan);
        JLabel valueKewarganegaraan = new JLabel(": " + data.get(0).getKewarganegaraan().toUpperCase());
        valueKewarganegaraan.setBounds(120, 190, 200, 20);
        valueKewarganegaraan.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueKewarganegaraan);

        // foto
        panelFoto = new JPanel();
        panelFoto.setBounds(350, 25, 100, 125);
        frame.add(panelFoto);

        // ttd
        panelTtd = new JPanel();
        panelTtd.setBounds(358, 180, 80, 50);
        frame.add(panelTtd);

        // berlaku hingga
        JLabel masaBerlaku = new JLabel("Berlaku Hingga");
        masaBerlaku.setBounds(10, 205, 200, 20);
        masaBerlaku.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(masaBerlaku);
        JLabel valueMasaBerlaku = new JLabel(": " + data.get(0).getMasaBerlaku().toUpperCase());
        valueMasaBerlaku.setBounds(120, 205, 200, 20);
        valueMasaBerlaku.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueMasaBerlaku);

        // kota pembuatan ktp
        JLabel valueKotaDibuatKtp = new JLabel(data.get(0).getKotaDibuatKtp().toUpperCase());
        valueKotaDibuatKtp.setBounds(370, 150, 200, 20);
        valueKotaDibuatKtp.setFont(new Font("Arial", Font.BOLD, 11));
        frame.add(valueKotaDibuatKtp);

        // tgl pembuatan ktp
        SimpleDateFormat formatTglDibuatKtp = new SimpleDateFormat("dd-MM-yyyy");
        String strTglDibuatKtp = formatTglDibuatKtp.format(data.get(0).getTanggalDibuatKtp());
        JLabel valuetglDibuatKtp = new JLabel(strTglDibuatKtp);
        valuetglDibuatKtp.setBounds(370, 165, 200, 20);
        valuetglDibuatKtp.setFont(new Font("Arial", Font.BOLD, 10));
        frame.add(valuetglDibuatKtp);

        frame.setVisible(true); // selalu ada
        valueFoto();
        valueTtd();
    }
    public void valueFoto() {
        String pathFoto = DataPenduduk.getFoto();
        if (pathFoto != null) {
            try {
                BufferedImage img = ImageIO.read(new File(pathFoto));
                ImageIcon imageIcon = new ImageIcon(img);
                JLabel imageLabel = new JLabel(imageIcon);
                imageLabel.setBounds(0, 0, img.getWidth(), img.getHeight());
                // Hapus komponen sebelumnya dari fotoPanel
                panelFoto.removeAll();
                panelFoto.revalidate();
                panelFoto.repaint();
                panelFoto.add(imageLabel);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void valueTtd() {
        String pathTtd = DataPenduduk.getTtd();
        if (pathTtd != null) {
            try {
                BufferedImage img = ImageIO.read(new File(pathTtd));
                ImageIcon imageIcon = new ImageIcon(img);
                JLabel imageLabel = new JLabel(imageIcon);
                imageLabel.setBounds(0, 0, img.getWidth(), img.getHeight());
                // Hapus komponen sebelumnya dari fotoPanel
                panelTtd.removeAll();
                panelTtd.revalidate();
                panelTtd.repaint();
                panelTtd.add(imageLabel);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
