import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class contains the method responsible for the NewOrderView's JPanel accessed by the Orders view.
 */
public class NewOrderView extends JPanel {
    /**
     * Sets up JPanel for NewOrderView that can be accessed from the Order's view from
     * the homepage.
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel orders = new JPanel(new FlowLayout());

        // Creates Buttons, Labels, and JTextFields and adds them to the JPanel.
        JButton back = new JButton("Back");
        JButton submit = new JButton("Finish");
        
        
        JLabel text = new JLabel("Enter Table Number:");
        JLabel text1 = new JLabel("Meal 1:");
        JLabel text2 = new JLabel("Meal 2:");
        JLabel text3 = new JLabel("Meal 3:");
        JLabel text4 = new JLabel("Meal 4:");
        JLabel text5 = new JLabel("Meal 5:");

        JTextField tableNum = new JTextField(30);
        JTextField Meal1 = new JTextField(40);
        JTextField Meal2 = new JTextField(40);
        JTextField Meal3 = new JTextField(40);
        JTextField Meal4 = new JTextField(40);
        JTextField Meal5 = new JTextField(40);

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
                Integer num = Integer.valueOf(tableNum.getText());
                String meals = String.format("%s, %s, %s, %s, %s", Meal1.getText(),Meal2.getText(),Meal3.getText(),Meal4.getText(),Meal5.getText());
                Main.FoodQueue.put(num, meals);
                Main.frame.invalidate();
                Main.frame.validate();
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
