package controleur;
import controleur.TypeEcran;

public class Session {
	
	public TypeEcran traiterConnexion(){
		return TypeEcran.Ecran_Accueil; 
	}
	
	// TO DO ajouter lesinformations de client et leproduit du jour
	public TypeEcran traiterIdentification() {
		return TypeEcran.Ecran_Acueil_Personnalise;
	}
	
	public TypeEcran afficherEcran(TypeEcran ecran){
		// Throw an exception to be more rigorous
		if(ecran == TypeEcran.Ecran_Accueil) {
			return TypeEcran.Ecran_Accueil; 
		}
		else if(ecran == TypeEcran.Ecran_Acueil_Personnalise) {
			return TypeEcran.Ecran_Acueil_Personnalise; 
		}
		else if(ecran == TypeEcran.Ecran_Panier) {
			return TypeEcran.Ecran_Panier; 
		}
		System.out.println("The requested screen doesn't exist!");
		return null;
		
	}
}
