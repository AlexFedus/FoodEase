import javax.swing.JPanel;

public class OrderView extends JPanel {
	
	public static JPanel newJPanel() {
		JPanel orders = new JPanel();
        orders.setLayout(new FlowLayout());

        JLabel text1 = new JLabel("Enter Table Number:");
        JTextField tableNum = new JTextField();

        JLabel text2 = new JLabel("Enter Meals:")

        JTextField Meal1 = new JTextField("Meal 1:");
        JTextField Meal2 = new JTextField("Meal 2:");
        JTextField Meal3 = new JTextField("Meal 3:");
        JTextField Meal4 = new JTextField("Meal 4:");
        JTextField Meal5 = new JTextField("Meal 5:");

        orders.add(text1);
        orders.add(tableNum);
        orders.add(text2);
        orders.add(Meal1);
        orders.add(Meal2);
        orders.add(Meal3);
        orders.add(Meal4);
        orders.add(Meal5);
        
		return orders;
	}
}
