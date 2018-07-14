package com.asus;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MotherBoard extends JFrame {

	public MotherBoard(){
		JPanel panel = new JPanel();
		JLabel l1 = new JLabel(new ImageIcon("mg/mb/mb.jpg"));
		JLabel l2 = new JLabel("Mother Board MSI");
		JLabel l3 = new JLabel(new ImageIcon("cpu.jpg"));
		JLabel l4 = new JLabel("Intel i9");
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		panel.add(l1);
		panel.add(l2);
		panel.add(l3);
		panel.add(l4);
		this.add(panel);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
