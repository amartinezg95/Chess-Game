package com.github.chessgame;


import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BoardGame extends JFrame {

	private final static int ROWS = 8;
	private final static int COLUMNS = 8;
	private final static List<String> charPositions = List.of("A", "B", "C", "D", "E", "F", "G", "H");
	private final static List<String> chessBoardPostion = List.of(
			"A1", "B1", "C1", "D1", "E1", "F1", "G1", "F1",
			"A2", "B2", "C2", "D2", "E2", "F2", "G2", "F2",
			"A3", "B3", "C3", "D3", "E3", "F3", "G3", "F3",
			"A4", "B4", "C4", "D4", "E4", "F4", "G4", "F4",
			"A5", "B5", "C5", "D5", "E5", "F5", "G5", "F5",
			"A6", "B6", "C6", "D6", "E6", "F6", "G6", "F6",
			"A7", "B7", "C7", "D7", "E7", "F7", "G7", "F7",
			"A8", "B8", "C8", "D8", "E8", "F8", "G8", "F8");
	private JButton[][] board = new JButton[ROWS][COLUMNS];

	public BoardGame() {

	}

	public void initialize() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Label standardLabel = new Label();
		standardLabel.setBackground(Color.cyan);
		JPanel boardPanel = new JPanel(new GridLayout(ROWS + 1, COLUMNS + 1, 1, 1));

		for (int row = 0; row <= ROWS; row++) {
			for (int col = 0; col <= COLUMNS; col++) {
				int xMod = row % 2;
				int yMod = col % 2;
				if (col == 0 & row == 0) {
					boardPanel.add(new JLabel());

				} else if (row == 0) {
					JLabel character = new JLabel(charPositions.get(col - 1));
					character.setOpaque(true);
					character.setForeground(new Color(100, 16, 21));
					character.setFont(new Font("Ink Free", Font.BOLD, 20));
					character.setHorizontalAlignment(JLabel.CENTER);
					character.setVerticalAlignment(JLabel.BOTTOM);
					character.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
					boardPanel.add(character);
				} else if (col == 0) {
					JLabel num = new JLabel(String.valueOf(row));
					num.setOpaque(true);
					num.setForeground(new Color(100, 16, 21));
					num.setFont(new Font("Ink Free", Font.BOLD, 20));
					num.setHorizontalAlignment(JLabel.RIGHT);
					num.setVerticalAlignment(JLabel.CENTER);
					num.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 22));
					boardPanel.add(num);
				} else if (xMod == 0 && yMod == 0 || xMod == 1 && yMod == 1) {
					board[row - 1][col - 1] = new JButton();
					board[row - 1][col - 1].setBackground(Color.WHITE);
					board[row - 1][col - 1].setOpaque(true);
					boardPanel.add(board[row - 1][col - 1]);
				} else {
					board[row - 1][col - 1] = new JButton();
					board[row - 1][col - 1].setBackground(new Color(139, 100, 100));
					board[row - 1][col - 1].setOpaque(true);
					boardPanel.add(board[row - 1][col - 1]);
				}
			}
		}

		JLabel picLabel = new JLabel(new ImageIcon("src/main/java/png/WBishop.png"));
		picLabel.setHorizontalAlignment(JLabel.CENTER);
		boardPanel.remove(10);
		picLabel.setOpaque(true);
		picLabel.setBackground(Color.WHITE);
		boardPanel.add(picLabel, 10);
		this.add(boardPanel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
