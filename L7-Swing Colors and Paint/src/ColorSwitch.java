/*
Create a GUI with three buttons and each button changes
the color of the panel background and the button backgrounds and foregrounds.

Create the GUI in the ColorSwitchGUI class.
 */

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorSwitchGUI {
    //declare your frame, panel, 3 buttons
    JFrame window = new JFrame("Color Switcheroo");
    JPanel panel = new JPanel();
    JButton colorThemeDark = new JButton("Theme: Dark");
    JButton colorThemeWarren = new JButton("Theme: Warren");
    JButton colorThemePrimary = new JButton("Theme: Primary");

    public ColorSwitchGUI() {
        //create your GUI

        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400, 300);
        window.setLocationRelativeTo(null);

        //add listeners to the buttons

        panel.add(colorThemeDark);
        panel.add(colorThemeWarren);
        panel.add(colorThemePrimary);

    }
    //add listeners to change the colors. don't forget to link them to buttons
    private class ThemeDark implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){

            Color darkPanel = new Color(25,26,25);
            Color darkButton = new Color(30,81,40);
            Color darkText = new Color(216,233,168);

            colorThemeDark.setBackground(panelBack);
            colorThemeDark.setForeground(darkText);
            panel.setBackground(darkPanel);


        }
    }
    private class ThemeWarren implements ActionListener{
        public void actionPerformed(ActionEvent actionEvent){

            Color WarrenPanel = new Color(0,0,0);
            Color warrenButton = new Color(30,81,40);
            Color WarrenText = new Color(216,233,168);

            colorThemeWarren.setBackground(panelBack);
            colorThemeWarren.setForeground(warrenText);
            panel.setBackground(warrenPanel);
}
        private class ThemePrimary implements ActionListener{
            public void actionPerformed(ActionEvent actionEvent){

                Color primaryPanel = new Color(0,0,0);
                Color primaryButton = new Color(245,165,0);
                Color primaryText = new Color(244,244,244);

                colorThemeWarren.setBackground(panelBack);
                colorThemeWarren.setForeground(warrenText);
                panel.setBackground(warrenPanel);