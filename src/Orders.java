import javax.swing.*;

public class Orders extends JPanel {

    public static JPanel newJPanel() {
        JPanel orders = new JPanel();
        JButton button = new JButton("test");
        orders.add(button);
        return orders;
    }
 }
