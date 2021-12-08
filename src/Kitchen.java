import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/**
 * 
 * This class contains the method responsible for the Kitchen Jpanel
 * 
 */
public class Kitchen extends JPanel {

    /**
     * Sets up the kitchen Jpanel that can be accessed from the homepage
     * Button to Finish Order is Not Working.
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel kitchen = new JPanel(new GridLayout(3, 1));
        JButton button = new JButton("Home");
        JButton button1 = new JButton("Finish Order");
        JLabel tableNum = new JLabel("Table Number");
        JTextField finishedOrder = new JTextField(20);
        JPanel middle = new JPanel();
        JPanel bottom = new JPanel();

        kitchen.add(button);
        middle.add(button1);
        middle.add(tableNum);
        middle.add(finishedOrder);
        kitchen.add(middle);
        
        //Display current orders in FoodQueue.
        //Currently Not working due to other problems.
        for (String[] order : Main.FoodQueue) {
            JLabel label = new JLabel(order[0]);
            bottom.add(label);
        }
        kitchen.add(bottom);

        // ActionListener to return to home page when Home button is clicked
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel home = HomePage.newJPanel();
                Main.frame.setContentPane(home);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });
        //ActionListener to finish an Order selected by table Number. 
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String num = finishedOrder.getText();
                
            }

        });

        return kitchen;
    }

}
