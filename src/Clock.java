import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Clock extends JPanel {

    public static JPanel newJPanel() {
        JPanel clock = new JPanel();
        clock.setLayout(new FlowLayout());
        JButton button = new JButton("Home");
        JLabel employeeID = new JLabel("Emoloyee ID");
        JTextField id = new JTextField(20);
        JButton clockIn = new JButton("Clock In");
        JButton clockOut = new JButton("Clock Out");

        
        clock.add(button);
        clock.add(employeeID);
        clock.add(id);
        clock.add(clockIn);
        clock.add(clockOut);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel home = HomePage.newJPanel();
            Main.frame.setContentPane(home);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });

        

        return clock;
    }
 }
