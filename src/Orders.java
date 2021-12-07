import java.awt.event.*;
import java.util.PriorityQueue;
import java.util.Queue;
import javax.swing.*;



public class Orders extends JPanel {
	JTextField[] Orders = new JTextField[15];
	Queue<JTextField> FoodQueue = new PriorityQueue<JTextField>();
	
    public static JPanel newJPanel() {
        JPanel orders = new JPanel();
        JButton button = new JButton("Home");
        JButton button1 = new JButton("New Order");
        orders.add(button);
        orders.add(button1);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel home = HomePage.newJPanel();
            Main.frame.setContentPane(home);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });
        
        button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel orderView = OrderView.newJPanel();
                Main.frame.setContentPane(orderView);
                Main.frame.validate();
			}
        	
        });
            
        return orders;
    }
}