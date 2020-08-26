import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave7 {

	public static void main(String[] args){
		int antallRekker = parseInt(showInputDialog("Skriv inn antall rekker"));
		int antallRader = parseInt(showInputDialog(("Skriv inn antall rader")));

		System.out.println(Math.pow(antallRekker, antallRader));
	}	
}