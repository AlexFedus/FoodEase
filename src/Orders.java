import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Orders extends JPanel {

    public static JPanel newJPanel() {
        JPanel orders = new JPanel();
        JButton button = new JButton("Home");
        orders.add(button);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel home = HomePage.newJPanel();
            Main.frame.setContentPane(home);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });
            
        

        return orders;



    }
 }
