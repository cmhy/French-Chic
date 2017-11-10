package vue;



import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ContentPaint extends JPanel{
	
	public void paintComponent(Graphics g){
	
		    //x1, y1, width, height
			
			g.setColor(Color.blue);
		    g.drawRect(70,100,800, 600);
		   
		    g.setColor(Color.gray);
		    g.drawRect(15,20,900,750);
		    
	
		  }  
}

