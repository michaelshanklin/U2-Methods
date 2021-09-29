import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quotes {

    /*Create a GUI program with three buttons.
    Each button displays one of your favorite quotes.
    Hint: Use \n to make a new line.
     */

    public static void main(String[] args) {

       JFrame window = new JFrame("Three Quotes");
       JPanel panel = new JPanel();
       JButton quote1But = new JButton("Click for First Quote");
       JButton quote2But = new JButton("Click for Second Quote");
       JButton quote3But = new JButton("Click for Third Quote");


        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);



    }

   private static class QuoteBut1 implements ActionListener {

        public static void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null, "\"This is not my favorite quote\"\n-me);
        }
   }

}

