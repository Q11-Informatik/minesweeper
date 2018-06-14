package de.q11.test_gui_2;

import javax.swing.JLabel;
import javax.swing.Timer;

import java.awt.event.*;
import java.io.Serializable;

public class MSTimer extends Object implements Serializable {
	int i = 0; //Iterator
	public MSTimer(JLabel label){
		int delay = 1000; //milliseconds
		//every tick
		ActionListener taskPerformer = new ActionListener(){
			public void actionPerformed(ActionEvent evt) {
				i++;
				String text = Integer.toString(i);
				label.setText(text);
	    	}
		};
		new Timer(delay, taskPerformer).start();
	}
}
