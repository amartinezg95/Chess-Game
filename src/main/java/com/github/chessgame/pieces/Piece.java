package com.github.chessgame.pieces;

import com.github.chessgame.Coordinate;

public class Piece {

	private Coordinate coordinate;
	private String name;

	public Piece(Coordinate coordinate, String name) {
		this.coordinate = coordinate;
		this.name = name;
	}

}
