public class ReturnMethod {

    public static void main(String[] args) {

        double length = Double.parseDouble(JOptionPane.showIntputDialog("What is the length?"));
        double width = Double.parseDouble(JOptionPane.showIntputDialog("What is the width?"));

        JOtionpane.showMessageDialog(null, "The area is" + area(length, width) + "\nThe perimeter is"
+ perimeter(length, width));

        System.exit(0);

    }

    public static double area (double length, double width){


       return length * width;

    }
    public static void parameter (double length, double width){

        return  2 * (width + length);

    }

}
