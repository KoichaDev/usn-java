import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave4 {

	public static void main(String[] args){
		double USD = 8.89; // Dagens USD beløp
		double NOK = USD * parseDouble(showInputDialog("Fra USD til NOK:"));

		System.out.println(NOK + "nok");
	}	
}