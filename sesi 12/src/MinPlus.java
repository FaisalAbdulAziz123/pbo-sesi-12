import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MinPlus implements ActionListener {
    private JFrame fr;
    private int num;
    private JButton btnPlus, btnMin;
    private JLabel numL;

    public MinPlus() {
        num = 0;
        buatFrame();
        fr.setVisible(true);
    }

    private void buatFrame() {
        fr = new JFrame("Event Sederhana");
        fr.setSize(250, 100);
        JPanel pn = (JPanel) fr.getContentPane();
        pn.setLayout(new BorderLayout());

        JPanel p = new JPanel();
        btnMin = new JButton("minus");
        btnMin.addActionListener(this);
        p.add(btnMin);

        numL = new JLabel("0", SwingConstants.CENTER);
        pn.add(p, BorderLayout.NORTH);
        pn.add(numL, BorderLayout.CENTER);
        btnPlus = new JButton("plus");
        btnPlus.addActionListener(this);
        pn.add(btnPlus, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String opr = e.getActionCommand();
        if (opr.equals("minus")) {
            kurang();
        } else if (opr.equals("plus")) {
            tambah();
        }
        numL.setText(num + "");
    }
    public void tambah() {
        num++;
    }

    public void kurang() {
        num--;
    }

    public static void main(String[] args) {
        new MinPlus();
    }
}