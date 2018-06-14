
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class Beispiel{

    public static void main (String[] args, int maxGröße, int bombenZ){
        
        // Benutzerdefinierte Feldgröße und Bombenzahl
        int maxGr = maxGröße;
        int maxBo = bombenZ;
        
        //Initielisierung des Frames
        JFrame meinFrame = new JFrame("Beispiel");
        meinFrame.setSize(600,600);
        
        int bombenzahl = 0;
        
        //Initialisierung der Panels 
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        
        // Initialisierung der Spielfelder als Array
        MsButton [][] msButton = new MsButton[maxGr][maxGr];
        
        for(int i = 0; i<maxGr; i++){
            for (int j = 0;j<maxGr;j++ ){
                msButton[i][j] = new  MsButton(0,false);
            }
        }
        
        // Belegung der Felder mit Minen und Zahlen
        
        
        
        while (bombenzahl < maxBo ){
            // Erstellung von 2 Zufallszahlen
            Random ran = new Random();
            int x = ran.nextInt(maxGr); 
            int y = ran.nextInt(maxGr);
            // Prüfung, ob das Feld bereits belegt ist
            if ( msButton[x][y].getBombe() == false ){
                // Setzen der Bombe
                msButton[x][y].setBombe(true);
                // Setzen der Zahlen auf den benachbarten Feldern
                // IfMethoden falls Randfelder besetzt werden
                if(y<maxGr-1){
                    msButton[x][y+1].zahlErhöhen();}
                if(y>0){
                    msButton[x][y-1].zahlErhöhen();}
                if(x>0){
                    msButton[x-1][y].zahlErhöhen();}
                if(x<maxGr-1){
                    msButton[x+1][y].zahlErhöhen();}
                if(y<maxGr-1 && x>0){
                    msButton[x-1][y+1].zahlErhöhen();}
                if(x<maxGr-1 && y<maxGr-1){
                    msButton[x+1][y+1].zahlErhöhen();}
                if(x<maxGr-1 && y>0){
                    msButton[x+1][y-1].zahlErhöhen();}
                if(x>0 && y>0){
                    msButton[x-1][y-1].zahlErhöhen();}
                // Prüfung der Belegung, temporär
                msButton[x][y].setBackground(Color.RED);
                
                
                
                bombenzahl = bombenzahl+1;
            
            } 
            
            else{}
        
        
        }
        
        // text der Buttons wird auf ihre Zahlö gesetzt
        
        for(int i = 0; i< maxGr; i++){
            for(int j = 0; j< maxGr; j++){
                
                msButton[i][j].setText(""+msButton[i][j].zahl);
            }
        
        }
        
        // Initialisierung der Randbuttons
        
        JButton jButton101 = new JButton( "Bombenzahl: x    Fahnenzahl: x   " );
        JButton jButton102 = new JButton( "Einstellungen" );
        JButton jButton103 = new JButton( "Reset" );
        JButton jButton104 = new JButton( "Timer: x:x " );
        
       
        // Festlegung des Layouts für die beiden panels
        jPanel1.setLayout(new BorderLayout());
        jPanel2.setLayout(new GridLayout(maxGr,maxGr));
        // Belegung von panel1 im Borderlayout
        jPanel1.add(jButton101, BorderLayout.PAGE_START);
        jPanel1.add(jButton102, BorderLayout.PAGE_END);
        jPanel1.add(jButton103, BorderLayout.LINE_START);
        // Panel2 wird zu Panel1 hinzugefügt
        jPanel1.add(jPanel2, BorderLayout.CENTER);
        jPanel1.add(jButton104, BorderLayout.LINE_END);
        
        // Belegung von Panel2 im Gridlayout
        for (int i = 0; i<maxGr; i++){
            for(int j=0; j<maxGr;j++){
                jPanel2.add(msButton[i][j]);
            }
        }
       
        // Panel1 wird dem Frame hinzugefügt
        meinFrame.add(jPanel1);

        // Frame wird sichtbar gemacht
        
        meinFrame.setVisible(true);
    }




}