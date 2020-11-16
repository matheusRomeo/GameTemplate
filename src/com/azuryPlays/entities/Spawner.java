package com.azuryPlays.entities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.azuryPlays.main.Game;

public class Spawner extends Entity{
	
	private int timer = 60;
	private int curTime = 0;

	public Spawner(double x, double y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);
		
	}
	
	public void tick() {
		curTime++;
		
		if(curTime == timer) {
			curTime =0;
			//atividade do Spaw aqui
		}
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.red);
	}

}
