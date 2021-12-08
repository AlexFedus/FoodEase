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
        JPanel empMan = new JPanel(new GridLayout(2, 1));
        JButton Home = new JButton("Home");
        JButton Add = new JButton("Add");
        JButton Delete = new JButton("Delete");
        JButton Employees = new JButton("Employee List");
        JLabel employeeID = new JLabel("Emoloyee ID");
        JTextField id = new JTextField(20);
        JPanel top = new JPanel();
        JPanel bottom = new JPanel();

        top.add(Home);
        bottom.add(employeeID);
        bottom.add(id);
        bottom.add(Add);
        bottom.add(Delete);
        bottom.add(Employees);

        empMan.add(top);
        empMan.add(bottom);

        Home.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel home = HomePage.newJPanel();
                Main.frame.setContentPane(home);
                Main.frame.invalidate();
                Main.frame.validate();

            }

        });

        Add.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String empNum = id.getText();
                employeeList.put(empNum, empNum);

            }

        });

        Delete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String empNum = id.getText();
                employeeList.remove(empNum);

            }

        });

        Employees.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JPanel emps = new JPanel(new GridLayout(2, 1));
                JPanel top = new JPanel();
                JPanel bottom = new JPanel();
                JLabel workerIds = new JLabel(employeeList.toString());
                JButton back = new JButton("Back");
                top.add(back);
                bottom.add(workerIds);
                emps.add(top);
                emps.add(bottom);
                Main.frame.setContentPane(emps);
                Main.frame.invalidate();
                Main.frame.validate();

                back.addActionListener(new ActionListener() {

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
