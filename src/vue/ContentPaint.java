package vue;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ContentPaint extends JPanel {
	public void paintComponent(Graphics g){

	    //x1, y1, width, height
		
		g.setColor(Color.blue);
	    g.drawRect(15,15,450, 450);
	   
	    g.setColor(Color.gray);
	    g.drawRect(0,0,490,490);
	    

	  }  
}
