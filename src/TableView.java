import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * 
 * This class contains the method responsible for the TableView Jpanel
 * 
 */

public class TableView extends JPanel {
    static String status = "";

    
    /** 
     * Sets up JPanel for each of the tables and can be used to change availability
     * 
     * Not currently working properly
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel tables = new JPanel();
        tables.setLayout(new GridLayout(5,2));
        JButton button = new JButton("Back");
        JLabel availability = new JLabel("Set Availability:", SwingConstants.CENTER);
        availability.setFont(new Font("Serif", Font.PLAIN, 20));

        JButton submit = new JButton("Submit");
        String[] choices = {
            "Available", "Occupied"
        };
        
        JComboBox choose = new JComboBox(choices);
        JLabel currentStatus = new JLabel("Current Status: " + status, SwingConstants.CENTER);

        // Adds buttons to JPanel
        tables.add(button);
        tables.add(availability);
        tables.add(choose);
        tables.add(submit);
        tables.add(currentStatus);
       

        //ActionListener to go 'back'/ to the Tables Jpanel
        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel back = Tables.newJPanel();
            Main.frame.setContentPane(back);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });

        //ActionListenr to see what was selected
        submit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = (String) choose.getSelectedItem();
                
                if(s == "Available"){
                    status = "Available";
                }
                else{
                    status = "Occupied";
                }
                
                
            }

        });
        

        return tables;



    }
 }

