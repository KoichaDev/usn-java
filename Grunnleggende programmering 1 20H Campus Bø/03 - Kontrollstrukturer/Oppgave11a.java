import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave11a extends EasyGraphics {
	
	public static void main(String[] args){
		launch(args);
	}	

	public void run() {
		makeWindow("Take Off", 750, 500);

		for(int seconds = 10; 0 <= seconds; seconds--) {
			setFont("Arial", 56);
			setColor(255, 0, 0);

			pause(500);
			drawString(Integer.toString(seconds), 200, 300);
							
			// Fucked up! Needs to find how to clear drawString after count down

		}
	}
}