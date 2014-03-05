import javax.swing.*;
import java.awt.Graphics;
import java.awt.Polygon;

public class DrawFunction extends JFrame{
	public static void main(String[] args) {
		DrawFunction frame = new DrawFunction();
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	DrawFunction() {
		setTitle("DrawFunction");
		add(new FunctionDraw());
	}
}

class FunctionDraw extends JPanel {
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int xCenter = getWidth() / 2;
		int yCenter = getHeight() / 2;


		Polygon p = new Polygon();

		p.addPoint(xCenter + 5, yCenter + 10);
		p.addPoint(xCenter + 10, yCenter + 10);
		p.addPoint(xCenter + 20, yCenter + 10);
		p.addPoint(xCenter + 30, yCenter + 10);

		g.drawPolyline(p);
	}
}
