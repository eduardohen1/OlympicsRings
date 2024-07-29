package es.com.minsait;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class OlympicRings extends JPanel {
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawOlympicRings(g);
	}
	
	private void drawOlympicRings(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		
		//Definir a espessura do traço
		g2d.setStroke(new BasicStroke(7));
		
		//Definir as cores dos anéis olímpicos
		Color[] ringColors = {
				Color.BLUE,
				Color.BLACK,
				Color.RED,
				Color.YELLOW,
				Color.GREEN
		};
		
		//Definir as posições dos anéis olímpicos:
		int[][] ringPositions = {
				{ 50,  50},
				{150,  50},
				{250,  50},
				{100, 100},
				{200, 100}
		};
		
		//Desenhar:
		for(int i = 0; i < ringColors.length; i++) {
			g2d.setColor(ringColors[i]);
			g2d.drawOval(ringPositions[i][0], ringPositions[i][1], 100, 100);
		}
	}
	
	public static void main(String[] args) {
		JFrame jFrame = new JFrame("Olympic Rings");
		OlympicRings panel = new OlympicRings();
		jFrame.add(panel);
		jFrame.setSize(400,250);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
	}

}
