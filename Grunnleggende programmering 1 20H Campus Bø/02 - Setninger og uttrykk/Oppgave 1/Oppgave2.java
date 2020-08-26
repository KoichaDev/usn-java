import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave2 {

	public static void main(String[] args){
		int lengde = parseInt(showInputDialog("Skriv inn lengde"));
		int bredde = parseInt(showInputDialog("Skriv inn bredde"));

		int resultat = lengde * bredde;
		System.out.println("Arealet er " + resultat);
	}	
}