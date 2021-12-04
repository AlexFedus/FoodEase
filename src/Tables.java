import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class Tables extends JPanel {

    public static JPanel newJPanel() {
        JPanel tables = new JPanel();
        tables.setLayout(new FlowLayout());
        JButton button = new JButton("Home");
        JButton table1 = new JButton("1");
        JButton table2 = new JButton("2");
        JButton table3 = new JButton("3");
        JButton table4 = new JButton("4");
        JButton table5 = new JButton("5");
        JButton table6 = new JButton("6");
        JButton table7 = new JButton("7");
        JButton table8 = new JButton("8");
        JButton table9 = new JButton("9");
        JButton table10 = new JButton("10");
        JButton table11 = new JButton("11");
        JButton table12 = new JButton("12");
        JButton table13 = new JButton("13");
        JButton table14 = new JButton("14");
        JButton table15 = new JButton("15");
        JButton table16 = new JButton("16");
        JButton table17 = new JButton("17");
        JButton table18 = new JButton("18");
        JButton table19 = new JButton("19");
        JButton table20 = new JButton("20");
        JButton table21 = new JButton("21");
        JButton table22 = new JButton("22");
        JButton table23 = new JButton("23");
        JButton table24 = new JButton("24");
        JButton table25 = new JButton("25");

        tables.add(button);

        tables.add(table1);
        tables.add(table2);
        tables.add(table3);
        tables.add(table4);
        tables.add(table5);
        tables.add(table6);
        tables.add(table7);
        tables.add(table8);
        tables.add(table9);
        tables.add(table10);
        tables.add(table11);
        tables.add(table12);
        tables.add(table13);
        tables.add(table14);
        tables.add(table15);
        tables.add(table16);
        tables.add(table17);
        tables.add(table18);
        tables.add(table19);
        tables.add(table20);
        tables.add(table21);
        tables.add(table22);
        tables.add(table23);
        tables.add(table24);
        tables.add(table25);

        
    



        

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel home = HomePage.newJPanel();
            Main.frame.setContentPane(home);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });

        
            

        



        return tables;
    }
 }
