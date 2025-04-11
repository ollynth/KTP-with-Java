package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import Controller.MainController;
import Model.DataPenduduk;

public class PencarianData {
    JFrame frame;
    ArrayList<DataPenduduk> dataPenduduk;

    public PencarianData() {
        frame = new JFrame("Sistem Perekaman Data KTP");
        frame.setSize(400, 250);
        frame.setLayout(null);

        JLabel titleSearch = new JLabel("Pencarian Data KTP");
        titleSearch.setBounds(130, 15, 300, 20);
        frame.add(titleSearch);

        JLabel searchData = new JLabel("NIK: ");
        searchData.setBounds(40, 50, 200, 20);
        frame.add(searchData);
        JTextField isiSearchData = new JTextField();
        isiSearchData.setBounds(80, 52, 160, 20);
        frame.add(isiSearchData);

        JButton buttonSearch = new JButton("Cari");
        buttonSearch.setBounds(250, 52, 70, 20);
        frame.add(buttonSearch);

        buttonSearch.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dataPenduduk = new ArrayList<>();
                String isiNik = isiSearchData.getText();
                DataPenduduk data = MainController.getUser(isiNik);
                dataPenduduk.add(data);

                new HasilPencarianData(dataPenduduk, isiNik);
                frame.setVisible(false);
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new PencarianData();
    }
}
