import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave9 {
	
	public static void main(String[] args){
		int antallNummer = parseInt(showInputDialog("Oppgi antall nummer for multipliaksjons tabellen"));

		for(int rad = 1; rad <= antallNummer; rad++) {
			for(int kolonne = 1; kolonne <= antallNummer; kolonne++) {
				System.out.print(rad * kolonne + "    ");
			}
			System.out.println();
		}
	}	
}