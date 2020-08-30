import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave10 {

	public static void main(String[] args){

		int antallLinjer = parseInt(showInputDialog("Skriv inn antall linjer"));

		// Oppgave A 
		//  + + + 
		//  + +
		//  +  
		System.out.println("Oppgave A:");

		for(int i = 0; i < antallLinjer; i++) {
			for(int j = i; j < antallLinjer; j++) {
				System.out.print("+ ");
			}
			System.out.println();
		}
				
		// Oppgave B
		/*
		 * +
		 * +
		 * + + + 
		 */
		System.out.println("\nOppgave B:");
		for(int kolonne = 0; kolonne < antallLinjer; kolonne++) {
			System.out.println("+");
		}	

		for(int rad = 0; rad < antallLinjer; rad++) {
			System.out.print("+ ");
		}		

		// Oppgave C
		//  +  
		//  + +
		//  + + + 

		System.out.println("\n\nOppgave C");
		String txtUt = "";
		for (int x = 0; x <= antallLinjer; x++) {
			txtUt += "+ ";
			System.out.println(txtUt);
		}

		// Oppgave D 

		//  + + + 
		//  + + +
		//  + + +

		System.out.println("\nOppgave D:");
		for(int rad = 0; rad < antallLinjer; rad++) {
			for(int kolonne = 0; kolonne < antallLinjer; kolonne++) {
				System.out.print("+ ");
			}
			System.out.println();
		} 
	}	
}