import javax.swing.*;
import java.awt.*;

public class SimpleDrawing {

    public static void main(String[] args) {
        new SimpleDrawingGUI();
        frame = new JFrame("House");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        //Add the panel to the frame
        JPanel House = new drawingHouse();

        frame.add(panel);
        frame.setVisible(true);
    }

    private class DrawingHouse extends JPanel {
        //Set background color
        setBackground(Color.yellow);

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.ORANGE);
        g.fillRect(5, 234, 255, 1);

        g.setColor(Color.YELLOW);
        g.fillOval(255, 222, 5, 0);

        g.setColor(Color.RED);
        g.fillRect(204, 51, 0, 0);

    }
}