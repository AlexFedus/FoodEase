import java.awt.event.*;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.*;


/**
 * 
 * This class contains the method responsible for the Orders Jpanel
 * 
 */
public class Orders extends JPanel {
	JTextField[] Orders = new JTextField[15];
	Queue<JTextField> FoodQueue = new PriorityQueue<JTextField>();
	
    
    /** 
     * Sets up the JPanel for oders that can be accessed from the honmepage
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel orders = new JPanel();
        JButton button = new JButton("Home");
        JButton button1 = new JButton("New Order");
        orders.add(button);
        orders.add(button1);

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
        
        //ActionListener to open orderView when new order button is clicked
        button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel orderview = OrderView.newJPanel();
                Main.frame.setContentPane(orderview);
                Main.frame.invalidate();
                Main.frame.validate();
				
			}
        	
        });
            
        return orders;
    }
}