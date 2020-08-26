import java.io.*;
import static java.lang.System.*;
import static javax.swing.JOptionPane.*;

public class FinnOrdFil {
	
	public static void main(String[] args){
		String filnavn = showInputDialog("Filnavn:");
		String søkeOrd = showInputDialog("Søkeord");

		try {
			// Leser navnet på filen
			FileReader filType = new FileReader(filnavn);
			// Reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.		
			BufferedReader fil = new BufferedReader(filType);

			// readLine() Reads a line of text.
			String linje = fil.readLine();
			int linjeNr = 1;

			while(linje != null) {

				if(linje.contains(søkeOrd)) {
					out.println(linjeNr + ":" + linje);
					linje = fil.readLine();
					linjeNr = linjeNr + 1;
				}
			}

			fil.close();
		} catch(Exception e) {
			out.println(e);
		}
	}	
}