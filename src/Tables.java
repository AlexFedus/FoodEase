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


        table1.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                String getStatus1 = TableView.status;
                final String getStatus1A = getStatus1;
                
                JLabel currentStatus1 = new JLabel("Current Status: " + getStatus1A, SwingConstants.CENTER);
                table1View.add(currentStatus1);

                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table2.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table2View = TableView.newJPanel();
                String getStatus2 = TableView.status;
                
                JLabel currentStatus2 = new JLabel("Current Status: " + getStatus2, SwingConstants.CENTER);
                table2View.add(currentStatus2);

                Main.frame.setContentPane(table2View);
                Main.frame.setContentPane(table2View);
                Main.frame.validate();
                
            }

        });

        table3.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table4.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table5.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table6.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table7.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table8.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table9.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table10.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table11.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table12.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table13.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table14.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table15.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table16.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });

        table17.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });
        table18.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });
        table19.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });
        table20.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });
        table21.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });
        table22.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });
        table23.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });
        table24.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });
        table25.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel table1View = TableView.newJPanel();
                Main.frame.setContentPane(table1View);
                Main.frame.setContentPane(table1View);
                Main.frame.validate();
                
            }

        });
 








        return tables;
    }
 }
