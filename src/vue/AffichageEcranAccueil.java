package vue;

import java.awt.Color;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AffichageEcranAccueil extends JFrame {

	public AffichageEcranAccueil(){
	 super();
	 build();
	}  

        

private JPanel buildContentPane(){
	//new ContentPaint();
	JPanel panel = new ContentPaint();
	panel.setLayout(new FlowLayout());
	panel.setBackground(Color.white);
 
	JLabel label = new JLabel("Fench Chic");
	panel.add(label);
	
	JTextField textfpseudo= new JTextField("pseudo");
	textfpseudo.setColumns(10);
	panel.add(textfpseudo);
	
	JTextField textfmdp= new JTextField("mot de passe");
	textfmdp.setColumns(10);
	panel.add(textfmdp);
	
	JButton bouton = new JButton(new EcranAccueilAction(this, "S'identifier"));
	panel.add(bouton);
	
	

	return panel;
}	

private void build(){

    //Définit un titre pour notre fenêtre

    this.setTitle("Accueil");

    //Définit sa taille : 400 pixels de large et 100 pixels de haut

    this.setSize(500, 500);

    //Nous demandons maintenant à notre objet de se positionner au centre

    this.setLocationRelativeTo(null);
    


    //On prévient notre JFrame que notre JPanel sera son content pane


    //Termine le processus lorsqu'on clique sur la croix rouge

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Et enfin, la rendre visible        

  
    this.setContentPane(buildContentPane());

    this.setVisible(true);

}



}
