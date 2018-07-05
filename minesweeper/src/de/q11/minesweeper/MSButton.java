package de.q11.minesweeper;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class MSButton extends JButton implements MouseListener{
	ImageIcon mine = new ImageIcon(this.getClass().getResource("icons/mine.ico"));
	ImageIcon fahne = new ImageIcon(this.getClass().getResource("icons/fahne.ico"));
	private boolean isMine;
	private int number;				//number of mines around the button
	private int x;
	private int y;
	public MSButton(boolean isMine, int number, int x, int y){
		super();
		this.setContentAreaFilled(true);
		this.setFocusPainted(false);
		this.isMine=isMine;
		this.number=number;
		this.addMouseListener(this);
		this.x = x;
		this.y = y;
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
	public int getXPos() {
		return this.x;
	}
	public int getYPos() {
		return this.y;
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//Color color = new Color(255,255,212,100);
		//this.setBackground(color);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		switch(e.getButton()) {
		case 1:
			if(this.isMine) {
				this.setIcon(mine);
				//gameOver();
			}
			break;
		case 3:
			if(!this.isMine) {
				this.setIcon(fahne);
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		
		
	}
}	 
