import javax.swing.*;

public class SplitPs {

    /*
    Assuming a String has a P, return a String containing the first p and the next 3 letters.

    "Hippopotamus" -> ppop
     */

    // The Plan
    // 1. Get the input: a word with a p and some letters
    // 2. Isolate the p
    // 3. Grab the three letters after the P
    // 4. output

    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Enter a word that has a p, and three letters after it");
        JOptionPane.showMessageDialog(null, splitP(word));
        System.exit(0);
    }

   public static String splitP(String word){
        int pIndex = word.indexOf('p');

        String split = word.substring(pIndex, pIndex + 4);

        return split;
   }

}

