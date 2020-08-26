import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave6 {
	
	public static void main(String[] args){
		
		double firstDigit = parseDouble(showInputDialog("1st Digit"));
		double secondDigit = parseDouble(showInputDialog("2nd Digit"));
		double thirdDigit = parseDouble(showInputDialog("3rd Digit"));
		double fourthDigit = parseDouble(showInputDialog("4th Digit"));

		System.out.println(Math.min(firstDigit, secondDigit));
		System.out.println(Math.min(thirdDigit, fourthDigit));
	}	
}