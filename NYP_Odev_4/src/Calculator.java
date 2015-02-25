// Fatih Bozik
// 1358120003
// Nesneye Yönelik Programlama
// Ödev 4

// ASXBAXASXA
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener
{
    private JButton keys[];
    private JPanel keyPad;
    private JTextArea text;
    private String lastProcess;
    double num1, num2, result;

    public Calculator()
    {
        super("Calculator");

        text = new JTextArea(1, 20);
        text.setEditable(true);

        keys = new JButton[16];

        for(int i = 0; i <= 9; i++)
            keys[i] = new JButton(String.valueOf(i));

        keys[10] = new JButton("/");
        keys[11] = new JButton("*");
        keys[12] = new JButton("-");
        keys[13] = new JButton("+");
        keys[14] = new JButton("=");
        keys[15] = new JButton(".");

        keyPad = new JPanel();
        keyPad.setLayout(new GridLayout(4, 4));

        for(int i = 7; i <= 10; i++)
        {
            keyPad.add(keys[i]);
            keys[i].addActionListener(this);
        }

        for(int i = 4; i <= 6; i++)
        {
            keyPad.add(keys[i]);
            keys[i].addActionListener(this);
        }

        keyPad.add(keys[11]);
        keys[11].addActionListener(this);

        for(int i = 1; i <= 3; i++)
        {
            keyPad.add(keys[i]);
            keys[i].addActionListener(this);
        }

        keyPad.add(keys[12]);
        keys[12].addActionListener(this);

        keyPad.add(keys[0]);
        keys[0].addActionListener(this);

        for(int i = 15; i >= 13; i--)
        {
            keyPad.add(keys[i]);
            keys[i].addActionListener(this);
        }

        Container container = getContentPane();
        container.add(text, BorderLayout.NORTH);
        container.add(keyPad ,BorderLayout.CENTER);

        setSize(200, 200);
        setVisible(true);

    }

    public static void main(String args[])
    {
        Calculator application = new Calculator();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent event)
    {
        for(int i = 0; i <= 9; i++)
        {
            if(event.getSource() == keys[i])
            {
                text.append(Integer.toString(i));
            }
        }
        if(event.getSource() == keys[10])
        {
            num1 = Double.valueOf(text.getText());
            text.setText("");
            lastProcess = "/";
        }
        if(event.getSource() == keys[11])
        {
            num1 = Double.valueOf(text.getText());
            text.setText("");
            lastProcess = "*";
        }
        if(event.getSource() == keys[12])
        {
            num1 = Double.valueOf(text.getText());
            text.setText("");
            lastProcess = "-";
        }
        if(event.getSource() == keys[13])
        {
            num1 = Double.valueOf(text.getText());
            text.setText("");
            lastProcess = "+";
        }
        if(event.getSource() == keys[15])
        {
            text.append(".");
        }
        if(event.getSource() == keys[14])
        {
            num2 = Double.valueOf(text.getText());

            if(lastProcess == "+") result = num1 + num2;
            else if(lastProcess == "-") result = num1 - num2;
            else if(lastProcess == "*") result = num1 * num2;
            else if(lastProcess == "/") result = num1 / num2;

            text.setText(Double.toString(result));
        }


    }

}


 
