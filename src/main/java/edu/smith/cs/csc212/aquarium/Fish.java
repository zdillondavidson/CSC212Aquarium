package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	//Every fish has an x which is an int
	int x;
	int y;
	Color color;
	boolean isLittle;
	boolean facingLeft;
	//every fish has a destination
	int destX;
	int destY;
	
	public Fish(Color c, int startX, int startY, 
			boolean isLittle, boolean facingLeft) {
		this.color = c;
		this.x = startX;
		this.y = startY;
		this.isLittle = isLittle;
		this.facingLeft = facingLeft;
		
		this.destX = 450;
		this.destY = 450;
	}
	public void swim() {
		if (this.y < this.destY) {
			this.y += 1;
		}
	}

	public void draw(Graphics2D g) {
		this.swim();
		if (facingLeft && isLittle) {
			//if fish face left and are small
			DrawFish.smallFacingLeft(g, this.color, 
					this.x, this.y);
		}else if (!facingLeft && isLittle) {
			//if fish face right and are small
			DrawFish.smallFacingRight(g, this.color, 
					this.x, this.y);
		}else if (facingLeft && !isLittle)
		
		
		//if fish face left and big
		DrawFish.facingLeft(g, this.color, 
				this.x, this.y);
		//if fish right and are big
		DrawFish.facingRight(g, this.color, 
				this.x, this.y);
	}
}
