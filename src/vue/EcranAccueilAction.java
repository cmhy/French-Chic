package vue;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

public class EcranAccueilAction extends AbstractAction {
		private  AffichageEcranAccueil fenetre;
	 
		public EcranAccueilAction(AffichageEcranAccueil fenetre, String texte){
			super(texte);
	 
			this.fenetre = fenetre;
		}
	 
		public void actionPerformed(ActionEvent e) { 
			//Action lors du clic sur le bouton calculer
		} 
	

}
