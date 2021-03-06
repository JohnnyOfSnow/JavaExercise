import javax.swing.*;
import java.awt.Graphics;
import java.awt.Polygon;

public class DrawFunction extends JFrame{
	public static void main(String[] args) {
		DrawFunction frame = new DrawFunction();
		frame.setSize(400, 250);
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

		Polygon p = new Polygon();
		
		double scaleFactor = 0.01;
		for(int x = -100; x <=100; x++){
			p.addPoint(x + 200, 200 - (int)(scaleFactor * x * x));

		}
		g.drawPolyline(p.xpoints, p.ypoints, p.npoints); // plot the x * x function.

		Polygon xAxis = new Polygon();

		for(int x = 20; x <=300; x++){
			xAxis.addPoint(x, 200);
		}
		g.drawPolyline(xAxis.xpoints, xAxis.ypoints, xAxis.npoints); // plot x-axis
		
		Polygon yAxis = new Polygon();

		for(int y = 250; y >= 30; y--){
			yAxis.addPoint(200,y);
		}
		g.drawPolyline(yAxis.xpoints, yAxis.ypoints, yAxis.npoints); // plot y-axis
	}
}
