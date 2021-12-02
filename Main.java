
import java.awt.BorderLayout;
import java.awt.LayoutManager;

import javax.swing.*;

public class Main {
    
    public static void main(String args[]){
       JFrame frame = new JFrame("Food-ease");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(600,600);
       JButton clockIn = new JButton("Clock In/Clock Out");
       
       JButton tables= new JButton("Table View");
   
       
       JButton orders = new JButton("Orders");
     
       frame.add(clockIn, BorderLayout.NORTH);
       frame.add(tables, BorderLayout.SOUTH);
       frame.add(orders, BorderLayout.CENTER);
       frame.setVisible(true);


    }
}
