package de.q11.test_gui_2;

import java.awt.*;
import javax.swing.*;

//2D Array for Buttons

public class MainFrame extends JFrame {
	public MainFrame() {
	    this.setTitle("test_GUI");
	    this.setSize(1000, 620);
	    this.setResizable(true);
	    this.setLocation(50, 50);
	    this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
	    this.initComponents();
	    
	}
	
	private void initComponents() {
		JPanel panel = new JPanel();
		JPanel panelMiddle = new JPanel();
		
		panel.setLayout(new BorderLayout());
		panelMiddle.setLayout(new GridLayout(10,10));
		
		
		JLabel timer_label = new JLabel("0");
		panel.add(timer_label, BorderLayout.NORTH);
		MSTimer timer = new MSTimer(timer_label);
		
		JButton[] buttons = createField(100);
        for(JButton b:buttons){
        	panelMiddle.add(b);
        }
        panel.add(panelMiddle, BorderLayout.CENTER);
        
        this.add(panel);
        
    }
	//Creates the field
	private JButton[] createField(int amount){
		JButton[] buttons = new JButton[amount];
		for(int i = 0;i<amount;i++){
			buttons[i] = new MSButton(false, 1);
		}
		return buttons;
		
	}
}
