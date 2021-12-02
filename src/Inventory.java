import javax.swing.*;

public class Inventory extends JPanel {

    public static JPanel newJPanel() {
        JPanel inventory = new JPanel();
        JButton button = new JButton("test");
        inventory.add(button);
        return inventory;
    }
 }
