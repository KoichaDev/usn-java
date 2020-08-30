import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave1 {
	
	public static void main(String[] args){
		rektangel(3, 10);
		System.out.println();
		trekant("*", 3);
	}	

	// Oppgave 1a
	public static void rektangel(int antallKolonne, int antallRad) {
		for(int kolonne = 0; kolonne < antallKolonne; kolonne++) {
			for(int rad = 0; rad < antallRad; rad++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// Oppgave 1b
	public static void trekant(String tegn, int antall) {
		String rektangel = "";
		for (int x = 0; x <= antall; x++) {
			rektangel += tegn;
			System.out.println(rektangel);
		}
	}
}