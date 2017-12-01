package vue;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

import controleur.Session;
import controleur.TypeEcran;

public class VueJetable extends JFrame{


	public VueJetable(TypeEcran ecran){
		super();
		if(ecran.equals(TypeEcran.Ecran_Accueil)) {
			buildEcran_Accueil();
		}
		else if(ecran.equals(TypeEcran.Ecran_Acueil_Personnalise)) {
			buildEcran_Accueil_Personnalise();
		}
		else if (ecran.equals(TypeEcran.Ecran_Panier)) {
			buildEcran_Panier();
		}
	}


	private JPanel buildContentPaneEcran_Accueil(){
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
	
	private void buildEcran_Accueil(){

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

	  
	    this.setContentPane(buildContentPaneEcran_Accueil());

	    this.setVisible(true);

	}

	private JPanel buildContentPaneEcran_Acueil_Personnalise(){
		JPanel p=new JPanel();
		JPanel panel = new ContentPaint();
		panel.setLayout(null);
		p.setBounds(200, 300, 500, 400);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel(); 

		JLabel label = new JLabel("French Chic");
		label.setForeground(Color.MAGENTA);
		Font font = new Font("Arial",Font.BOLD,40);
		label.setFont(font);
		p1.setLayout(new BoxLayout(p1,BoxLayout.LINE_AXIS));
		p1.add(label);

		JLabel messageBienvenue = new JLabel();
		// TO DO ajouter les infromations sur le client
		String client = "Marie Dupond ";
		messageBienvenue.setText("Bonjour " + client);
		p2.setLayout(new BoxLayout(p2, BoxLayout.LINE_AXIS));
		p2.add(messageBienvenue);
		
		JLabel produitDuJour = new JLabel();
		// TO DO ajouter les infromations sur le produit du jour
		//TO DO changer ceci en type produit et concaténer les informations
		String produit = "Pantalon ZOUK ";
		// TO DO Reccupérer ici le prix
		int prix = 50;
		produitDuJour.setText("Le produit du jour est le " + produit + "au prix HT de " + prix + " euros");
		p3.setLayout(new BoxLayout(p3, BoxLayout.LINE_AXIS));
		p3.add(produitDuJour);
		
		JLabel quantite = new JLabel();
		// TO DO ajouter la quantité commandee du produit
		int montant = 20;
		quantite.setText("Quantite " + montant + " euros");
		p4.setLayout(new BoxLayout(p4, BoxLayout.LINE_AXIS));
		p4.add(quantite);
		
		// TO DO rajouter l'intellignece pour effectivement ajouter le produit au panier 
		JButton bouton = new JButton(("Ajouter le produit au panier"));
		p5.setLayout(new BoxLayout(p5,BoxLayout.LINE_AXIS));
		p5.add(bouton);
		

		p.setLayout(new BoxLayout(p,BoxLayout.PAGE_AXIS));
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);
		p.add(p5); 

		panel.add(p);
		this.getContentPane().add(panel);
		p.setBackground(Color.white);
		this.setBackground(Color.white);

		return panel;
	}
	
	
	private void buildEcran_Accueil_Personnalise(){
		this.setTitle("Ecran_Acueil_Personnalise");
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(buildContentPaneEcran_Acueil_Personnalise());
		this.setVisible(true);
	}
	
	private JPanel buildContentPaneEcran_Panier(){
		JPanel p=new JPanel();
		JPanel panel = new ContentPaint();
		panel.setLayout(null);
		p.setBounds(200, 300, 500, 400);

		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();

		JLabel label = new JLabel("Votre panier");
		label.setForeground(Color.MAGENTA);
		Font font = new Font("Arial",Font.PLAIN,40);
		label.setFont(font);
		p1.setLayout(new BoxLayout(p1,BoxLayout.LINE_AXIS));
		p1.add(label);

		String[] intitulesColonnes = {"Libelle", "Prix HT", "Quantite", "Montant"};
		String[][] produits = {
			      {"Chemise Lacoste", "20 euros", "1", "20 euros"},
			      {"Pantallon ZOUK", "40 euros", "3", "120 euros"},
				  {"TShirt Decathlon", "5 euros", "5", "25 euros"},
			    }; 
		JTable tableauProduits = new JTable(produits, intitulesColonnes);
		p2.setLayout(new BoxLayout(p2,BoxLayout.LINE_AXIS));
		p2.add(tableauProduits);
		
		JLabel montantPanier = new JLabel();
		// TO DO Reccuperer ici le total du panier ; 
		int montantTotal = 165;
		String montantHT = "Montant Panier " + montantTotal + " euros";
		montantPanier.setText(montantHT);
		p3.add(montantPanier);
		
		p.setLayout(new BoxLayout(p,BoxLayout.PAGE_AXIS));
		p.add(p1);
		p.add(p2);
		p.add(p3);

		panel.add(p);
		this.getContentPane().add(panel);
		p.setBackground(Color.white);
		this.setBackground(Color.white);

		return panel;
	}
	
private void buildEcran_Panier(){

		this.setTitle("Ecran_Panier");
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(buildContentPaneEcran_Panier());
		this.setVisible(true);

	}


	// Main 	
	public static void main (String[] args){
		Session session = new Session();
		new VueJetable(TypeEcran.Ecran_Panier);
	}
}









