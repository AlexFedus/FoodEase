import javax.swing.*;

public class Clock extends JPanel {

    public static JPanel newJPanel() {
        JPanel clock = new JPanel();
        JButton button = new JButton("test");
        clock.add(button);
        return clock;
    }
 }
