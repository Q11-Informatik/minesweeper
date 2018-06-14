package de.q11.minesweeper;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JPanel;

public class Minefield {
	
	public static JPanel createMinefield(int maxSize, int mines) {
		
		int mineCount = 0;
		
		MSButton[][] buttons = new MSButton[maxSize][maxSize];
		
		for(int i = 0; i<maxSize;i++) {
			for(int j = 0; j<maxSize;j++) {
				buttons[i][j] = new MSButton(false,0);
			}
		}
		
		while (mineCount < mines ){
			
            // Erstellung von 2 Zufallszahlen
            Random ran = new Random();
            int x = ran.nextInt(maxSize); 
            int y = ran.nextInt(maxSize);
            // Prüfung, ob das Feld bereits belegt ist
            if ( buttons[x][y].getIsMine() == false ){
                // Setzen der Bombe
                buttons[x][y].setIsMine(true);
                // Setzen der Zahlen auf den benachbarten Feldern
                // IfMethoden falls Randfelder besetzt werden
                if(y<maxSize-1){
                    buttons[x][y+1].increaseNumber();}
                if(y>0){            
                    buttons[x][y-1].increaseNumber();}
                if(x>0){            
                    buttons[x-1][y].increaseNumber();}
                if(x<maxSize-1){    
                    buttons[x+1][y].increaseNumber();}
                if(y<maxSize-1 && x>0){
                    buttons[x-1][y+1].increaseNumber();}
                if(x<maxSize-1 && y<maxSize-1){
                    buttons[x+1][y+1].increaseNumber();}
                if(x<maxSize-1 && y>0){
                    buttons[x+1][y-1].increaseNumber();}
                if(x>0 && y>0){
                    buttons[x-1][y-1].increaseNumber();}
                // Prüfung der Belegung, temporär
                buttons[x][y].setBackground(Color.RED);
                
                
                mineCount = mineCount+1;
            } 
		}
            
		//DEBUG!!!
		
		for(int i = 0; i< maxSize; i++){
		    for(int j = 0; j< maxSize; j++){
		        
		        buttons[i][j].setText(""+buttons[i][j].getNumber());
		    }
		
		}
		
		//END DEBUG!!!
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(maxSize, maxSize));
		
		for (int i = 0; i<maxSize; i++){
		    for(int j=0; j<maxSize;j++){
		        panel.add(buttons[i][j]);
		    }
		}
		
		return panel;
        
	}

}
