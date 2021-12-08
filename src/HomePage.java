//DO NOT ALTER

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * This class contains the method responsible for the home page Jpanel
 * 
 */
public class HomePage extends JPanel{
    
    /** 
     * Sets up the JPanel for the homepage of the project
     * 
     * @return JPanel
     */
    public static JPanel newJPanel(){
        //Sets up JPanel
        JPanel content = new JPanel();
        JPanel subPanel = new JPanel();
        content.setLayout(new BorderLayout());
        content.setBackground(Color.GRAY);

        JButton clockIn = new JButton("Clock In/Clock Out");
        JButton empMan = new JButton("Add/Delete Employee");
        JButton tables= new JButton("Table View");
        JButton orders = new JButton("Orders");
        JButton kitchen= new JButton("Kitchen");
        JButton inventory = new JButton("Inventory");

        subPanel.add(clockIn);
        subPanel.add(empMan);
        content.add(subPanel, BorderLayout.NORTH);
        content.add(tables, BorderLayout.CENTER);
        content.add(orders, BorderLayout.WEST);
        content.add(kitchen, BorderLayout.EAST);
        content.add(inventory, BorderLayout.SOUTH);

        //Adds content to the JPanel
        Main.frame.add(content);
        Main.frame.setLocation(200, 200);
        Main.frame.setVisible(true);


        //ActionListener for clock button
        clockIn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel clock = Clock.newJPanel();
                Main.frame.setContentPane(clock);
                Main.frame.invalidate();
                Main.frame.validate();
                
            }

        });
        
        //ActionListener for Employee Management button
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
        inventory.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel inventory = Inventory.newJPanel();
                Main.frame.setContentPane(inventory);
                Main.frame.invalidate();
                Main.frame.validate();
     
            }
    
        });

        //ActionListener for Kitchen button
        kitchen.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel kitchen = Kitchen.newJPanel();
                Main.frame.setContentPane(kitchen);
                Main.frame.invalidate();
                Main.frame.validate();
     
            }
    
        });

        //ActionListener for orders button
        orders.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel orders = Orders.newJPanel();
                Main.frame.setContentPane(orders);
                Main.frame.invalidate();
                Main.frame.validate();
     
            }
    
        });

        //ActionListener for tables button
        tables.addActionListener(new ActionListener(){

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
