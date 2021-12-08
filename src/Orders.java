import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

/**
 * This class contains the method responsible for the Orders JPanel.
 */
public class Orders extends JPanel {

    /**
     * Sets up JPanel for the Orders view that can be accessed from the homepage.
     * Delete Order Button has to be implemented.
     * New Order Button does not add orders to FoodQueue.
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel orders = new JPanel();
        orders.setLayout(new GridLayout(3, 1));

        // Buttons are created then added to the JPanel
        JButton button = new JButton("Home");
        JButton button1 = new JButton("New Order");
        JButton button2 = new JButton("Delete Order");
        JPanel top = new JPanel();
        top.add(button);
        orders.add(top);
        JPanel middle = new JPanel();
        middle.add(button1);
        orders.add(middle);
        JPanel bottom = new JPanel();
        bottom.add(button2);
        orders.add(bottom);

        // Home button is given action listener to change frame back to homepage.
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel home = HomePage.newJPanel();
                Main.frame.setContentPane(home);
                Main.frame.invalidate();
                Main.frame.validate();
            }

        });
        // New Order Button is given action listener to change frame to Orderview.
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel orderView = OrderView.newJPanel();
                Main.frame.setContentPane(orderView);
                Main.frame.invalidate();
                Main.frame.validate();
            }
        });

        return orders;
    }
}