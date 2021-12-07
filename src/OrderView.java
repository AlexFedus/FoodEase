import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * This class contains the method responsible for the OrderView Jpanel
 * 
 */
public class OrderView extends JPanel {
	
	
    /** 
     * Sets up the Jpanel that is used to add/view current orders
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
		JPanel orders = new JPanel();
        orders.setLayout(new FlowLayout());

        JLabel text1 = new JLabel("Enter Table Number:");
        JTextField tableNum = new JTextField();

        JLabel text2 = new JLabel("Enter Meals:");

        JButton back = new JButton("Back");
        JTextField Meal1 = new JTextField("Meal 1:");
        JTextField Meal2 = new JTextField("Meal 2:");
        JTextField Meal3 = new JTextField("Meal 3:");
        JTextField Meal4 = new JTextField("Meal 4:");
        JTextField Meal5 = new JTextField("Meal 5:");

        orders.add(back);
        orders.add(text1);
        orders.add(tableNum);
        orders.add(text2);
        orders.add(Meal1);
        orders.add(Meal2);
        orders.add(Meal3);
        orders.add(Meal4);
        orders.add(Meal5);

        //ActionListener to go 'back'/ to the Orders Jpanel
        back.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel back = Orders.newJPanel();
                Main.frame.setContentPane(back);
                Main.frame.invalidate();
                Main.frame.validate();
                
            }
    
});

        
		return orders;
	}
}
