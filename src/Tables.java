import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.awt.*;

/**
 * 
 * This class contains the method responsible for the Tables Jpanel
 * 
 */
public class Tables extends JPanel {
    static Hashtable<Integer, String> tableStatus = new Hashtable<>();

    /**
     * Sets up the JPanels for table view that can be accessed from the homepage
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel tables = new JPanel(new GridLayout(3, 1));
        JPanel top = new JPanel();
        JPanel middle = new JPanel();
        JPanel bottom = new JPanel();

        // Adds buttons for home and each table
        JLabel status = new JLabel(tableStatus.toString());
        JButton Home = new JButton("Home");
        JButton availability = new JButton("Change Availability");

        // Adds buttons to the JPanel
        top.add(Home);
        middle.add(availability);
        bottom.add(status);
        
        tables.add(top);
        tables.add(middle);
        tables.add(bottom);

        /**
         * Below is the actionListeners for the home Home and Table availibility
         */

        Home.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel home = HomePage.newJPanel();
                Main.frame.setContentPane(home);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        availability.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel panel = TableView.newJPanel();
                Main.frame.setContentPane(panel);
                Main.frame.invalidate();
                Main.frame.validate();
            }

        });

        return tables;
    }
}
