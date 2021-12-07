import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.awt.*;

/**
 * 
 * This class contains the method responsible for the clock Jpanel
 * 
 */
public class Clock extends JPanel {
    static Hashtable<String, String> currentWorking = new Hashtable<>();

    
    /** 
     * Sets up the clock JPanel that can be accessed from the home page
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel clock = new JPanel();
        clock.setLayout(new FlowLayout());
        JButton button = new JButton("Home");
        JLabel employeeID = new JLabel("Emoloyee ID");
        JTextField id = new JTextField(20);
        JButton clockIn = new JButton("Clock In");
        JButton clockOut = new JButton("Clock Out");
        JButton workers = new JButton ("Current Workers");

        
        clock.add(button);
        clock.add(employeeID);
        clock.add(id);
        clock.add(clockIn);
        clock.add(clockOut);
        clock.add(workers);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel home = HomePage.newJPanel();
            Main.frame.setContentPane(home);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });

        clockIn.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               String empNum = id.getText();
                currentWorking.put(empNum, empNum);

                
            }

        });

        clockOut.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               String empNum = id.getText();
                currentWorking.remove(empNum);

                
            }

        });

        workers.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel CurrentWorkers = new JPanel();
                JLabel workerIds = new JLabel(currentWorking.toString());
                JButton back = new JButton("Back");
                CurrentWorkers.add(back);
                CurrentWorkers.add(workerIds);
                Main.frame.setContentPane(CurrentWorkers);
                Main.frame.invalidate();
                Main.frame.validate();

                back.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JPanel back = Clock.newJPanel();
                        Main.frame.setContentPane(back);
                        Main.frame.invalidate();
                        Main.frame.validate();
                        
                    }

                });
            
                
            }

        });
        

        return clock;
    }
 }
