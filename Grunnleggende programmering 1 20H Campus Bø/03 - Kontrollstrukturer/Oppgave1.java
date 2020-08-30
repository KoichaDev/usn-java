import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave1 {

	public static void main(String[] args){
		int tallA = parseInt(showInputDialog("Skriv inn tall A"));
		int tallB = parseInt(showInputDialog("Skriv inn tall B"));

		int divide = tallA/tallB;

		if(divide != 0) {
			System.out.println(divide);
		} else {
			System.out.println("Ugyldig!");
		} 
	}	
}