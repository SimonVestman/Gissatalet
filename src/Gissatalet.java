/*
Skapat 2019-10-17
Ett program där man ska gissa talet.
*/
import javax.swing.*;
import java.util.Random;

public class Gissatalet {
   public static void main (String [] args) {
        /* Värde till variablerna */
        Random rand = new Random();
        int x = rand.nextInt(100);
        x+=1;

        String S = JOptionPane.showInputDialog(null, "Gissa på ett tal mellan 1 och 100");
               int gissning = Integer.parseInt(S);

               if(gissning == x){
                    JOptionPane.showMessageDialog(null, "Du hade rätt!");
               }    else{
                   JOptionPane.showMessageDialog(null,"Du gissade inte rätt");
               }
                    while (gissning != x) {
                       String T = JOptionPane.showInputDialog(null,"Fel svar gissa igen!");
                                int Ny = Integer.parseInt(T);

                    }

   }
}
