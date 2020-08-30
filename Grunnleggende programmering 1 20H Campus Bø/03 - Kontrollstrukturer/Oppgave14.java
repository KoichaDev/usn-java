import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave14 extends EasyGraphics {

	public static void main(String[] args){
		launch(args);
	}	

	public void run() {
		int width = 500;
		int height = 500;

		boolean isWhite = true; 

		double pi =  3.14;
		double radius = 25;

		makeWindow("Sirkel", width, height);
		
		int antallSirkel = parseInt(getText("Antall Ringer"));

		for(int i = antallSirkel; 1 <= i; i--) {	
			int omkrets = (int) radius * i;

			// Flag check for å endre farge
			if(isWhite) {
				setColor(0, 0, 0);	
			} else {
				setColor(255, 255, 255);
			}

			isWhite = !isWhite;

			fillCircle(width/2, height/2, omkrets);
		}
	}
}