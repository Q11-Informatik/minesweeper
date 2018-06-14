
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class Beispiel{

    public static void main (String[] args){
        JFrame meinFrame = new JFrame("Beispiel");
        meinFrame.setSize(600,600);
        int bombenzahl = 0;
        
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        
        MsButton [][] msButton = new MsButton[10][10];
        
        for(int i = 0; i<10; i++){
            for (int j = 0;j<10;j++ ){
                msButton[i][j] = new  MsButton(0,false);
            }
        }
        
        // Belegung der Felder mit Minen und Zahlen
        
        
        
        while (bombenzahl < 10 ){
            
            Random ran = new Random();
            int x = ran.nextInt(10); 
            int y = ran.nextInt(10);
            if ( msButton[x][y].getBombe() == false ){
                
                msButton[x][y].setBombe(true);
                if(y<9){
                    msButton[x][y+1].zahlErhöhen();}
                if(y>0){
                    msButton[x][y-1].zahlErhöhen();}
                if(x>0){
                    msButton[x-1][y].zahlErhöhen();}
                if(x>9){
                    msButton[x+1][y].zahlErhöhen();}
                if(y>9 && x>0){
                    msButton[x-1][y+1].zahlErhöhen();}
                if(x>9 && y<9){
                    msButton[x+1][y+1].zahlErhöhen();}
                if(x<9 && y>0){
                    msButton[x+1][y-1].zahlErhöhen();}
                if(x>0 && y>0){
                    msButton[x-1][y-1].zahlErhöhen();}
                
                msButton[x][y].setBackground(Color.RED);
                
                
                
                bombenzahl = bombenzahl+1;
            
            } 
            
            else{}
        
        
        }
        
        
        
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                
                msButton[i][j].setText(""+msButton[i][j].zahl);
            }
        
        }
        
        
        
        
        
        
        
        
        
        
        JButton jButton101 = new JButton( "Bombenzahl: x    Fahnenzahl: x   " );
        JButton jButton102 = new JButton( "Einstellungen" );
        JButton jButton103 = new JButton( "Reset" );
        JButton jButton104 = new JButton( "Timer: x:x " );
        
       
        
        jPanel1.setLayout(new BorderLayout());
        jPanel2.setLayout(new GridLayout(10,10));
        
        jPanel1.add(jButton101, BorderLayout.PAGE_START);
        jPanel1.add(jButton102, BorderLayout.PAGE_END);
        jPanel1.add(jButton103, BorderLayout.LINE_START);
        jPanel1.add(jPanel2, BorderLayout.CENTER);
        jPanel1.add(jButton104, BorderLayout.LINE_END);
        
        for (int i = 0; i<10; i++){
            for(int j=0; j<10;j++){
                jPanel2.add(msButton[i][j]);
            }
        }
        
        
        
        meinFrame.add(jPanel1);
        
 



        
        
        meinFrame.setVisible(true);
    }




}