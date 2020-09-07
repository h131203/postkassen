package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;
/*
 * Program som skriver ut fakultet av inntastet tall fra bruker
 * 
 */
public class Oppgave6 {

	public static void main(String[] args) {
		String heltallInput = showInputDialog("Tast inn et heltall n > 0: ");
		int heltallKonv = parseInt(heltallInput);
		
		int fact = 1;
		int i = 1;
		
		if (heltallKonv > 0) {
			while(i<=heltallKonv) {
				fact = fact * i;
				i++;
			}
			showMessageDialog(null, "Fakultet av " + heltallKonv + " er " + fact);
		} else {
			showMessageDialog(null, "Ugyldig input.");
		}
	}
		
}