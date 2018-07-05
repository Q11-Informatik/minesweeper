package de.q11.minesweeper;

import java.awt.Color;
import java.awt.event.ActionEvent;

public class Logic {

	
public void actionPerformed(ActionEvent e, MSButton [][] button, int maxGroeﬂe) {
		
		
		MSButton Button = (MSButton)e.getSource();
		if(Button.getIsMine() == true)
			{ Button.setBackground(Color.RED);}
		else{
			if(Button.getNumber()== 0){
			
				if(Button.getYPos()<maxGroeﬂe-1) {
				button[Button.getXPos()][Button.getYPos()+1].doClick();}
				
				if(Button.getYPos()>0) {
				button[Button.getXPos()][Button.getYPos()-1].doClick();}
				
				if(Button.getXPos()<maxGroeﬂe-1) {
				button[Button.getXPos()+1][Button.getYPos()].doClick();}
				
				if(Button.getXPos()>0) {
				button[Button.getXPos()-1][Button.getYPos()].doClick();}
				
				if(Button.getXPos()<maxGroeﬂe-1 && Button.getYPos()<maxGroeﬂe-1) {
				button[Button.getXPos()+1][Button.getYPos()+1].doClick();}
				
				if(Button.getXPos()<maxGroeﬂe-1 && Button.getYPos()>0) {
				button[Button.getXPos()+1][Button.getYPos()-1].doClick();}
				
				if( Button.getXPos()>0 &&  Button.getYPos()>0) {
				button[Button.getXPos()-1][Button.getYPos()-1].doClick();}
				
				if( Button.getXPos()>0 && Button.getYPos()<maxGroeﬂe-1)
				button[Button.getXPos()-1][Button.getYPos()+1].doClick();}
			



			
			else {
				Button.setText(""+Button.getNumber());
			}
		
		}
		}
}


