import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave6 {	

	public static void main(String[] args){
		
		int kvadratTall = parseInt(showInputDialog("Skriv tall mellom 0-100"));

		if(1 < kvadratTall && kvadratTall <= 100) {
			for(int i = 0; i <= kvadratTall; i++) {
				System.out.println(i + "= " + i * i);
			}
		} else {
			System.out.println("Må være mellom 1-100");
		}		
	}	
}