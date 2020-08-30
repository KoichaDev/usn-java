import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave4 {
	
	public static void main(String[] args){
		String birth = "11026765672";
		int sex = Character.getNumericValue(birth.charAt(6));

		// Check if odd number
		if(sex % 2 == 0 ) {
			System.out.println("Mann");
		} else {
			System.out.println("dame");
		}
	}	
}