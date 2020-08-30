import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave2 {
	
	public static void main(String[] args){
		arrow(5, 3);
	}	

	public static void arrow(int antallKolonner, int antallRader) {

		String txtUt = "";
		for (int x = 0; x <= antallKolonner / 2; x++) {
			txtUt += ">";
			System.out.println(txtUt);
		}

		for(int kolonne = 0; kolonne < antallKolonner; kolonne++) {
			for(int rad = kolonne; rad < (antallRader + 1) / 2; rad++) {
				System.out.print(">");
			}
			System.out.println();
		}	
	}
}