package com.azuryPlays.entities.enemies;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.azuryPlays.entities.Enemy;
import com.azuryPlays.entities.Entity;
import com.azuryPlays.main.Game;

public class Enemy1 extends Enemy{

	public Enemy1(double x, double y, int width, int height, BufferedImage sprite) {
		super(x, y, width, height, sprite);
		// TODO Auto-generated constructor stub
	}

	public void tick(){
		depth = 1;
		
		
	}
	
	public void render(Graphics g) {
		super.render(g);
	}
}
