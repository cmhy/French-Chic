package intercation;
import controleur.*;
import vue.*;

public class Main {
	public static void main (String[] args){
		Session session = new Session();
		VueJetable vuue=new VueJetable();
		
		if(session.traiterConnexion().equals(TypeEcran.Ecran_Accueil)){
			// on ouvre l'interface graphique
			vuue.afficherEcranAccueil();
			
		}
	}

}
