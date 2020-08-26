import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave9 {
	
	public static void main(String[] args){
		int day = parseInt(showInputDialog(("Day")));
		int month = parseInt(showInputDialog(("month")));
		int year = parseInt(showInputDialog(("year")));
		
		if(day > 31) {
			System.out.println("Ugyldig Dato ");
			System.exit(0);
		} 

		if(month > 12) {
			System.out.println("Ugyldig Måned");
		} 

		if(year > 2999) {
			System.out.println("Ugyldig År");
			System.exit(0);
		} 
		
		System.out.println(day + "." + month + "." + year);
	}	
}