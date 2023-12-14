import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
    JFrame jFrame = new JFrame();
    JTextField textField = new JTextField();
    JButton button_0 = new JButton();
    JButton button_1 = new JButton();
    JButton button_2 = new JButton();
    JButton button_3 = new JButton();
    JButton button_4 = new JButton();
    JButton button_5 = new JButton();
    JButton button_6 = new JButton();
    JButton button_7 = new JButton();
    JButton button_8 = new JButton();
    JButton button_9 = new JButton();
    JButton button_point = new JButton();
    JButton button_B1 = new JButton();
    JButton button_B2 = new JButton();
    JButton button_add = new JButton();
    JButton button_sub = new JButton();
    JButton button_mul = new JButton();
    JButton button_div = new JButton();
    JButton button_del = new JButton();
    JButton button_ac = new JButton();
    JButton button_equal = new JButton();

    public Calculator() {

        jFrame.setBounds(600, 150, 375, 520);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setTitle("Calculator");
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        textField.setBounds(25, 50, 310, 50);
        jFrame.add(textField);

        button_B1.setBounds(30, 150, 60, 40);
        button_B1.setText("(");
        jFrame.add(button_B1);
        button_B1.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_B2.setBounds(110, 150, 60, 40);
        button_B2.setText(")");
        jFrame.add(button_B2);
        button_B2.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_del.setBounds(190, 150, 60, 40);
        button_del.setText("DEL");
        jFrame.add(button_del);
        button_del.setFont(new Font("SansSerif", Font.BOLD, 13));

        button_ac.setBounds(270, 150, 60, 40);
        button_ac.setText("AC");
        jFrame.add(button_ac);
        button_ac.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_7.setBounds(30, 210, 60, 40);
        button_7.setText("7");
        jFrame.add(button_7);
        button_7.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_8.setBounds(110, 210, 60, 40);
        button_8.setText("8");
        jFrame.add(button_8);
        button_8.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_9.setBounds(190, 210, 60, 40);
        button_9.setText("9");
        jFrame.add(button_9);
        button_9.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_mul.setBounds(270, 210, 60, 40);
        button_mul.setText("*");
        jFrame.add(button_mul);
        button_mul.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_4.setBounds(30, 270, 60, 40);
        button_4.setText("4");
        jFrame.add(button_4);
        button_4.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_5.setBounds(110, 270, 60, 40);
        button_5.setText("5");
        jFrame.add(button_5);
        button_5.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_6.setBounds(190, 270, 60, 40);
        button_6.setText("6");
        jFrame.add(button_6);
        button_6.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_div.setBounds(270, 270, 60, 40);
        button_div.setText("/");
        jFrame.add(button_div);
        button_div.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_1.setBounds(30, 330, 60, 40);
        button_1.setText("1");
        jFrame.add(button_1);
        button_1.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_2.setBounds(110, 330, 60, 40);
        button_2.setText("2");
        jFrame.add(button_2);
        button_2.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_3.setBounds(190, 330, 60, 40);
        button_3.setText("3");
        jFrame.add(button_3);
        button_3.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_sub.setBounds(270, 330, 60, 40);
        button_sub.setText("-");
        jFrame.add(button_sub);
        button_sub.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_0.setBounds(30, 390, 60, 40);
        button_0.setText("0");
        jFrame.add(button_0);
        button_0.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_point.setBounds(110, 390, 60, 40);
        button_point.setText(".");
        jFrame.add(button_point);
        button_point.setFont(new Font("SansSerif", Font.BOLD, 20));

        button_equal.setBounds(190, 390, 60, 40);
        button_equal.setText("=");
        jFrame.add(button_equal);
        button_equal.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_add.setBounds(270, 390, 60, 40);
        button_add.setText("+");
        jFrame.add(button_add);
        button_add.setFont(new Font("SansSerif", Font.BOLD, 15));

        button_0.addActionListener(this);
        button_1.addActionListener(this);
        button_2.addActionListener(this);
        button_3.addActionListener(this);
        button_4.addActionListener(this);
        button_5.addActionListener(this);
        button_6.addActionListener(this);
        button_7.addActionListener(this);
        button_8.addActionListener(this);
        button_9.addActionListener(this);
        button_B1.addActionListener(this);
        button_B2.addActionListener(this);
        button_add.addActionListener(this);
        button_sub.addActionListener(this);
        button_mul.addActionListener(this);
        button_div.addActionListener(this);
        button_equal.addActionListener(this);
        button_point.addActionListener(this);
        button_del.addActionListener(this);
        button_ac.addActionListener(this);

    }
   public void actionPerformed(ActionEvent e) {

   }
}


class Main {
    public static void main(String[] args) {
        new Calculator();
    }
}
