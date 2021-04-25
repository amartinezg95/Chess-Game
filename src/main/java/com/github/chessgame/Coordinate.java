package com.github.chessgame;

import lombok.Getter;

@Getter
public class Coordinate {

	private int x;
	private int y;

	public Coordinate(int x, int y){
		this.x = x;
		this.y = y;
	}

}
