import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Form {
    private JFrame frame;
    JLabel lblNama = new JLabel("Nama");
    JTextField txNama = new JTextField(20);

    JLabel lblNim = new JLabel("NIM");
    JTextField txNim = new JTextField(7);

    JLabel lblKelamin = new JLabel("jurusan");
    JRadioButton pria = new JRadioButton("TI");
    JRadioButton wanita = new JRadioButton("Sipil");

    ButtonGroup kelompok = new ButtonGroup();

    JLabel lblHobi = new JLabel("Matkul");
    JCheckBox baca = new JCheckBox("PBO");
    JCheckBox memancing = new JCheckBox("Machine Learning");
    JCheckBox jalan = new JCheckBox("Big Data");

    JButton cetak = new JButton("Cetak");
    JTextArea hasil = new JTextArea();

    public Form() {
        makeFrame();
        frame.setVisible(true);
        aksiReaksi();
    }

    private void makeFrame() {
        frame = new JFrame("Event Sederhana");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        komponenVisual();
    }

    private void komponenVisual() {
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(null);

        panel.add(lblNama);
        lblNama.setBounds(10, 10, 80, 20);

        panel.add(txNama);
        txNama.setBounds(105, 10, 175, 20);

        panel.add(lblNim);
        lblNim.setBounds(10, 33, 80, 20);

        panel.add(txNim);
        txNim.setBounds(105, 33, 70, 20);

        panel.add(lblKelamin);
        lblKelamin.setBounds(10, 56, 80, 20);

        kelompok.add(pria);
        kelompok.add(wanita);

        panel.add(pria);
        pria.setBounds(105, 56, 50, 20);

        panel.add(wanita);
        wanita.setBounds(160, 56, 70, 20);

        panel.add(lblHobi);
        lblHobi.setBounds(10, 80, 70, 20);

        panel.add(baca);
        baca.setBounds(105, 80, 100, 20);

        panel.add(memancing);
        memancing.setBounds(105, 103, 100, 20);

        panel.add(jalan);
        jalan.setBounds(105, 126, 100, 20);

        panel.add(cetak);
        cetak.setBounds(10, 160, 100, 20);

        JScrollPane scrollPane = new JScrollPane(hasil);
        panel.add(scrollPane);
        scrollPane.setBounds(10, 190, 360, 150);
    }

    private void aksiReaksi() {
        cetak.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder output = new StringBuilder();
                output.append("Nama: ").append(txNama.getText()).append("\n");
                output.append("NIM: ").append(txNim.getText()).append("\n");

                if (pria.isSelected()) {
                    output.append("jurusan: TI\n");
                } else if (wanita.isSelected()) {
                    output.append("jurusan: Sipil\n");
                }

                output.append("Matkul: ");
                if (baca.isSelected()) {
                    output.append("PBO, ");
                }
                if (memancing.isSelected()) {
                    output.append("Machine Learning, ");
                }
                if (jalan.isSelected()) {
                    output.append("Big data");
                }
                output.append("\n");

                hasil.setText(output.toString());
            }
        });
    }

    public static void main(String[] args) {
        new Form();
    }
}