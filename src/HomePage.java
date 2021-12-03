import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JPanel{
    public static JPanel newJPanel(){
        JPanel content = new JPanel();
       content.setLayout(new BorderLayout());
        content.setBackground(Color.GRAY);

        JButton clockIn = new JButton("Clock In/Clock Out");
        JButton tables= new JButton("Table View");
        JButton orders = new JButton("Orders");
        JButton kitchen= new JButton("Kitchen");
        JButton inventory = new JButton("Inventory");

        content.add(clockIn, BorderLayout.NORTH);
        content.add(tables, BorderLayout.CENTER);
        content.add(orders, BorderLayout.WEST);
        content.add(kitchen, BorderLayout.EAST);
        content.add(inventory, BorderLayout.SOUTH);

        Main.frame.add(content);
        Main.frame.setLocation(200, 200);
        Main.frame.setVisible(true);

        clockIn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel clock = Clock.newJPanel();
                Main.frame.setContentPane(clock);
                Main.frame.invalidate();
                Main.frame.validate();
                
            }

        });
            
        inventory.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel inventory = Inventory.newJPanel();
                Main.frame.setContentPane(inventory);
                Main.frame.invalidate();
                Main.frame.validate();
     
            }
    
        });

        kitchen.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel kitchen = Kitchen.newJPanel();
                Main.frame.setContentPane(kitchen);
                Main.frame.invalidate();
                Main.frame.validate();
     
            }
    
        });

        orders.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel orders = Orders.newJPanel();
                Main.frame.setContentPane(orders);
                Main.frame.invalidate();
                Main.frame.validate();
     
            }
    
        });

        tables.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel tables = Tables.newJPanel();
                Main.frame.setContentPane(tables);
                Main.frame.invalidate();
                Main.frame.validate();
     
            }
    
        });

        return content;

    }

}