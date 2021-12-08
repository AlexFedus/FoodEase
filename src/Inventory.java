import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * This class contains the method responsible for the Inventory Jpanel
 * 
 */
public class Inventory extends JPanel {

    
    /** 
     * Sets up the JPanel for the Inventory tab that can be accessed from the hompeage
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        //Sets up JPanel
        JPanel inventory = new JPanel();
        JButton menu = new JButton("Menu");
        JButton button = new JButton("Home");
        inventory.add(button);
        inventory.add(menu);

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

        menu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuBar menu = Menu.newJMenuBar();
				Main.frame.setContentPane(menu);
				Main.frame.invalidate();
				Main.frame.validate();
				
			}
        	
        });

        return inventory;
    }
 }
