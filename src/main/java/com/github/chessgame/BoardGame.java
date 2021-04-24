package com.github.chessgame;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

@SuppressWarnings("serial")
public class BoardGame {

	private final static int ROWS = 8;
	private final static int COLUMNS = 8;
	private final static List<String> charPositions = List.of("A", "B", "C", "D", "E", "F", "G", "H");
	private JFrame frame;

	public BoardGame() {
		frame = new JFrame("Chess Game");
	}


	private void initialiazeInfoBoard(JPanel panel) {
		panel.add(new JPanel(new GridLayout(1, 1)), 0);
		int position = 1;
		for (String letter : charPositions) {
			JLabel label = new JLabel(letter);
			label.setHorizontalAlignment(JLabel.CENTER);
			panel.add(label, position);
			position++;
		}
	}

	public void initialize() {
		int n = 9;
		int a = 1;
		int b = 0;
		int position = 1;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new GridLayout(ROWS + 2, COLUMNS + 1, 1, 1));
		this.initialiazeInfoBoard(panel);
		Label standardLabel = new Label();
		standardLabel.setBackground(Color.cyan);

		for (int i = 0; i < 72; i++) {
			JPanel label = new JPanel(new GridLayout(1, 1));
			label.add(new JLabel(new ImageIcon()));

			if (i % 2 == a && (i % 9) != b) {
				label.setBackground(Color.WHITE);
				panel.add(label, n);
				n++;
			} else if (i % 2 == b && (i % 9) != b) {
				label.setBackground(new Color(139, 100, 100));
				panel.add(label, n);
				n++;
			} else {
				JLabel labelPosition = new JLabel(String.valueOf(position));
				labelPosition.setHorizontalAlignment(JLabel.CENTER);
				panel.add(labelPosition, n);
				position++;
				n++;
			}


		}

		frame.add(panel);
		JLabel picLabel = new JLabel(new ImageIcon("src/main/java/png/WBishop.png"));
		picLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.remove(10);
		picLabel.setOpaque(true);
		picLabel.setBackground(Color.WHITE);
		panel.add(picLabel, 10);

		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

}
