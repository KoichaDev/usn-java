import static java.lang.System.*;
import static javax.swing.JOptionPane.*;


public class Oppgave1 {

	public static void main(String[] args){
		// Input for brukeren
		String inputEn = showInputDialog("Skriv inn en tall");
		String inputTo = showInputDialog("Skriv inn neste tall");

		int tallEn = Integer.parseInt(inputEn);
		int tallTo = Integer.parseInt(inputTo);
		int sum = tallEn + tallTo;

		// output etter at brukeren har skrevet inn resultatet
		showMessageDialog(null, "Resultat: " + sum);
	}	
}