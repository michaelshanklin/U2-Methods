import javax.swing.*;

public class FeetToMeters {

    /* Create a program with two buttons. Clicking on the first button will prompt the user to enter a distance in feet and
    convert it to meters. Clicking on the second button will prompt the user to enter a distance in meters and convert to feet.{
     */

    //The Plan:
    //1. create GUI
    //2. Get the input: when a button is clicked
    //3. The Math: 3.28 feet in a meter. F -> M = Divide by 3.28 M -> F Multiply by 3.28
    //4. Display results, probably after each button clicked

    public static void main(String[] args) {

        JFrame window = new JFrame("Three Quotes");
        JPanel panel = new JPanel();
        JButton feetToMeters = new JButton("Click to convert feet to meters");
        JButton metersToFeet = new JButton("Click to convert meters to feet");



        window.setSize(350, 100);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        panel.add(feetToMeters);
        panel.add(metersToFeet);

        window.add(panel);
        window.setVisible(true);
    }
    private static class FeetToMetersListener implements ActionListener {

        public void actionPerformed(ActionEvent e){

            double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the feet"));

            double result = number / 3.28;

            JOptionPane.showMessageDialog(null, result + "in meters");

        }
        private static class MetersToFeetListener implements ActionListener {

            public void actionPerformed(ActionEvent e){

                double number = Double.parseDouble(JOptionPane.showInputDialog("Enter the feet"));

                double result = number * 3.28;

                JOptionPane.showMessageDialog(null, result + "in meters");

    }
            }
    }




