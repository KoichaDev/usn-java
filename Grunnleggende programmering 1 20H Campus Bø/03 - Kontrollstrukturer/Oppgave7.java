import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave7 {
	
	public static void main(String[] args){
		int unicodeStart = 32;
		int unicodeEnd = 126;

		for (int i = unicodeStart; i < unicodeEnd; i++) {
			char resultat = (char) i;
			System.out.print (resultat + " ");
		}

	}	
}