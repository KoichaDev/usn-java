import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave5 {
	
	public static void main(String[] args){
		int month = 2;
		String result = "Måneden er ";
		switch(month) {
			case 1: 
				result += "Januar";
			break;
			case 2:
				result += "Februar";
			break;
			case 3: 
				result += "Mars";
			break;
			case 4: 
				result += "April";
			break;
			case 5: 
				result += "Mai";
			break; 
			case 6: 
				result += "Juni";
			break;
			case 7: 
				result += "Juli";
			break;
			case 8: 
				result += "August";
			break;
			case 9: 
				result += "September";
			break;
			case 10: 
				result += "Oktober";
			break;
			case 11: 
				result += "November";
			break;
			case 12: 
				result += "Desember";
			break;
			default: 
				result += "Ingenting, pffft!";
		}		

		System.out.println(result);
	}	
}