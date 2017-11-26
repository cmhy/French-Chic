package controleur;
import controleur.TypeEcran;

public class Session {
	
	public TypeEcran traiterConnexion(){
		return TypeEcran.Ecran_Accueil; 
	}
	public TypeEcran traiterAffichageEcranAcceuilPerso(){ return TypeEcran.Ecran_Accueil_Personalise;}

}
