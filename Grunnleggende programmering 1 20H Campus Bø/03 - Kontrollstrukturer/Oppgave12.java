import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave12 {
	
	public static void main(String[] args){
		int number = 12;
	 
	    int firstDigit = 1;
	    int secondDigit = 1; 
	    String ut = "Fibonaccitall: " + firstDigit + ", " + secondDigit + ", ";
	 
	 
	 
	    for (int tall=3; tall<=number; tall++) {
	      int fibonacci = firstDigit + secondDigit;
	      ut += fibonacci + ", ";
	      secondDigit = firstDigit;
	      firstDigit = fibonacci;
	    }
	 	System.out.print(ut);
	}	
}