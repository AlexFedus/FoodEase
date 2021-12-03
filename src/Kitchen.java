import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kitchen extends JPanel {

    public static JPanel newJPanel() {
        JPanel kitchen = new JPanel();
        JButton button = new JButton("Home");
        kitchen.add(button);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel home = HomePage.newJPanel();
            Main.frame.setContentPane(home);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });

        return kitchen;
    }
 }
