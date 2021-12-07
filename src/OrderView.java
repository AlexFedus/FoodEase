import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OrderView extends JPanel {
    static String[] orderInfo = new String[5];

    public static JPanel newJPanel() {
        JPanel orders = new JPanel();
        orders.setLayout(new FlowLayout());

        JButton back = new JButton("Back");
        JLabel text = new JLabel("Enter Table Number:");
        JTextField tableNum = new JTextField(30);

        JLabel text1 = new JLabel("Meal 1:");
        JTextField Meal1 = new JTextField(40);
        JLabel text2 = new JLabel("Meal 2:");
        JTextField Meal2 = new JTextField(40);
        JLabel text3 = new JLabel("Meal 3:");
        JTextField Meal3 = new JTextField(40);
        JLabel text4 = new JLabel("Meal 4:");
        JTextField Meal4 = new JTextField(40);
        JLabel text5 = new JLabel("Meal 5:");
        JTextField Meal5 = new JTextField(40);
        JButton submit = new JButton("Finish");
        orders.add(text);
        orders.add(tableNum);
        orders.add(text1);
        orders.add(Meal1);
        orders.add(text2);
        orders.add(Meal2);
        orders.add(text3);
        orders.add(Meal3);
        orders.add(text4);
        orders.add(Meal4);
        orders.add(text5);
        orders.add(Meal5);
        orders.add(submit);
        orders.add(back);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orderInfo[0] = (tableNum.getText());
                orderInfo[1] = (Meal1.getText());
                orderInfo[2] = (Meal2.getText());
                orderInfo[3] = (Meal3.getText());
                orderInfo[4] = (Meal4.getText());
                orderInfo[5] = (Meal5.getText());
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel back = Orders.newJPanel();
                Main.frame.setContentPane(back);
                Main.frame.invalidate();
                Main.frame.validate();
            }
        });
        return orders;
    }
}
