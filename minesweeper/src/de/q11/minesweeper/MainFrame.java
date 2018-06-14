package de.q11.minesweeper;

import java.awt.*;
import javax.swing.*;

//2D Array for Buttons

public class MainFrame extends JFrame {
	public MainFrame() {
		//initialize Frame
	    this.setTitle("test_GUI");
	    this.setSize(1000, 620);
	    this.setResizable(true);
	    this.setLocation(50, 50);
	    this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	    this.initComponents();
	    
	}
	
	private void initComponents() {
		JPanel panel = new JPanel();			//general Panel (BORDERLAYOUT)
		
		panel.setLayout(new BorderLayout());
		
		//create Timer
		JLabel timer_label = new JLabel("0");
		panel.add(timer_label, BorderLayout.NORTH);
		MSTimer timer = new MSTimer(timer_label);
		
		JPanel panelMiddle = Minefield.createMinefield(10, 10);		//middle Panel / Field (GRIDLAYOUT)
        panel.add(panelMiddle, BorderLayout.CENTER);
        
        this.add(panel);
        
    }
}
