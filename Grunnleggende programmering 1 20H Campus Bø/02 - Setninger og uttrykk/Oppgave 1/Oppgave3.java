import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave3 {
	
	public static void main(String[] args){
		double pi = 3.14;
		double radius = parseDouble(showInputDialog("Skriv inn radius"));
		double resultat = (int) pi * radius * radius;

		System.out.println("Radiusen for en sirkel er " + resultat);		
	}	
}