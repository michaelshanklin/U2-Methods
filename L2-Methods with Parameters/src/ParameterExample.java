import javax.swing.*;

public class Scope{

    private int number = 12;
    private int total;

    public void addNumbers(){
        int numberB = 4;
        total = numberB + number;
    }

    public void displayTotal(){
        String numberB;
        System.out.println("The total of " + number + " + " + numberB + " is " + total);
    }
}

