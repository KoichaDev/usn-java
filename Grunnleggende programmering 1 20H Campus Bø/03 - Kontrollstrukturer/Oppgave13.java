import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave13 extends EasyGraphics {
	
	public static void main(String[] args){
		launch(args);
	}	

	public void run() {
		int antallMurvegg = 11;
		int width = 750;
		int height = 250;

		makeWindow("Murvegg", width, height);

		for(int i = 1; i < antallMurvegg; i++) {

			if(antallMurvegg % 2 == 0) {
				drawRectangle(0, 0, antallMurvegg/i, height/4);
			} else {
				drawRectangle(0, 0, antallMurvegg/i, height/3);				
			}

		}		
	}
}