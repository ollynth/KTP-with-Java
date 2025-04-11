package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MainMenu extends JFrame{
    JFrame frame;

    public MainMenu() {
        frame = new JFrame("Sistem Perekaman Data KTP");
        frame.setSize(400, 250);
        frame.setLayout(null);

        JLabel mainMenu = new JLabel("Selamat Datang di Sistem Perekaman Data KTP");
        mainMenu.setBounds(60, 10, 300, 20);
        frame.add(mainMenu);

        // Perekaman
        JButton buttonPerekaman = new JButton("Perekaman");
        buttonPerekaman.setBounds(110, 50, 150, 20);
        frame.add(buttonPerekaman);

        // Pencarian
        JButton buttonPencarian = new JButton("Pencarian");
        buttonPencarian.setBounds(110, 90, 150, 20);
        frame.add(buttonPencarian);

        // Exit
        JButton buttonExit = new JButton("Exit");
        buttonExit.setBounds(110, 130, 150, 20);
        frame.add(buttonExit);

        //pengen dipindahin
        buttonPerekaman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new View.PerekamanData();
            }
        });

        buttonPencarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                new View.PencarianData();
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainMenu();
    }
}
