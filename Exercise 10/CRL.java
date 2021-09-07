/*
1. Program to draw Circle, Rectangle, Line
*/

import java.awt.*;
import java.awt.event.*;

public class CRL extends Frame {

	public CRL() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
			System.exit(0);
			}
		});
	}

									// Draw in colors.
	public void paint(Graphics g) {
		Color c1 = new Color(100, 100, 100);
		



		g.setColor(Color.green);					//for draw circle
		g.drawOval(20, 40, 50, 50);
		g.fillOval(20, 130, 50, 50);

		

		g.setColor(Color.red);					//for draw rectangle
		g.drawRect(20, 200, 60, 60);
		g.fillRect(20, 300, 60, 60);
		

		g.setColor(c1);						//for draw line
		g.drawLine(20, 400, 50, 600);
		



}

public static void main(String[] args) {
	CRL appwin = new CRL();							//craete object for CRL

	appwin.setSize(new Dimension(640, 560));
	appwin.setTitle("Circle-Rectangle-Line");
	appwin.setVisible(true);
	}
}
Verified
