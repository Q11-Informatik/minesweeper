package de.q11.minesweeper;

import javax.swing.*;
import java.awt.event.*;

public class MSButton extends JButton{
	private boolean isMine;
	private int number;				//number of mines around the button
	public MSButton(boolean isMine, int number){
		super();
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
	public void setNumber(int number){
		this.number=number;
	}
	public int getNumber(){
		return this.number;
	}
}
