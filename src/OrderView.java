import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class contains the method responsible for the Orderview's JPanel inside
 * of the Orders view.
 */
public class OrderView extends JPanel {
    // Creates String[] to add to FoodQueue in Main class.
    static String[] orderInfo = new String[5];

    /**
     * Sets up JPanel for Orderview that can be accessed from the Order's view from
     * the homepage.
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel orders = new JPanel();
        orders.setLayout(new FlowLayout());

        // Creates and Labels, Buttons, and JTextFields and adds them to the JPanel.
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

        // Submit Button is given action listener to add the new Order to FoodQueue in
        // Main Class.
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                orderInfo[0] = (tableNum.getText());
                orderInfo[1] = (Meal1.getText());
                orderInfo[2] = (Meal2.getText());
                orderInfo[3] = (Meal3.getText());
                orderInfo[4] = (Meal4.getText());
                orderInfo[5] = (Meal5.getText());
                Main.FoodQueue.add(orderInfo);
                System.out.println(orderInfo[0] + orderInfo[1]);
            }
        });

        // Back Button is given action listener to change the frame back to Orders view.
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
