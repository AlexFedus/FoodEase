import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;




public class TableView extends JPanel {
    static String status = "";

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



    
       

        tables.add(button);
        tables.add(availability);
        tables.add(choose);
        tables.add(submit);
        tables.add(currentStatus);
       

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel back = Tables.newJPanel();
            Main.frame.setContentPane(back);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });

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

