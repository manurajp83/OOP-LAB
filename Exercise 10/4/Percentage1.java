/*
4. Find the percentage of marks obtained by a student in 5 subjects.
Display a happy face if he secures above 50% or a sad face if
otherwise.
*/

import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Percentage1 extends Frame
implements ActionListener {

	TextField m1, m2, m3, m4, m5;

	public Percentage1() {
		// Use a flow layout.
		setLayout(new FlowLayout());

		// Create controls.
		Label mark1 = new Label("Enter 1st subject mark : ",Label.RIGHT);
		Label mark2 = new Label("Enter 2nd subject mark : ",Label.RIGHT);
		Label mark3 = new Label("Enter 3rd subject mark : ",Label.RIGHT);
		Label mark4 = new Label("Enter 4th subject mark : ",Label.RIGHT);
		Label mark5 = new Label("Enter 5th subject mark : ",Label.RIGHT);

		m1 = new TextField("0");
		m2 = new TextField("0");
		m3 = new TextField("0");
		m4 = new TextField("0");
		m5 = new TextField("0");

		// Add the controls to the frame.
		add(mark1);
		add(m1);
		add(mark2);
		add(m2);
		add(mark3);
		add(m3);
		add(mark4);
		add(m4);
		add(mark5);
		add(m5);

		// Add action event handlers.
		m1.addActionListener(this);
		m2.addActionListener(this);
		m3.addActionListener(this);
		m4.addActionListener(this);
		m5.addActionListener(this);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
	}

	// User pressed Enter.
	public void actionPerformed(ActionEvent ae) {
		repaint();
	}

	public void paint(Graphics g) {
		int sum, M1, M2, M3, M4, M5;
		float percentage;
		M1 = Integer.parseInt(m1.getText());
		M2 = Integer.parseInt(m2.getText());
		M3 = Integer.parseInt(m3.getText());
		M4 = Integer.parseInt(m4.getText());
		M5 = Integer.parseInt(m5.getText());


		sum = M1 + M2 + M3 + M4 + M5;
		percentage = ((float)sum / 500) * 100 ;

		g.drawString("Percentage : " + percentage,20, 100);


		//Change color to yellow
        	g.setColor(Color.yellow);

        	//Draw and fill the face
        	g.fillOval(100,100,250,250);

        	//Change color to black
        	g.setColor(Color.black);

        	//Draw the left eye       
        	g.fillOval(170,185,25,25);

        	//Draw the right eye        
        	g.fillOval(255,185,25,25);

        	//Draw the smile
		if ( percentage >= 50 )
        		g.drawArc(150,250,150,50,0,-180);
		else 
			g.drawArc(150,250,150,50,0,180);


	}
	public static void main(String[] args) {
		Percentage1 appwin = new Percentage1();

		appwin.setSize(new Dimension(900, 500));
		appwin.setTitle("TextFieldDemo");
		appwin.setVisible(true);
	}
}
Verified
