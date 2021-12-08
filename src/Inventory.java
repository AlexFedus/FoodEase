import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

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
        JPanel inventory = new JPanel(new GridLayout(2,1));
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();

        JButton menu = new JButton("Menu");
        JButton Home = new JButton("Home");
        JButton manage = new JButton("Inventory Management");
        top.add(Home);
        bottom.add(menu);
        bottom.add(manage);
        inventory.add(top);
        inventory.add(bottom);

        //ActionListener to return to home page when Home Home is clicked
        Home.addActionListener(new ActionListener(){

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
