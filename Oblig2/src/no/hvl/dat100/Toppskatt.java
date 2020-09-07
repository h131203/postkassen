/*
 * Oppgave 2, innlevering 2 i DAT100, 070920
 */

package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;	

public class Toppskatt {

	public static void main(String[] args) {
		
		/*Trinn 1	Inntekten mellom 180 800 – 254 500 kroner	1,9 % trinnskatt
Trinn 2	Inntekten mellom 254 500 – 639 750 kroner	4,2 %  trinnskatt
Trinn 3	Inntekten mellom 639 750 – 999 550 kroner	13,2 % trinnskatt *
Trinn 4	Inntekten over  999 550 kroner	16,2 % trinnskatt
*/
		
		String bruttolonn = showInputDialog("Bruttoinntekt (heltall): ");
		int bruttolonnInt = parseInt(bruttolonn);
				
		if (bruttolonnInt < 180800) {
			showMessageDialog(null, "Med din inntekt på " + bruttolonnInt + "kr blir det ingen toppskatt!");				
			
		} 
		else if (bruttolonnInt <= 254500) {
			showMessageDialog(null, "Bruttoinntekt "+bruttolonnInt+"kr gir en toppskatt på "+(int)(bruttolonnInt*0.0019)+0.5+"kr"); 
		}
		else if (bruttolonnInt <= 639750) {
			showMessageDialog(null, "Bruttoinntekt "+bruttolonnInt+"kr gir en toppskatt på "+(int)(bruttolonnInt*0.0042)+0.5+"kr"); 
		}
		else if (bruttolonnInt <= 999550) {
			showMessageDialog(null, "Bruttoinntekt "+bruttolonnInt+"kr gir en toppskatt på "+(int)(bruttolonnInt*0.0132)+0.5+"kr"); 
		}
		else if (bruttolonnInt > 999500) {
			showMessageDialog(null, "Bruttoinntekt "+bruttolonnInt+"kr gir en toppskatt på "+(int)(bruttolonnInt*0.0162)+0.5+"kr"); 
		}

	}

}
