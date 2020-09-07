package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.*;

/*
 * Skriver ut karakter i bokstavform basert på input i form av tall fra bruker
 * 
 * Slik den står nå kjøres den 10 ganger 
 */
public class Karaktere {

	public static void main(String[] args) {

		for (int i = 1; i <= 10; i++) {
			String poengsum = showInputDialog("Poengsum (heltall): ");
			int poengsumInt = parseInt(poengsum);
			if (poengsumInt >= 0 && poengsumInt <= 100) {
				if (poengsumInt <= 100 && poengsumInt >= 90) {
					showMessageDialog(null, poengsumInt + " poeng gir karakter A.");

				} else if (poengsumInt <= 89 && poengsumInt >= 80) {
					showMessageDialog(null, poengsumInt + " poeng gir karakter B.");

				} else if (poengsumInt <= 79 && poengsumInt >= 60) {
					showMessageDialog(null, poengsumInt + " poeng gir karakter C.");

				} else if (poengsumInt <= 59 && poengsumInt >= 50) {
					showMessageDialog(null, poengsumInt + " poeng gir karakter D.");

				} else if (poengsumInt <= 49 && poengsumInt >= 40) {
					showMessageDialog(null, poengsumInt + " poeng gir karakter E.");

				} else if (poengsumInt <= 39 && poengsumInt >= 0) {
					showMessageDialog(null, poengsumInt + " poeng gir karakter F.");
				}

			} else {
				showMessageDialog(null, "Ugyldig input. Bruk 0- 100");
			}

		}
	}

}
