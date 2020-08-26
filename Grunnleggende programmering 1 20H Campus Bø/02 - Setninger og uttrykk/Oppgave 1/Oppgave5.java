import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave5 {
	
	public static void main(String[] args){
		String input = showInputDialog("Skriv en tall mellom 0 og 1000: ");
		int number = parseInt(input);

		int firstDigit = number % 10; 
		number = number/10;

		int secondDigit = number % 10;
		number = number/10;

		int thirdDigit = number % 10;
		number = number/10;

		int summen = firstDigit + secondDigit + thirdDigit ;

		showMessageDialog(null, "Tverrsummen = " + firstDigit + " + " + secondDigit + " + " + thirdDigit + " + " + " = " + summen); 
	}	
}