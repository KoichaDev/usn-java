import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave11a extends EasyGraphics{
	
	public static void main(String[] args){
		launch(args);
	}	

	public void run() {

		int width = parseInt(showInputDialog("Skriv inn bredde"));
		int height = parseInt(showInputDialog("Skriv inn høyde"));


		makeWindow("Franske Flagg", width, height);

		// fillRectangle(xStart, yStart, xStop, yStop)

		setColor(255, 0, 0);
		fillRectangle(0, 0, width/3, height);

		setColor(255, 255, 255);
		fillRectangle(width/3, 0, (width/3) * 2, height);

		setColor(0, 0, 255);
		fillRectangle((width/3) * 2, 0, width, height);
	}
}