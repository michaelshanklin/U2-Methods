import javax.swing.*;

public class LastLetterWord {


    //Plan below
    // 1. Get Input: three words input
    // 2. Isolate the last three letters of any word
    // 3. Combine #2 of all three words


    public static void main(String[] args) {

        String word1 = JOptionPane.showInputDialog("Enter word 1:");
        String Word2 = JOptionPane.showInputDialog("Enter word 2:");
        String Word3 = JOptionPane.showInputDialog("Enter word 3:");

        String output = lastThree(word1) + lastThree(word2) + lastThree(word3);

        JOptionPane.showMessageDialog(null, output);
    }

 public static String lastThree(String word){

        String newWord;

        if(word.length() <=3){
            newWord = word;
        }else{

        return word.substring(word.length()-3);{
    }


