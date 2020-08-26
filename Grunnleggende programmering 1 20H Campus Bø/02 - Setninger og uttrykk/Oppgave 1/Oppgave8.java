import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave8 {
	
	public static void main(String[] args){
		// Arbritær variabel verdier
		int x = 5;
		int y = 6; 
		int z = 10;

		// 'Sirkulær' reassinment til variablene
		x = y;
		y = z;
		z = x;

		z = y;
		y = x;
		x = z;

		System.out.println(x + y + z);
	}	
}