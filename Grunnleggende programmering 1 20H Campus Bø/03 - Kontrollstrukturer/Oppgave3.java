import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave3 {
	
	public static void main(String[] args){
		int tallA = parseInt(showInputDialog("Enter a number"));
		int tallB = parseInt(showInputDialog("Enter second number"));
		int sum; 

		if(tallA > tallB) {
			sum = tallA - tallB;
		} else {
			if(tallB >= tallA) {
				sum = tallB - tallA;
			} else {
				sum = tallA + tallB;
			}
		}

		System.out.println("Result: " + sum);
	}	
}