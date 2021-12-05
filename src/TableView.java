import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TableView extends JPanel {

    public static JPanel newJPanel() {
        JPanel tables = new JPanel();
        tables.setLayout(new GridLayout(4,2));
        JButton button = new JButton("Back");
    
       

        tables.add(button);
       

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel back = Tables.newJPanel();
            Main.frame.setContentPane(back);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });
            
        

        return tables;



    }
 }

