package vue;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;

import controleur.*;
import metier.*;

public class VueJetable extends JFrame{



	public VueJetable(TypeEcran ecran){
		super();
		if(ecran.equals(TypeEcran.Ecran_Accueil)) {
			buildEcran_Accueil();
		}
	}

	public VueJetable(TypeEcran ecran, Client clt, Produit produitDuJour){
		super();

		if(ecran.equals(TypeEcran.Ecran_Accueil_Personnalise)) {
			buildEcran_Accueil_Personnalise(clt, produitDuJour);
		}
	}

	public VueJetable(TypeEcran ecran, Commande cmd){
		super();
		if (ecran.equals(TypeEcran.Ecran_Panier)) {
			buildEcran_Panier(cmd);
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

	private JPanel buildContentPaneEcran_Acueil_Personnalise(Client clt, Produit produitDuJour){
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
		String prenomClient = clt.getPrenom();
		String nomClient = clt.getNom();
		messageBienvenue.setText("Bonjour " + prenomClient + " " + nomClient);
		p2.setLayout(new BoxLayout(p2, BoxLayout.LINE_AXIS));
		p2.add(messageBienvenue);

		JLabel produit_Du_Jour = new JLabel();
		//TO DO changer ceci avec le nom du produitDujour si possible
		String produit = "" + produitDuJour.getRef();
		// TO DO Reccupérer ici le prix
		int prix = produitDuJour.getPrix();
		produit_Du_Jour.setText("Le produit du jour est le " + produit + " au prix HT de " + prix + " euros");
		p3.setLayout(new BoxLayout(p3, BoxLayout.LINE_AXIS));
		p3.add(produit_Du_Jour);

		JLabel quantite = new JLabel("Quantite     ");
		// TO DO ajouter la quantité commandee du produit
		JTextField quantiteCommandee = new JTextField(5); 
		quantiteCommandee.setMaximumSize(new Dimension(50, 20));
		p4.setLayout(new BoxLayout(p4, BoxLayout.LINE_AXIS));
		p4.add(quantite);
		p4.add(quantiteCommandee);

		// TO DO rajouter l'intellignece pour effectivement ajouter le produit au panier 
		JButton bouton = new JButton(("Ajouter le produit au panier"));
		p5.setLayout(new BoxLayout(p5,BoxLayout.LINE_AXIS));
		p5.add(bouton);
		bouton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {
				String qte = quantiteCommandee.getText();
				produitDuJour.retirerDuStock(Integer.parseInt(qte));
			}
		});


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


	private void buildEcran_Accueil_Personnalise(Client clt, Produit produitDuJour){
		this.setTitle("Ecran_Acueil_Personnalise");
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(buildContentPaneEcran_Acueil_Personnalise(clt, produitDuJour));
		this.setVisible(true);
	}

	private JPanel buildContentPaneEcran_Panier(Commande cmd){
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
		//Taille du tableau arbitrairement mis à 10
		String[][] produits = new String[10][10]; 
		int i=0;
		int montantTotalPanier=0; 
		for(LigneDeCommande ldc:cmd.getLigne_de_cmd()){
			produits[i][0]="" + ldc.getPrdt().getRef();
			produits[i][1] = "" + ldc.getPrdt().getPrix();
			produits[i][2] = "" + ldc.getQte();
			int montant = ldc.getPrdt().getPrix() * ldc.getQte();
			produits[i][3] = "" + montant;
			montantTotalPanier += montant;
			i++;
		}
		JTable tableauProduits = new JTable(produits, intitulesColonnes);
		p2.setLayout(new BoxLayout(p2,BoxLayout.LINE_AXIS));
		p2.add(tableauProduits);

		JLabel montantPanier = new JLabel();
		// TO DO Reccuperer ici le total du panier ; 
		String montantHT = "Montant Panier " + montantTotalPanier + " euros";
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

	private void buildEcran_Panier(Commande cmd){

		this.setTitle("Ecran_Panier");
		this.setSize(1000, 1000);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(buildContentPaneEcran_Panier(cmd));
		this.setVisible(true);

	}


	public static void main (String[] args){
		Client clt = new Client("Ndour", "Youssou", "youssou", "ndour");
		Client clt_2=new Client("Mvrinka", "Yangbo", "mvrinka", "yangbo");
		Session session = new Session();
		ArrayList<Object> listeInfos = session.traiterIdentification("youssou", "ndour");
		Client clientCourant = (Client) listeInfos.get(1);
		Produit produitDuJour = new Produit(100, 50, true);
		//new VueJetable(TypeEcran.Ecran_Accueil_Personnalise, clientCourant, produitDuJour);
		Commande cmd = new Commande(2, clt, produitDuJour);
		new VueJetable(TypeEcran.Ecran_Panier, cmd);
	}
}









