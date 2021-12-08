import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class contains the method responsible for the TableView Jpanel
 */
public class TableView extends JPanel {

    /**
     * Sets up JPanel for each of the tables and can be used to change availability
     * Not currently working properly, availability status is shared among tables
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel tables = new JPanel(new GridLayout(3, 1));
        JPanel top = new JPanel();
        JPanel middle = new JPanel();
        JPanel bottom = new JPanel();
        String[] choices = {
                "Available", "Occupied"
        };
        JButton back = new JButton("Back");
        JButton submit = new JButton("Submit");
        JComboBox choose = new JComboBox(choices);
        JTextField tableNum = new JTextField(30);

        JLabel table = new JLabel("Table Number:");
        JLabel availability = new JLabel("Set Availability:");

        // Adds buttons to JPanel
        top.add(back);
        middle.add(availability);
        middle.add(choose);
        middle.add(table);
        middle.add(tableNum);
        bottom.add(submit);

        tables.add(top);
        tables.add(middle);
        tables.add(bottom);

        // ActionListener to go 'back'/ to the Tables Jpanel
        back.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel back = Tables.newJPanel();
                Main.frame.setContentPane(back);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        // ActionListenr to see what was selected
        submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String status = String.valueOf(choose.getSelectedItem());
                if (!status.equals("Available")) {
                    Tables.tableStatus.put(Integer.valueOf(tableNum.getText()), status);
                } else {
                    Tables.tableStatus.remove(Integer.valueOf(tableNum.getText()));
                }
                JPanel back = Tables.newJPanel();
                Main.frame.setContentPane(back);
                Main.frame.invalidate();
                Main.frame.validate();
            }

        });

        return tables;

    }
}
