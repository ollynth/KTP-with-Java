package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.ArrayList;
import java.util.Properties;
import javax.imageio.ImageIO;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import Controller.DateLabelFormatter;
import Controller.MainController;
import Model.DataPenduduk;
import net.sourceforge.jdatepicker.impl.UtilCalendarModel;

public class PerekamanData extends JFrame {

    JFrame frame;
    JPanel photoPanel;
    JPanel ttdPanel;
    JFileChooser fileFoto;
    JFileChooser fileTtd;
    ArrayList<DataPenduduk> dataPenduduk;

    public PerekamanData() {
        frame = new JFrame("Perekaman Data KTP");
        frame.setSize(800, 600);
        frame.setLayout(null);

        // NIK
        JLabel nik = new JLabel("NIK: ");
        nik.setBounds(10, 10, 200, 20);
        // nik.setFont(null);
        frame.add(nik);
        JTextField isiNik = new JTextField(); // nge get 
        isiNik.setBounds(140, 12, 200, 20);
        frame.add(isiNik);

        // Nama
        JLabel nama = new JLabel("Nama: ");
        nama.setBounds(10, 40, 200, 20);
        frame.add(nama);
        JTextField isiNama = new JTextField();
        isiNama.setBounds(140, 42, 200, 20);
        frame.add(isiNama);

        // Tempat lahir
        JLabel tempatLahir = new JLabel("Tempat Lahir: ");
        tempatLahir.setBounds(10, 70, 200, 20);
        frame.add(tempatLahir);
        JTextField isiTempatLahir = new JTextField();
        isiTempatLahir.setBounds(140, 72, 200, 20);
        frame.add(isiTempatLahir);

        // Tanggal Lahir
        JLabel tanggalLahir = new JLabel("Tanggal Lahir: ");
        tanggalLahir.setBounds(10, 100, 200, 20);
        frame.add(tanggalLahir);
        UtilCalendarModel modelTtl = new UtilDateModel();
        Properties prop = new Properties();
        prop.put("text.today", "Day");
        prop.put("text.month", "Month");
        prop.put("text.year", "Year");
        JDatePanelImpl datePanel = new JDatePanelImpl(modelTtl, prop);
        JDatePickerImpl isiTanggalLahir = new JDatePickerImpl(datePanel, new DateLabelFormatter());
        isiTanggalLahir.setBounds(140, 102, 200, 28);
        frame.add(isiTanggalLahir);

        // Jenis kelamin
        JLabel jenisKelamin = new JLabel("Jenis Kelamin: ");
        jenisKelamin.setBounds(10, 130, 200, 20);
        frame.add(jenisKelamin);
        JRadioButton pria = new JRadioButton("Pria");
        JRadioButton wanita = new JRadioButton("Wanita");
        pria.setBounds(140, 132, 50, 20);
        wanita.setBounds(195, 132, 70, 20);
        frame.add(pria);
        frame.add(wanita);
        ButtonGroup bgJenisKelamin = new ButtonGroup();
        bgJenisKelamin.add(pria);
        bgJenisKelamin.add(wanita);

        // Golongan darah
        JLabel goldar = new JLabel("Golongan Darah: ");
        goldar.setBounds(10, 160, 200, 20);
        frame.add(goldar);
        JRadioButton goldarA = new JRadioButton("A");
        JRadioButton goldarB = new JRadioButton("B");
        JRadioButton goldarO = new JRadioButton("O");
        JRadioButton goldarAB = new JRadioButton("AB");
        goldarA.setBounds(140, 162, 35, 20);
        goldarB.setBounds(175, 162, 35, 20);
        goldarO.setBounds(210, 162, 35, 20);
        goldarAB.setBounds(245, 162, 45, 20);
        frame.add(goldarA);
        frame.add(goldarB);
        frame.add(goldarO);
        frame.add(goldarAB);
        ButtonGroup bgGoldar = new ButtonGroup();
        bgGoldar.add(goldarA);
        bgGoldar.add(goldarB);
        bgGoldar.add(goldarO);
        bgGoldar.add(goldarAB);

        // Alamat
        JLabel alamat = new JLabel("Alamat: ");
        alamat.setBounds(10, 190, 200, 20);
        frame.add(alamat);
        JTextField isiAlamat = new JTextField();
        isiAlamat.setBounds(140, 192, 200, 20);
        frame.add(isiAlamat);

        // RT/RW
        JLabel rtrw = new JLabel("RT/RW: ");
        rtrw.setBounds(10, 220, 200, 20);
        frame.add(rtrw);
        JTextField isiRtrw = new JTextField();
        isiRtrw.setBounds(140, 222, 200, 20);
        frame.add(isiRtrw);

        // Kel/Desa
        JLabel kelDesa = new JLabel("Kel/Desa: ");
        kelDesa.setBounds(10, 250, 200, 20);
        frame.add(kelDesa);
        JTextField isiKelDesa = new JTextField();
        isiKelDesa.setBounds(140, 252, 200, 20);
        frame.add(isiKelDesa);

        // Kecamatan
        JLabel kecamatan = new JLabel("Kecamatan: ");
        kecamatan.setBounds(10, 280, 200, 20);
        frame.add(kecamatan);
        JTextField isiKecamatan = new JTextField();
        isiKecamatan.setBounds(140, 282, 200, 20);
        frame.add(isiKecamatan);

        // Agama
        JLabel agama = new JLabel("Agama: ");
        agama.setBounds(10, 310, 200, 20);
        frame.add(agama);
        String arrAgama[] = { "Islam", "Kristen Protestan", "Katolik", "Hindu", "Budha", "Khonghucu" };
        JComboBox<String> isiAgama = new JComboBox<>(arrAgama);
        isiAgama.setBounds(140, 313, 200, 20);
        frame.add(isiAgama);

        // Status Perkawinan
        JLabel statusKawin = new JLabel("Status Perkawinan: ");
        statusKawin.setBounds(10, 340, 200, 20);
        frame.add(statusKawin);
        String arrStatusKawin[] = { "Belum Menikah", "Menikah", "Janda", "Duda" };
        JComboBox<String> isiStatusKawin = new JComboBox<>(arrStatusKawin);
        isiStatusKawin.setBounds(140, 342, 200, 20);
        frame.add(isiStatusKawin);

        // Pekerjaan
        JLabel pekerjaan = new JLabel("Pekerjaan: ");
        pekerjaan.setBounds(10, 370, 200, 20);
        frame.add(pekerjaan);
        JCheckBox karyawanSwasta = new JCheckBox("Karyawan Swasta");
        JCheckBox pns = new JCheckBox("PNS");
        JCheckBox wiraswasta = new JCheckBox("Wiraswasta");
        JCheckBox akademisi = new JCheckBox("Akademisi");
        JCheckBox pengangguran = new JCheckBox("Pengangguran");
        karyawanSwasta.setBounds(140, 372, 125, 20);
        pns.setBounds(140, 395, 125, 20);
        wiraswasta.setBounds(140, 418, 125, 20);
        akademisi.setBounds(140, 441, 125, 20);
        pengangguran.setBounds(140, 464, 125, 20);
        frame.add(karyawanSwasta);
        frame.add(pns);
        frame.add(wiraswasta);
        frame.add(akademisi);
        frame.add(pengangguran);

        pengangguran.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (pengangguran.isSelected()) {
                    karyawanSwasta.setEnabled(false);
                    pns.setEnabled(false);
                    wiraswasta.setEnabled(false);
                    akademisi.setEnabled(false);
                    karyawanSwasta.setSelected(false);
                    pns.setSelected(false);
                    wiraswasta.setSelected(false);
                    akademisi.setSelected(false);
                } else {
                    karyawanSwasta.setEnabled(true);
                    pns.setEnabled(true);
                    wiraswasta.setEnabled(true);
                    akademisi.setEnabled(true);
                }
            }
        });

        // Kewarganegaraan
        JLabel kewarganegaraan = new JLabel("Kewarganegaraan: ");
        kewarganegaraan.setBounds(10, 494, 200, 20);
        frame.add(kewarganegaraan);
        JRadioButton wni = new JRadioButton("WNI");
        JRadioButton wna = new JRadioButton("WNA");
        wni.setBounds(140, 496, 50, 20);
        wna.setBounds(190, 496, 55, 20);
        frame.add(wni);
        frame.add(wna);
        ButtonGroup bgKewarganegaraan = new ButtonGroup();
        bgKewarganegaraan.add(wni);
        bgKewarganegaraan.add(wna);

        JTextField namaNegara = new JTextField(20);
        namaNegara.setBounds(200, 526, 150, 20);
        namaNegara.setVisible(false);

        wna.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (wna.isSelected()) {
                    frame.add(namaNegara);
                    namaNegara.setVisible(true);
                } else {
                    namaNegara.setVisible(false);
                }
            }
        });

        // Foto
        JLabel foto = new JLabel("Foto: ");
        foto.setBounds(390, 10, 200, 20);
        frame.add(foto);
        JButton isiFoto = new JButton("Upload");
        isiFoto.setBounds(540, 12, 140, 20);
        frame.add(isiFoto);
        JLabel tampilFoto = new JLabel("Tampilan Foto Anda: ");
        tampilFoto.setBounds(390, 210, 200, 20);
        frame.add(tampilFoto);
        photoPanel = new JPanel();
        photoPanel.setBounds(390, 230, 120, 120);
        frame.add(photoPanel);

        isiFoto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseFoto();
            }
        });

        // Tanda tangan
        JLabel ttd = new JLabel("Tanda Tangan: ");
        ttd.setBounds(390, 40, 200, 20);
        frame.add(ttd);
        JButton isiTtd = new JButton("Upload");
        isiTtd.setBounds(540, 42, 140, 20);
        frame.add(isiTtd);
        JLabel tampilTtd = new JLabel("Tampilan TTD Anda: ");
        tampilTtd.setBounds(550, 210, 200, 20);
        frame.add(tampilTtd);
        ttdPanel = new JPanel();
        ttdPanel.setBounds(550, 230, 120, 120);
        frame.add(ttdPanel);

        isiTtd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseTtd();
            }
        });

        // Berlaku hingga
        JLabel masaBerlaku = new JLabel("Berlaku Hingga: ");
        masaBerlaku.setBounds(390, 70, 200, 20);
        frame.add(masaBerlaku);
        JTextField isiMasaBerlaku = new JTextField();
        isiMasaBerlaku.setBounds(540, 72, 200, 20);
        frame.add(isiMasaBerlaku);

        // Kota pembuatan KTP
        JLabel kotaDibuatKtp = new JLabel("Kota Pembuatan KTP: ");
        kotaDibuatKtp.setBounds(390, 100, 200, 20);
        frame.add(kotaDibuatKtp);
        JTextField isiKotaDibuatKtp = new JTextField();
        isiKotaDibuatKtp.setBounds(540, 102, 200, 20);
        frame.add(isiKotaDibuatKtp);

        // Tanggal pembuatan KTP
        JLabel tglDibuatKtp = new JLabel("Tanggal Pembuatan KTP: ");
        tglDibuatKtp.setBounds(390, 130, 200, 20);
        frame.add(tglDibuatKtp);
        UtilDateModel model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");
        JDatePanelImpl datePanels = new JDatePanelImpl(model, p);
        JDatePickerImpl isiTanggalDibuatKtp = new JDatePickerImpl(datePanels, new DateLabelFormatter());
        isiTanggalDibuatKtp.setBounds(540, 130, 200, 28);
        frame.add(isiTanggalDibuatKtp);

        // Submit
        JButton submitButton = new JButton("SUBMIT");
        submitButton.setBounds(390, 170, 100, 25);
        submitButton.setVisible(true);
        frame.add(submitButton);
        submitButton.setEnabled(true);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ArrayList <>
                String addNik = isiNik.getText();
                String addNama = isiNama.getText();
                String addTempatLahir = isiTempatLahir.getText();
                Date addTanggalLahir = (Date) isiTanggalLahir.getModel().getValue();
                String addJenisKelamin = pria.isSelected() ? "Laki-laki" : wanita.isSelected() ? "Perempuan" : "-";
                String addGoldar = goldarA.isSelected() ? "A"
                        : goldarB.isSelected() ? "B" : goldarO.isSelected() ? "O" : goldarAB.isSelected() ? "AB" : "-";
                String addAlamat = isiAlamat.getText();
                String addRtrw = isiRtrw.getText();
                String addKelDesa = isiKelDesa.getText();
                String addKecamatan = isiKecamatan.getText();
                String addAgama = isiAgama.getItemAt(isiAgama.getSelectedIndex());
                String addStatusKawin = isiStatusKawin.getItemAt(isiStatusKawin.getSelectedIndex());
                String addPekerjaan = karyawanSwasta.isSelected() ? "Karyawan Swasta"
                        : pns.isSelected() ? "PNS"
                                : wiraswasta.isSelected() ? "Wiraswasta"
                                        : akademisi.isSelected() ? "Akademisi" : "Pengangguran";
                String addKewarganegaraan = wni.isSelected() ? "WNI" : "WNA";
                String addWna = " ";
                if (wna.isSelected()) {
                    addWna = namaNegara.isVisible() ? namaNegara.getText() : "";
                    addKewarganegaraan = ("WNA (" + addWna + ")");
                }
                ImageIcon addFoto = (ImageIcon) tampilFoto.getIcon();
                ImageIcon addTtd = (ImageIcon) tampilTtd.getIcon();
                String addMasaBerlaku = isiMasaBerlaku.getText();
                String addKotaDibuatKtp = isiKotaDibuatKtp.getText();
                Date addTanggalDibuatKtp = (Date) isiTanggalDibuatKtp.getModel().getValue();

                dataPenduduk = new ArrayList<>();
                DataPenduduk data = new DataPenduduk(addNik, addNama, addTempatLahir, addTanggalLahir, addJenisKelamin,
                        addGoldar, addAlamat, addRtrw, addKelDesa, addKecamatan, addAgama, addStatusKawin, addPekerjaan,
                        addKewarganegaraan, addMasaBerlaku, addKotaDibuatKtp, addTanggalDibuatKtp);
                // DataPenduduk data = new DataPenduduk();

                dataPenduduk.add(data);
                new ShowKTP(dataPenduduk, addFoto, addTtd);

                MainController.insertNewUser(data);
                // data.setNik(isiNama.getText());
                // data.setNama(addNama);
                // checkDataAndEnableButton(dataPenduduk, submitButton);
            }
        });

        frame.setVisible(true); // diakhir
    }

    // private static void checkDataAndEnableButton(ArrayList<DataPenduduk> dataPenduduks, JButton submitButton) {
        // dataPenduduks.get(0);
        // dataPenduduks.get(0);
        // if (!nameField.getText().isEmpty() && agreementCheckBox.isSelected()) {
        // if (!dataPenduduks.get(0).getNik().isEmpty() &&
        //         !dataPenduduks.get(0).getNama().isEmpty() &&
        //         !dataPenduduks.get(0).getTempatLahir().isEmpty() &&
        //         !dataPenduduks.get(0).getTanggalLahir().equals(null) &&
        //         !dataPenduduks.get(0).getJenisKelamin().isEmpty() &&
        //         !dataPenduduks.get(0).getGolDarah().isEmpty() &&
        //         !dataPenduduks.get(0).getAlamat().isEmpty() &&
        //         !dataPenduduks.get(0).getRtrw().isEmpty() &&
        //         !dataPenduduks.get(0).getKelDesa().isEmpty() &&
        //         !dataPenduduks.get(0).getKecamatan().isEmpty() &&
        //         !dataPenduduks.get(0).getAgama().isEmpty() &&
        //         !dataPenduduks.get(0).getStatKawin().isEmpty() &&
        //         !dataPenduduks.get(0).getPekerjaan().isEmpty() &&
        //         !dataPenduduks.get(0).getKewarganegaraan().isEmpty() &&
        //         !dataPenduduks.get(0).getMasaBerlaku().isEmpty() &&
        //         !DataPenduduk.getFoto().isEmpty() &&
        //         !DataPenduduk.getTtd().isEmpty()) {
        //     submitButton.setEnabled(true);
        // } else {
        //     submitButton.setEnabled(false);
        // }
    // }

    private void chooseFoto() {
        fileFoto = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Picture Files", "jpg", "jpeg", "png");
        fileFoto.setFileFilter(filter);

        int returnValue = fileFoto.showOpenDialog(frame); // Tampilkan dialog pemilihan file

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileFoto.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            DataPenduduk.setFoto(filePath);
            String pathFoto = DataPenduduk.getFoto();
            if (pathFoto != null) {
                try {
                    BufferedImage img = ImageIO.read(new File(filePath));
                    if (img != null) {
                        ImageIcon imageIcon = new ImageIcon(img);
                        JLabel imageLabel = new JLabel(imageIcon);
                        imageLabel.setBounds(0, 0, img.getWidth(), img.getHeight());

                        photoPanel.removeAll();
                        photoPanel.revalidate();
                        photoPanel.repaint();
                        photoPanel.add(imageLabel);
                    } else {
                        System.err.println("Gagal membaca gambar dari file: " + filePath);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Pemilihan file dibatalkan.");
        }
    }

    private void chooseTtd() {
        fileTtd = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Picture Files", "jpg", "jpeg", "png");
        fileTtd.setFileFilter(filter);

        int returnValue = fileTtd.showOpenDialog(frame); // Tampilkan dialog pemilihan file

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileTtd.getSelectedFile();
            String filePath = selectedFile.getAbsolutePath();
            DataPenduduk.setTtd(filePath);
            String pathTtd = DataPenduduk.getTtd();
            if (pathTtd != null) {
                try {
                    BufferedImage img = ImageIO.read(new File(filePath));
                    if (img != null) {
                        ImageIcon imageIcon = new ImageIcon(img);
                        JLabel imageLabel = new JLabel(imageIcon);
                        imageLabel.setBounds(0, 0, img.getWidth(), img.getHeight());

                        ttdPanel.removeAll();
                        ttdPanel.revalidate();
                        ttdPanel.repaint();
                        ttdPanel.add(imageLabel);
                    } else {
                        System.err.println("Gagal membaca gambar dari file: " + filePath);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            System.out.println("Pemilihan file dibatalkan.");
        }
    }

}
