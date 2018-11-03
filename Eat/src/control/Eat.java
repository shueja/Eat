package control;

import java.awt.Dimension;
import java.awt.Window;

import javax.swing.JFrame;

public class Eat {
	public static final int WIDTH;
	public static final int HEIGHT;
	JFrame window;
	GamePanel panel;
	
	public static void main(String[] args) {
		Eat game = new Eat();
		game.setup();
	}
	
	public Eat() {
		window = new JFrame(); 
		panel = new GamePanel();
	}
	
	public void setup() {
		window.add(panel);
		window.addKeyListener(panel);
		window.setSize(JFrame.FULL_SCREEN);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        window.pack();
		window.setVisible(true);
		WIDTH = window.getWidth();
		HEIGHT = window.getHeight();
		panel.startGame();
	}
}
