import javax.swing.*;
import java.awt.*;

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

       return content;

       clockIn.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            JPanel clock = Clock.newJPanel();
            frame.setContentPane(clock);
            frame.invalidate();
            frame.validate();
 
        }

    });

    inventory.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            JPanel inventory = Inventory.newJPanel();
            frame.setContentPane(inventory);
            frame.invalidate();
            frame.validate();
 
        }

    });

    kitchen.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            JPanel kitchen = Kitchen.newJPanel();
            frame.setContentPane(kitchen);
            frame.invalidate();
            frame.validate();
 
        }

    });

    orders.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            JPanel orders = Orders.newJPanel();
            frame.setContentPane(orders);
            frame.invalidate();
            frame.validate();
 
        }

    });

    tables.addActionListener(new ActionListener(){

        @Override
        public void actionPerformed(ActionEvent e) {
            JPanel tables = Tables.newJPanel();
            frame.setContentPane(tables);
            frame.invalidate();
            frame.validate();
            
        
        }

    });

    
       
    }
}
