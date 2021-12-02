import javax.swing.*;

public class Kitchen extends JPanel {

    public static JPanel newJPanel() {
        JPanel kitchen = new JPanel();
        JButton button = new JButton("test");
        kitchen.add(button);
        return kitchen;
    }
 }
