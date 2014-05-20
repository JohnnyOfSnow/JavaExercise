import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Component;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class HelloWorld extends javax.swing.JApplet {

  static {
    try {
      UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    }
    catch(Exception e) {}
  }

  public static void main(String args[]){
    HelloWorldJFrame frame = new HelloWorldJFrame();
     
  }
  
  // 建構函式
  public HelloWorld() {
    System.out.println("JApplet建構函式");
  
  }

  public void init() {
    System.out.println("JApplet init()");
    

    DisplayPanel displayPanel = new DisplayPanel();
    
    // JDK 1.4的用法
    // 取得其Content Pane 
    //Container contentPane = getContentPane();
    // 定義 Layout Manager 為 BorderLayout
    //contentPane.setLayout(new BorderLayout());
    // 將物件加至Content Pane中
    //contentPane.add(displayPanel, BorderLayout.CENTER);

    // JDK 5.0之後的用法
    // 直接定義JFrame之Layout BorderLayout
    this.setLayout(new BorderLayout());
    this.add(displayPanel, BorderLayout.CENTER);
  }

  public void start() {
    System.out.println("JApplet start()");
   
  }
  
  public void stop() {
    System.out.println("JApplet stop()");
  }
  
  public void destroy() {
    System.out.println("JApplet destroy()");
  }
}

class HelloWorldJFrame extends javax.swing.JFrame {
  // 建構函式
  public HelloWorldJFrame() {
    super("Car");

    //DisplayPanel displayPanel = new DisplayPanel("Hello World JFrame");
    CarViewer carViewer = new CarViewer();

    // JDK 1.4的用法
    // 取得其Content Pane 
    //Container contentPane = getContentPane();
    // 定義 Layout Manager 為 BorderLayout
    //contentPane.setLayout(new BorderLayout());
    // 將物件加至Content Pane中
    //contentPane.add(displayPanel, BorderLayout.CENTER);

    // JDK 5.0之後的用法
    // 直接定義JFrame之Layout BorderLayout
    this.setLayout(new BorderLayout());
    this.add(carViewer, BorderLayout.CENTER);

    this.validate();
    this.setSize(new Dimension(200, 200));

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();
    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;
    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;
    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
}

class DisplayPanel extends javax.swing.JPanel {
  String text;
  
  // 建構函式
  public DisplayPanel() {
    
  }

  public void paintComponent(Graphics g){
    super.paintComponent(g);
    //g.drawString(text, 50, 50);
    Graphics2D g2 = (Graphics2D) g;
		
			Car car1 = new Car(0, 0, 50, 50);
			Car car2 = new Car(80, 100, 200, 100);

			car1.draw(g2);
			car2.draw(g2);
  }
}

class Car
{
	public Car(int x, int y, int width, int height)
	{
		xLeft = x;
		yTop = y;
		xWidth = width;
		yHeight = height;
	}

	public void draw(Graphics2D g2)
	{
		Rectangle body = new Rectangle(xLeft, yTop + yHeight / 3, xWidth, yHeight / 3);
		Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + yHeight / 12, yTop + yHeight * 2 / 3, yHeight / 3, yHeight / 3);
		Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + xWidth - yHeight * 5 / 12, yTop + yHeight * 2 / 3, yHeight / 3, yHeight / 3);

		Point2D.Double r1 = new Point2D.Double(xLeft + xWidth / 6, yTop + yHeight / 3);

		Point2D.Double r2 = new Point2D.Double(xLeft + xWidth / 3, yTop);

		Point2D.Double r3 = new Point2D.Double(xLeft + xWidth * 2 / 3, yTop);
		
		Point2D.Double r4 = new Point2D.Double(xLeft + xWidth * 5 / 6, yTop + yHeight / 3);

		Line2D.Double frontWindshield = new Line2D.Double(r1, r2);

		Line2D.Double roofTop = new Line2D.Double(r2, r3);

		Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

		g2.draw(body);
		g2.draw(frontTire);
		g2.draw(rearTire);
		g2.draw(frontWindshield);
		g2.draw(roofTop);
		g2.draw(rearWindshield);
	}
	
	private int xLeft;
	private int yTop;
	private int xWidth;
	private int yHeight;
}




class CarViewer extends JFrame 
{
	
	CarViewer(){
		JFrame frame = new JFrame();
		
		frame.setSize(300, 400);
		frame.setTitle("Cars");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CarComponent component = new CarComponent();
		frame.add(component);

		frame.setVisible(true);

	}
}

class CarComponent extends JComponent
{
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D) g;
		
			Car car1 = new Car(0, 0, 50, 50);
			Car car2 = new Car(80, 100, 200, 100);

			car1.draw(g2);
			car2.draw(g2);
		}
	
}
