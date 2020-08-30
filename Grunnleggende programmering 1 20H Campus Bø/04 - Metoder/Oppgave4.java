import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave4 {
	
	public static void main(String[] args){
		System.out.print(fakultet(4));
	}	

	public static String fakultet(int antallFakulutet) {
		String txt = "";
		int sum = 1; 
		for(int i = 1; i <= antallFakulutet; i++) {
			sum = sum * i;
			txt += i + " ";
		}
		return txt + "= " + sum;
	}
}