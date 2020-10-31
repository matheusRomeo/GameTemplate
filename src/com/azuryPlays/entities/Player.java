package com.azuryPlays.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;


public class Player extends Entity{
	
	public double speed;
	
	public static final int PLAYER_SIZE = 16;
	
	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
	}
	
	public void tick(){
	
		
		
	}
	
	public void render(Graphics g) {
		super.render(g);
	}
	

	


}
