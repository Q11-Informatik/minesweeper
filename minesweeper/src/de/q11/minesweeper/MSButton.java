package de.q11.minesweeper;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class MSButton extends JButton implements MouseListener{
	private boolean isMine;
	private int number;				//number of mines around the button
	public MSButton(boolean isMine, int number){
		super();
		this.setContentAreaFilled(true);
		this.setFocusPainted(false);
		this.isMine=isMine;
		this.number=number;
	}
	
	//GET & SET
	public void setIsMine(boolean isMine){
		this.isMine=isMine;
	}
	public boolean getIsMine(){
		return this.isMine;
	}
	public void increaseNumber() {
		this.number++;
	}
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return this.number;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		Color color = new Color(255,255,212,100);
		this.setBackground(color);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}	
