import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * 
 * This class contains the method responsible for the Kitchen Jpanel
 * 
 */
public class Kitchen extends JPanel {

    /**
     * Sets up the kitchen Jpanel that can be accessed from the homepage
     * Button to Finish Order is Not Working.
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel kitchen = new JPanel(new GridLayout(3, 1));
        JPanel top = new JPanel();
        JPanel middle = new JPanel();
        JPanel bottom = new JPanel();

        JButton Home = new JButton("Home");
        JButton finishOrder = new JButton("Finish Order");
        JLabel table = new JLabel("Table Number");
        JLabel orderLabel = new JLabel("Orders:");
        JLabel orders = new JLabel(Main.FoodQueue.toString());
        JTextField tableNumber = new JTextField(20);

        top.add(Home);
        middle.add(finishOrder);
        middle.add(table);
        middle.add(tableNumber);
        bottom.add(orderLabel);
        bottom.add(orders);

        kitchen.add(top);
        kitchen.add(middle);
        kitchen.add(bottom);

        // ActionListener to return to home page when Home Home is clicked
        Home.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel home = HomePage.newJPanel();
                Main.frame.setContentPane(home);
                Main.frame.invalidate();
                Main.frame.validate();
            }

        });

        // ActionListener to finish an Order selected by table Number.
        finishOrder.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num = tableNumber.getText();
                Main.FoodQueue.remove(Integer.valueOf(num));
                JPanel kitchen = Kitchen.newJPanel();
                Main.frame.setContentPane(kitchen);
                Main.frame.invalidate();
                Main.frame.validate();
            }

        });

        return kitchen;
    }

}
