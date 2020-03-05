package view;

import java.awt.*;

import javax.swing.*;

import controller.GridSquare;

public class TakeTurn extends JPanel {
	
	private JFrame frmTakeTurn;
	private GameTimer gameTmr;
	
	public TakeTurn() {
		GridSquare[][] gridSquares; 
		int x=16;
		int y=16;
		
		frmTakeTurn = new JFrame();
		frmTakeTurn.setResizable(false);
		frmTakeTurn.setLocationRelativeTo(null);

		frmTakeTurn.setTitle("Take a Turn");
		frmTakeTurn.setBounds(100, 100, 800, 700);
		frmTakeTurn.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTakeTurn.getContentPane().setLayout(null);
		
		JPanel leftPanel = new JPanel();
		leftPanel.setLocation(0, 0);
		frmTakeTurn.getContentPane().add(leftPanel);
		leftPanel.setLayout(new GridLayout(x, y, 0, 0));
		leftPanel.setSize(600, 600);
		
		JPanel rightPanel = new JPanel();
		rightPanel.setBackground(Color.GREEN);
		rightPanel.setLocation(600, 0);
		frmTakeTurn.getContentPane().add(rightPanel);
		rightPanel.setSize(184, 600);
		
		/*JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.GRAY);
		bottomPanel.setLocation(0, 600);
		frmTakeTurn.getContentPane().add(bottomPanel);
		bottomPanel.setSize(784, 61);*/
		
		// implemented timer - Mar. 5th
		gameTmr = new GameTimer();
		gameTmr.setLocation(0,600);
		frmTakeTurn.getContentPane().add(gameTmr);
		gameTmr.setSize(784,61);
		
		
		gridSquares = new GridSquare[x][y];
		for (int column = 0; column < x; column++) {
			for (int row = 0; row < y; row++) {
				gridSquares[column][row] = new GridSquare(x, y);
				gridSquares[column][row].setOpaque(true);
				gridSquares[column][row].setColor(column,row);
				gridSquares[column][row].setBorder(BorderFactory.createLineBorder(Color.BLACK));

				leftPanel.add(gridSquares[column][row]);
			}
		}
		
		frmTakeTurn.setVisible(true);
	}
	
}
