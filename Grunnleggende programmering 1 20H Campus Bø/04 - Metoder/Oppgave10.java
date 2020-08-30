import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;

public class Oppgave10 extends EasyGraphics {
	
	public static void main(String[] args){
		launch(args);
	}	

	public void run() {
 
    makeWindow("Strekfigurer", 900, 500);
 
    int ant = parseInt( getText("Gi ant. figurer:") );
 
    // Plassering av midtpunktet til det første hodet
    int xPos = 50, yPos = 100;
 
    // Setter størrelsen på en voksen, og på et barn
    int stor = 150, liten = stor/2;
 
    // Setter avstand mellom figurene
    int avstand = liten;
 
    // Tegner barna lengre ned for at alle 'skal stå på gulvet'
    int littNed = stor/2;
 
    for (int i=0; i<ant; i++) {
      if ( i < 2)
        tegnFigur(xPos+i*avstand,yPos,stor);
      else
        tegnFigur(xPos+(i+2)*avstand/2, yPos+littNed, liten);
        // Tegner barna to hakk lengre mot høyre, derfor (i+2)
      pause(400);
    }
  }
 
  // Ulike hjelpemetoder for å tenge figurene
 
  private void tegnFigur(int x, int y, int str) {
    int r = str/5;
    tegnHode(x,y,r);
    tegnKropp(x,y+r,r);
    tegnBein(x,y+3*r,r);
  }
 
  private void tegnHode(int x, int y, int str) {
    drawCircle(x,y,str);
    // Tegner to øyne
    fillCircle(x-str/4,y-str/3,str/6);
    fillCircle(x+str/4,y-str/3,str/6);
    // Tegner en smilemunn....
    drawArc(x,y,str/2,str/2,190,160);
  }
 
  private void tegnKropp(int x, int y, int str) {
    drawLine(x,y,x,y+2*str);
    drawLine(x-str,y+str,x+str,y+str);
  }
 
  private void tegnBein(int x, int y, int str) {
    drawLine(x,y,x-str,y+2*str);
    drawLine(x,y,x+str,y+2*str);
  }
}