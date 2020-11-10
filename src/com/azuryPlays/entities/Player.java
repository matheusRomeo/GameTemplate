package com.azuryPlays.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.azuryPlays.main.Game;
import com.azuryPlays.world.World;

public class Player extends Entity{
	
	public static final int PLAYER_SIZE = 16;
	
	public double speed;
	
	public Player(int x, int y, int width, int height,BufferedImage sprite) {
		super(x, y, width, height,sprite);		

	}
	
	public void tick(){
		depth = 0;
		
	}
	
	public void render(Graphics g) {
		super.render(g);
	}
	

	



}
