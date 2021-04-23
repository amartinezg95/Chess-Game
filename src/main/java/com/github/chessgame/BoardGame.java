package com.github.chessgame;


import javax.swing.*;
import java.awt.*;
import java.util.List;

public class BoardGame {

	private final static int ROWS = 8;
	private final static int COLUMNS = 8;
	private final static List<String> charPositions = List.of("A","B","C","D","E","F","G","H");
	private JFrame frame;

	public BoardGame(){
		frame = new JFrame("Chess Game");
	}


	private void initialiazeInfoBoard(){
		charPositions.forEach(charPosition -> {
			JPanel label = new JPanel(new GridLayout(1, 1));
			label.setToolTipText(charPosition);

		});
	}

	public void initialize(){
		int n = 0;
		int a = 1;
		int b = 0;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new JPanel(new GridLayout(9, 9));
		Label standardLabel = new Label();
		standardLabel.setBackground(Color.cyan);

		for(int i = 0;i< 64;i++){
			JPanel label = new JPanel(new GridLayout(1, 1));
			label.add(new JLabel(new ImageIcon()));

			if (i % 2 == a)
				label.setBackground(Color.BLACK);
			if (i % 2 == b)
				label.setBackground(Color.white);

			if (i % 8 == 7) {
				int temp = a;
				a = b;
				b = temp;
			}
			panel.add(label, n);
			n++;
		}
		frame.setSize(600,600);
		frame.add(panel);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

}
