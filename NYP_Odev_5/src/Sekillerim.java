import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Sekillerim extends JFrame {

    private Object[] numbers = {1, 2, 3, 4, 5};
    private JComboBox combobox1;
    private JTextField text;
    private JTextField text2;
    private boolean clear;
    private JPanel panel1;
    private JPanel panel2;
    private JButton buton1;
    private JRadioButton radiobutton1;
    private JRadioButton radiobutton2;
    private JRadioButton radiobutton3;
    private JRadioButton radiobutton4;
    private String sekil;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private int x, y, z, t, ug = 5;

    public void paint(Graphics g) {
        super.paint(g);

        // clear background 
        if (clear == true) {
            for (t = 0; t < z; t++) {
                g.setColor(Color.RED);
                if (sekil.equals("dikdortgen")) {
                    g.drawRect(50 + ug, 50 + ug, x, y);
                }
                if (sekil.equals("kare")) {
                    g.drawRect(50 + ug, 50 + ug, x, y);
                }
                if (sekil.equals("daire")) {
                    g.drawOval(50 + ug, 50 + ug, x, y);
                }
                if (sekil.equals("cizgi")) {
                    g.drawLine(x, 50 + y, x, y);
                }

                ug += 10;

                x = x - 20;
                y = y - 20;
            }
        }
    }

    public Sekillerim() {
        super("Şekilleri Çizdirme");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(500, 500);
        setVisible(true);
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3, 3));
        panel2.setBackground(Color.WHITE);
        add(panel2, BorderLayout.SOUTH);

        label1 = new JLabel("SAYI");
        panel2.add(label1);

        combobox1 = new JComboBox(numbers);
        combobox1.setMaximumRowCount(5);
        panel2.add(combobox1);

        label3 = new JLabel("GENİŞLİK/UZUNLUK");
        panel2.add(label3);

        text = new JTextField(20);

        text.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                    }
                });
        panel2.add(text);

        label2 = new JLabel("YÜKSEKLİK");
        panel2.add(label2);
        text2 = new JTextField(20);

        text2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                    }
                });
        panel2.add(text2);

        panel1 = new JPanel();
        panel1.setBackground(Color.WHITE);
        add(panel1, BorderLayout.CENTER);
        radiobutton1 = new JRadioButton("Dikdörtgen", false);
        panel2.add(radiobutton1);
        radiobutton2 = new JRadioButton("Çizgi", false);
        panel2.add(radiobutton2);
        radiobutton3 = new JRadioButton("Daire", false);
        panel2.add(radiobutton3);
        radiobutton4 = new JRadioButton("Kare", false);
        panel2.add(radiobutton4);

        buton1 = new JButton("ÇİZ");
        panel2.add(buton1);
        buton1.addActionListener(new buton1Handler());

    }

    private class buton1Handler implements ActionListener {

        public void actionPerformed(ActionEvent ae) {

            if (radiobutton1.isSelected() == true) {
                sekil = "dikdortgen";
            }
            if (radiobutton2.isSelected() == true) {
                sekil = "cizgi";
            }
            if (radiobutton3.isSelected() == true) {
                sekil = "daire";
            }
            if (radiobutton4.isSelected() == true) {
                sekil = "kare";
            }
            x = Integer.parseInt(text.getText());
            y = Integer.parseInt(text2.getText());
            z = (Integer) combobox1.getSelectedItem();

            clear = true;
            repaint();
        }
    }
}