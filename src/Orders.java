import java.awt.event.*;
import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Orders extends JPanel {
    public static Queue<String[]> FoodQueue = new PriorityQueue<String[]>();

    public static JPanel newJPanel() {
        JPanel orders = new JPanel();
        orders.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton button = new JButton("Home");
        JButton button1 = new JButton("New Order");
        JButton button2 = new JButton("Edit Order");

        orders.add(button);
        orders.add(button1);
        orders.add(button2);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel home = HomePage.newJPanel();
                Main.frame.setContentPane(home);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel orderView = OrderView.newJPanel();
                Main.frame.setContentPane(orderView);
                Main.frame.invalidate();
                Main.frame.validate();
                FoodQueue.add(OrderView.orderInfo);
            }
        });

        button2.addActionListener(new ActionListener() {

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