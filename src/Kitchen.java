import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * This class contains the method responsible for the Kitchen Jpanel
 * 
 */
public class Kitchen extends JPanel {

    
    /** 
     * Sets up the kitchen Jpanel that can be accessed from the homepage
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel kitchen = new JPanel();
        JButton button = new JButton("Home");
        JButton button1 = new JButton("Finish Order");
        kitchen.add(button);

        //ActionListener to return to home page when Home button is clicked
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
