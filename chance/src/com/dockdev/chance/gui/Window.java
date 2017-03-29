package com.dockdev.chance.gui;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import com.dockdev.chance.App;

public class Window extends Canvas{
	
	private static final long serialVersionUID = 4583230692281133623L;

	 public Window(int width, int height, String title, App main){
	  JFrame frame = new JFrame(title);
	  
	  frame.setPreferredSize(new Dimension(width, height));
	  frame.setMaximumSize(new Dimension(width, height));
	  frame.setMinimumSize(new Dimension(width, height));
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setResizable(false);
	  frame.setLocationRelativeTo(null);
	  frame.add(main);   
	  frame.setVisible(true);
	 
	 
	 
	 }
	
	
}
