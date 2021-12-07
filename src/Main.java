import javax.swing.JFrame;

/**
 * 
 * This class is the main class of the project wiich launches the initial JFrame
 * 
 */
public class Main extends JFrame{
    public static JFrame frame;
    
    /** 
     * Launches the main JFrame that the whole program is ran on.
     * 
     * @param args[]
     */
    public static void main(String args[]){
       frame = new JFrame("Food-ease");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(500,350);
       

       HomePage.newJPanel();
       
       

       

    }
}

