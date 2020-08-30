import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave5 {
	
	public static void main(String[] args){
		checkInput();
	}	

	public static int intervall(int nedreTall, int øvreTall) {
		int i = 0;	
		for(i = nedreTall; i <= øvreTall; i++) {
			System.out.print(i + " ");
		}
		return i;
	}

	public static void checkInput(int input) {
		boolean error;
		do {
			int input = parseInt(showInputDialog("Tall mellom 0 - 10"));

			error = input > 10;

			if(error) {
				showMessageDialog(null, "Prøv igjen");
			} else {
				if(input <= 5) {
					intervall(0, input);
				} else {
					intervall(5, input);
				}
			}
		} while(error);	
	}	
}