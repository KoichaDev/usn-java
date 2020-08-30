import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave8 {
	
	public static void main(String[] args){
		int visitAlder = parseInt(showInputDialog("Hvor gammel er du?"));

		double kinoPris = 100;
		int lovligAlder = 12;
		String tekstOutput = "";


		if(visitAlder >= lovligAlder) {
			int betale = parseInt(showInputDialog("Hvor mye penger har du?"));

			double sum = betale - kinoPris;

			if(sum <= 0) {
				System.out.println("Du har altfor lite penger");
			} else {

				int filmNr;

				do {
					filmNr = parseInt(showInputDialog("Velg en film Nummer: " + "\n" + "1. Godzilla\n" + "2. Samurai Jack\n" + "3. harry Potter"));
					tekstOutput = "Du har valgt ";
					
					switch(filmNr) {
					case 1: 
						tekstOutput += "Godzilla";
					break;
					case 2: 
						tekstOutput += "Samurai Jack";
					break;
					case 3:
						tekstOutput += "Harry Potter";
					break;
					default: 
						tekstOutput += "Ugyldig Nummer! Prøv igjen!";
					}
					System.out.println(tekstOutput);
				} while(filmNr >= 3);

				System.out.println("Veksel tilbake " + sum + "kr.");
			}

		} else {
			System.out.println("Aldersgrense er " + lovligAlder + "." );
		}



	}	
}