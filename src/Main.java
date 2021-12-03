//DO NOT ALTER

import javax.swing.JFrame;

public class Main extends JFrame{
    public static JFrame frame;
    public static void main(String args[]){
       frame = new JFrame("Food-ease");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,350);
       

       HomePage.newJPanel();
       
       

       

    }
}

