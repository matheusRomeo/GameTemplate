package com.azuryPlays.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Enemy extends Entity{
	
public double speed;
	
	public Enemy(double x, double y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);
	}
	
	public void tick(){
		depth = 1;
		
	}
	
	public void render(Graphics g) {
		super.render(g);
	}
}
