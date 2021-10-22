import javax.swing.*;
import java.awt.*;

public class ChangingColorsGUI {

    //Variables in a class are declared here,
    //but often not initialized

    JFrame window;
    JPanel panel;
    JButton colorClicker;

    /*
    This is a constructor and absolutely necessary for a class.
    This is where we will build the GUI, it must have the same
    name as the class.
    */

    public ChangingColorsGUI(){

        window = new JFrame("Color Changer");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(340, 127);
        window.setLocationRelativeTo(null);

        panel = new JPanel();
        colorClicker = new JButton("Change the Colors");



        //create a new Custom color
        //see globals


        Color panelBackground = new Color(33, 33, 33);
        Color buttonForeground = new Color (109, 152, 134);
        Color buttonBackground = new Color(217, 202, 179);

        //Set the colors of our buttons and panel
        panel.setBackground(panelBackground);
        colorClicker.setForeground(buttonForeground);
        colorClicker.setBackground(buttonBackground);

        panel.add(colorClicker);
        window.add(panel);

        window.setVisible(true);
    }

    //Add a listener to change the color when the button is clicked
    private class ColorChanger implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent);
        colorClicker.setForeground(buttonBackground);
        colorClicker.setBackground(panelBackground);
    }



}
