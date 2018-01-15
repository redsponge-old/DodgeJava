package com.redsponge.dodge.entities.actors.enemies;

import com.redsponge.dodge.Handler;
import com.redsponge.dodge.utils.math.Vector;

import java.awt.Color;
import java.awt.Graphics;

public class EnemyBasic extends Enemy {
	public EnemyBasic(Handler handler, float x, float y, int width, int height, boolean bouncesFromWalls, int lifeTime,
			boolean center) {
		super(handler, x, y, Color.RED, width, height, 3.0F, 3.0F, bouncesFromWalls, 1000, center);
	}

	public EnemyBasic(Handler handler, float x, float y, int width, int height, boolean bouncesFromWalls, int lifeTime,
			float speedX, float speedY, boolean center) {
		super(handler, x, y, Color.RED, width, height, speedX, speedY, bouncesFromWalls, 1000, center);
	}

	public EnemyBasic(Handler handler, float x, float y, int width, int height, boolean bouncesFromWalls, int lifeTime,
			Vector speed, boolean center) {
		super(handler, x, y, Color.RED, width, height, (float) speed.getSpeedX(), (float) speed.getSpeedY(),
				bouncesFromWalls, 1000, center);
	}
	
	public EnemyBasic(Handler handler, float x, float y, int width, int height, boolean bouncesFromWalls, int lifeTime, float speedX, float speedY) {
		this(handler, x, y, width, height, bouncesFromWalls, lifeTime, speedX, speedY, false);
	}

	public void tick() {
		super.tick();
	}

	public void render(Graphics g) {
		g.setColor(this.color);
		g.fillRect((int) this.x, (int) this.y, this.width, this.height);
	}
}
