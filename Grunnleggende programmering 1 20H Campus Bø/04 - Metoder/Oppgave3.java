import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave3 {
	
	public static void main(String[] args){
		System.out.println(toCm(10));
		System.out.println(toInch(10));
	}	

	public static String toCm(int inch) {
		return (inch * 0.393700787) + " cm";
	}

	public static String toInch(int cm) {
		return (cm * 2.54) + " Inch";
	}
}