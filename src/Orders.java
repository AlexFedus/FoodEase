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
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel orders = new JPanel();
        orders.setLayout(new GridLayout(3, 1));

        // Buttons are created then added to the JPanel
        JButton Home = new JButton("Home");
        JButton newOrder = new JButton("New Order");
        JButton editOrder = new JButton("Edit Order");
        JButton deleteOrder = new JButton("Delete Order");

        JPanel top = new JPanel();
        JPanel middle = new JPanel();
        JPanel bottom = new JPanel();

        JLabel ordersLabel = new JLabel("Orders");
        JLabel displayOrders = new JLabel(Main.FoodQueue.toString());

        top.add(Home);
        middle.add(newOrder);
        middle.add(editOrder);
        middle.add(deleteOrder);
        bottom.add(ordersLabel);
        bottom.add(displayOrders);

        orders.add(top);
        orders.add(middle);
        orders.add(bottom);

        // Home is given action listener to change frame back to homepage.
        Home.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel home = HomePage.newJPanel();
                Main.frame.setContentPane(home);
                Main.frame.invalidate();
                Main.frame.validate();
            }

        });
        // New Order Button is given action listener to change frame to Orderview.
        newOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel orderView = NewOrderView.newJPanel();
                Main.frame.setContentPane(orderView);
                Main.frame.invalidate();
                Main.frame.validate();
            }
        });

        // Edit Order Button is given action listener to change frame to Orderview.
        editOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        // Delete Order Button is given action listener to change frame to Orderview.
        deleteOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel deleteView = new JPanel(new FlowLayout());

                JLabel number = new JLabel("Table Number:");
                JTextField tableNumber = new JTextField(30);
                JButton Delete = new JButton("Delete");
                JButton back = new JButton("Back");

                deleteView.add(number);
                deleteView.add(tableNumber);
                deleteView.add(Delete);
                deleteView.add(back);

                Main.frame.setContentPane(deleteView);
                Main.frame.invalidate();
                Main.frame.validate();

                Delete.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String num = tableNumber.getText();
                        Main.FoodQueue.remove(Integer.valueOf(num));

                        JPanel orders = Orders.newJPanel();
                        Main.frame.setContentPane(orders);
                        Main.frame.invalidate();
                        Main.frame.validate();
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
            }
        });

        return orders;
    }
}