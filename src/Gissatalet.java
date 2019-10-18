/*
Skapat 2019-10-17
Ett program där man ska gissa talet.
*/
import javax.swing.*;
import java.util.Random;

public class Gissatalet {
    public static void main(String[] args) {
        // Ett random tal
        Random rand = new Random();
        int x = rand.nextInt(100);
        x += 1;
        // Variabler
        int tries = 0;
        boolean win = false;
        //While loop
        while (!win) {
            String S = JOptionPane.showInputDialog(null, "Gissa på ett tal mellan 1 och 20");
            int gissning = Integer.parseInt(S);
            tries++;
            //själva gissningarna
            if (gissning == x) {
                win = true;
            } else if (gissning < x) {
                JOptionPane.showMessageDialog(null, "Gissa på ett högre tal");
            } else if (gissning > x) {
                JOptionPane.showMessageDialog(null, "Gissa på ett lägre tal");
            }
        }
        // när man gissat rätt
        JOptionPane.showMessageDialog(null, "Du gissade rätt!!");
        JOptionPane.showMessageDialog(null, "Talet var " + x);
        JOptionPane.showMessageDialog(null, "Det tog " + tries + " gissningar");

    }
}