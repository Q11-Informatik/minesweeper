
import javax.swing.*;
import java.awt.*;
public class MsButton extends JButton{
    public int zahl;
    public boolean bombe;
    
    public MsButton( int z, boolean b){
        zahl = z;
        bombe = b;
    
    
    }

    public int getZahl(){
        return zahl;
    }
    
    public void setZahl(int z){
        zahl= z;
    }
    
    public void zahlErhöhen(){
        zahl = zahl+1;
    }
    
    public boolean getBombe(){
        return bombe;
    }
    
    public void setBombe( boolean b){
    
        bombe = b;
    }
    
    
    
    
    
    
    
    
    
    
}