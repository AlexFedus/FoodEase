//DO NOT ALTER

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import java.awt.*;
import java.awt.event.*;

/**
 * 
 * This class contains the method responsible for the home page Jpanel
 * 
 */
public class HomePage extends JPanel {

    /**
     * Sets up the JPanel for the homepage of the project
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        // Sets up JPanel
        JPanel content = new JPanel(new BorderLayout());
        JPanel northPanel = new JPanel();
        JPanel westPanel = new JPanel(new GridLayout(2,1));
        JPanel eastPanel = new JPanel(new GridLayout(2,1));
        JPanel southPanel = new JPanel();

        content.setBackground(Color.BLACK);
        JLabel title = new JLabel("Food-Ease Restaurant System");
        title.setFont(new Font("Seref", 2, 30));
        JButton clockIn = new JButton("Clock In/Clock Out");
        JButton empMan = new JButton("Add/Delete Employee");
        JButton tables = new JButton("Table View");
        JButton orders = new JButton("           Orders           ");
        JButton kitchen = new JButton("  Kitchen  ");
        JButton inventory = new JButton("Inventory");

        northPanel.add(title);
        westPanel.add(clockIn);
        westPanel.add(empMan);
        eastPanel.add(orders);
        eastPanel.add(kitchen);
        southPanel.add(inventory);

        content.add(northPanel, BorderLayout.NORTH);
        content.add(westPanel, BorderLayout.WEST);
        content.add(tables, BorderLayout.CENTER);
        content.add(eastPanel, BorderLayout.EAST);
        content.add(southPanel, BorderLayout.SOUTH);

        // Adds content to the JPanel
        Main.frame.add(content);
        Main.frame.setLocation(200, 200);
        Main.frame.setVisible(true);

        // ActionListener for clock button
        clockIn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel clock = Clock.newJPanel();
                Main.frame.setContentPane(clock);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        // ActionListener for Employee Management button
        empMan.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel empMan = EmployeeManagement.newJPanel();
                Main.frame.setContentPane(empMan);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        // ActionListener for inventory button
        inventory.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel inventory = Inventory.newJPanel();
                Main.frame.setContentPane(inventory);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        // ActionListener for Kitchen button
        kitchen.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel kitchen = Kitchen.newJPanel();
                Main.frame.setContentPane(kitchen);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        // ActionListener for orders button
        orders.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel orders = Orders.newJPanel();
                Main.frame.setContentPane(orders);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        // ActionListener for tables button
        tables.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel tables = Tables.newJPanel();
                Main.frame.setContentPane(tables);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        return content;

    }

}
