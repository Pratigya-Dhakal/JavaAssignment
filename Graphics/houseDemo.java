import java.awt.*;
import javax.swing.JFrame;

class HouseDemo extends Canvas
{
	public void paint(Graphics g)
	{

		g.drawRect(100,100,200,150);
		g.setColor(Color.GREEN);
		g.fillRect(10,10,700,650);
		g.setColor(Color.RED);
		g.fillRect(100,300,400,200);
		g.setColor(Color.WHITE);
		g.fillRect(250,350,100,50);
		g.setColor(Color.BLACK);
		g.drawLine(200,300, 500, 300);
		g.drawLine(300, 200, 100, 300);
		g.drawLine(200, 300, 500, 300);
		g.drawLine(300, 200, 500, 300);
		
	}
	public static void main(String[] args) 
	{
		HouseDemo ob = new HouseDemo();

		JFrame f = new JFrame();

			f.add(ob);
			f.setSize(800, 800);
			f.setVisible(true);
	}
}