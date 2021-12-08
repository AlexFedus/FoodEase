import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.awt.*;

/**
 * 
 * This class contains the method responsible for the employee management JPanel
 * 
 */
public class EmployeeManagement extends JPanel {
    static Hashtable<String, String> employeeList = new Hashtable<>();

    
    /** 
     * Sets up the EmployeeManagement JPanel that can be accessed from the home page
     * 
     * @return JPanel
     */
    public static JPanel newJPanel() {
        JPanel empMan = new JPanel();
        empMan.setLayout(new FlowLayout());
        JButton button = new JButton("Home");
        JLabel employeeID = new JLabel("Emoloyee ID");
        JTextField id = new JTextField(20);
        JButton Add = new JButton("Add");
        JButton Delete = new JButton("Delete");
        JButton Employees = new JButton ("Employee List");

        
        empMan.add(button);
        empMan.add(employeeID);
        empMan.add(id);
        empMan.add(Add);
        empMan.add(Delete);
        empMan.add(Employees);

        button.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
            JPanel home = HomePage.newJPanel();
            Main.frame.setContentPane(home);
            Main.frame.invalidate();
            Main.frame.validate();
                
            }
            
        });

        Add.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               String empNum = id.getText();
                employeeList.put(empNum, empNum);

                
            }

        });

        Delete.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
               String empNum = id.getText();
                employeeList.remove(empNum);

                
            }

        });

        Employees.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel emps = new JPanel();
                JLabel workerIds = new JLabel(employeeList.toString());
                JButton back = new JButton("Back");
                emps.add(back);
                emps.add(workerIds);
                Main.frame.setContentPane(emps);
                Main.frame.invalidate();
                Main.frame.validate();

                back.addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JPanel back = EmployeeManagement.newJPanel();
                        Main.frame.setContentPane(back);
                        Main.frame.invalidate();
                        Main.frame.validate();
                        
                    }

                });
            
                
            }

        });
        

        return empMan;
    }
 }
