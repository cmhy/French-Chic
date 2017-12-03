package controleur;

import java.util.ArrayList;

import controleur.*;
import metier.*;
import vue.*;

public class Session {
	
	public TypeEcran traiterConnexion(){
		return TypeEcran.Ecran_Accueil; 
	}
	
	// TO DO ajouter les informations du client et du produit du jour

	public ArrayList<Object> traiterIdentification(String pseudo, String mdp){
		Client leClient =  new Client();
		
		leClient.setPseudo(pseudo);
		leClient.setMdp(mdp);
		leClient = leClient.rechercherClientParPseudo(pseudo, mdp);
		
		ArrayList<Object> object_to_return= new ArrayList<Object>();
		
		object_to_return.add(TypeEcran.Ecran_Accueil_Personnalise);
		object_to_return.add(leClient);
		object_to_return.add(leClient.getCmd());
		
		return object_to_return;
	}
	
	// Recuperer la ligne de commande avec ses informations 
	public ArrayList<Object> traiterAjoutProduitPanier(Produit leProduit, int qte){
		ArrayList<Object> to_return = new ArrayList<Object>();
		to_return.add(TypeEcran.Ecran_Panier);
		
		Commande laCommande = new Commande();
		laCommande.ajouterProduit(leProduit, qte);
		
		to_return.add(laCommande);
		
		return to_return;
		
	}
}
