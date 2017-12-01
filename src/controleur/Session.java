package controleur;
import controleur.TypeEcran;

public class Session {
	
	public TypeEcran traiterConnexion(){
		return TypeEcran.Ecran_Accueil; 
	}
	
	// TO DO ajouter les informations du client et du produit du jour
	public TypeEcran traiterIdentification() {
		return TypeEcran.Ecran_Acueil_Personnalise;
	}
	// Recuperer la ligne de commande avec ses informations 
	public TypeEcran traiterPanier() {
		return TypeEcran.Ecran_Panier;
	}
}
