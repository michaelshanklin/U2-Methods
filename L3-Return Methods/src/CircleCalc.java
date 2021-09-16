import javax.swing.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class CircleCalc {

  /*
  1. Get the input - get the radius
  2. Calculate area
  3. Calculate circumference
  4. Display results

   */


    public static void main(String[] args) {

   //create and run the program
        // 1.
        double radius = getInput("Please enter the radius");

        // 2.
        double area = area(radius);

        // 3.
        double circumference = circumference(radius);

        // 4.
        JOptionPane.showMessageDialog(null, displayResults(area, circumference));


    }


    //method to get input from user
    public static double getInput(String message){
        return Double.parseDouble(JOptionPane.showInputDialog(message));
    }


    //re-write the method to calculate a circle's area using parameters and return statement
    public static double area(double radius){

        return Math.pow(radius, 2) * Math.PI;

    }

    //re-write the method to calculate a circle's perimeter using parameters and return statement
    public static double circumference(double radius){

        return 2 * Math.PI * radius;

    }

public static String displayResults(double area, double perimeter){
    DecimalFormat round = new DecimalFormat("#.##");
    String message = "The area is:" + area;
    message += "\nThe circumference is:" + round.format(perimeter);

    return message;

   }

}

