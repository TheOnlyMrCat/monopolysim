package com.dockdev.chance;

import java.awt.Canvas;

import javax.imageio.ImageIO;

import com.dockdev.chance.gui.Handler;
import com.dockdev.chance.gui.Window;

@SuppressWarnings("unused")
public class App extends Canvas implements Runnable {
	
	private static final long serialVersionUID = 4583230692281133623L;
	
	public static final int WIDTH = 640, HEIGHT = WIDTH / 12 * 9;
	private Handler handler = new Handler();
	
	public static int space = 0;
	public static int doubles = 0;
	public static int money = 0;
	
	public static int move = 0;
	
	private Thread thread;
	private boolean running = false;
	
	public static boolean movesim = false;
	public static boolean cardsim = false;
	public static boolean jailsim = false;
	
	public static int moves;
	public static int players;
	
	public App(){
		
		this.addMouseListener(null);
		
		new Window((int) WIDTH, (int) HEIGHT, "Chatopia Alpha 0.0.0.1", this);
		
		try{
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		this.requestFocus();
		long lastTime = System.nanoTime();
		double amountOfTicks = 100.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int frames = 0;
		while (running) {
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while (delta >= 1) {
				tick();
				delta--;
			}
			if (running)
				render();
			frames++;

			if (System.currentTimeMillis() - timer > 1000) {
				timer += 1000;
				System.out.println("FPS: " + frames);
				frames = 0;
			}
		}
		stop();
	}
	
	private void render() {
		
	}

	private void tick() {
		handler.tick();
	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
		System.out.println("Started");
	}

	public synchronized void stop() {
		try {
			thread.join();
			running = false;
			System.out.println("Stopping");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
