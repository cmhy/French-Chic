package vue;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.Session;
import controleur.TypeEcran;

public class VueJetable extends JFrame{
	
	
	public VueJetable(){
		super();
		build();
	}
	
	
	private JPanel buildContentPane(){
		//new ContentPaint();
		JPanel p=new JPanel();
		JPanel panel = new ContentPaint();
		//p.setMaximumSize(new Dimension(800,600));
		panel.setLayout(null);
		p.setBounds(200, 300, 500, 400);
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		
		
		
		
		JLabel label = new JLabel("French Chic");
		label.setForeground(Color.MAGENTA);
		Font font = new Font("Arial",Font.BOLD,40);
		label.setFont(font);
		p1.setLayout(new BoxLayout(p1,BoxLayout.LINE_AXIS));
		
		p1.add(label);
		
		
		JTextField textfpseudo= new JTextField("pseudo");
		textfpseudo.setColumns(10);
		textfpseudo.setMaximumSize(new Dimension(150, 20));
		p2.setLayout(new BoxLayout(p2,BoxLayout.LINE_AXIS));
		p2.add(textfpseudo);

		
		JPasswordField textfmdp= new JPasswordField("mot de passe");
		textfmdp.setColumns(10);
		textfmdp.setMaximumSize(new Dimension(150, 20));
		
		p3.setLayout(new BoxLayout(p3,BoxLayout.LINE_AXIS));
		p3.add(textfmdp);
		
		
		JButton bouton = new JButton(("S'identifier"));
		p4.setLayout(new BoxLayout(p4,BoxLayout.LINE_AXIS));
		p4.add(bouton);
		
		p.setLayout(new BoxLayout(p,BoxLayout.PAGE_AXIS));
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		panel.add(p);
		
		this.getContentPane().add(panel);
		p.setBackground(Color.white);
		this.setBackground(Color.white);

		return panel;
	}	

	private void build(){

	    //Définit un titre pour notre fenêtre

	    this.setTitle("Accueil");

	    //Définit sa taille : 400 pixels de large et 100 pixels de haut

	    this.setSize(1000, 1000);

	    //Nous demandons maintenant à notre objet de se positionner au centre

	    this.setLocationRelativeTo(null);
	    


	    //On prévient notre JFrame que notre JPanel sera son content pane


	    //Termine le processus lorsqu'on clique sur la croix rouge

	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    //Et enfin, la rendre visible        

	  
	    this.setContentPane(buildContentPane());

	    this.setVisible(true);

	}


	
	
	
	
	
// Main 	
	public static void main (String[] args){
		Session session = new Session();
		
		
		if(session.traiterConnexion().equals(TypeEcran.Ecran_Accueil)){
			// on ouvre l'interface graphique
			new VueJetable();
		}
	}

}






	


