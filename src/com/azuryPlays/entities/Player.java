package com.azuryPlays.entities;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.azuryPlays.main.Game;
import com.azuryPlays.world.World;

public class Player extends Entity{
	public static final int PLAYER_SIZE = 16;
	
	public double speed =2;
	
	public boolean right, left, isJumping;
	public int dir=0;
	public int rightDir=0, leftDir =1;
	public boolean moved = false;
	
	/*Gráficos ANIMAÇÃO*/
	private BufferedImage[] rightPlayer; 
	private BufferedImage[] leftPlayer;
	private int frames =0; private int maxFrames =8;
	private int index=0; private int maxIndex = 4;

	
	
	
	public Player(int x, int y, int width, int height,double speed,BufferedImage sprite) {
		super(x, y, width, height,speed,sprite);
		/*
		rightPlayer = new BufferedImage[4];
		rightPlayer[0] = Game.spritesheet.getSprite(48, 48, PLAYER_SIZE, PLAYER_SIZE);
		rightPlayer[1] = Game.spritesheet.getSprite(32, 48, PLAYER_SIZE, PLAYER_SIZE);
		rightPlayer[2] = Game.spritesheet.getSprite(48, 48, PLAYER_SIZE, PLAYER_SIZE);
		rightPlayer[3] = Game.spritesheet.getSprite(64, 48, PLAYER_SIZE, PLAYER_SIZE);
		
		leftPlayer = new BufferedImage[4];
		leftPlayer[0] = Game.spritesheet.getSprite(16, 32, PLAYER_SIZE, PLAYER_SIZE);
		leftPlayer[1] = Game.spritesheet.getSprite(0, 32, PLAYER_SIZE, PLAYER_SIZE);
		*/

	}
	
	public void tick(){
		depth = -1;
		if(World.isFree((int)x, (int)(y+World.GRAVITY)))
			y+=World.GRAVITY;
		
		if(right && World.isFree((int)(x+speed), (int)y)) {
			moved =true;
			x+=speed;
			dir = rightDir;
			
		}else if(left && World.isFree((int)(x-speed), (int)y)) {
			moved=true;
			x-=speed;
			dir = leftDir;
		}
		if(right ==false && left == false) {
			moved = false;
		}
		
		if(moved) {
			frames++;
			if(frames == maxFrames) {
				frames =0;
				index++;
				if(index >= maxIndex) 
					index=0;					
			}
		}
	}
	
	public void render(Graphics g) {
		/*
		if(dir == rightDir) {
			sprite = rightPlayer[index];
			
		}else if(dir == leftDir) {
			sprite = leftPlayer[index];			
		}
		*/
		super.render(g);
	}
	

	


}
