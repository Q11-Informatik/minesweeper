package de.q11.test_gui_2;

import javax.swing.*;
import java.awt.event.*;

public class MSButton extends JButton{
	private boolean isMine;
	private int number;
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
