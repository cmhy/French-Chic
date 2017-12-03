package metier;

import java.util.ArrayList;

public class Produit {
	
	private int prix;
	private int qte_stock;
	private int ref;
	private boolean est_du_jour;
	private String nomProduit;
	public static ArrayList<Produit> listeProduits = new ArrayList<Produit>();
	
	
	private int idObjet = (int) (Math.random()*((9999 - 0) + 1) + 0);
	private int typeOperation = (int) (Math.random()*((10 - 0) + 1) + 0);
	private int typeObjet = (int) (Math.random()*((40 - 0) + 1) + 0);
	
	private int id()
	{
		int hash = idObjet + (typeOperation * 10000) + (typeObjet * 10000 * 11);
		return hash;
	}
	
	private void actualisationListeProduits(){
		listeProduits.add(this);
	}
	
	public Produit(){}
	
	public Produit(int qte, int prix_prod){ // est ce que le produit par défaut est le produit du jour ?
		this.ref = this.id();
		this.qte_stock =qte;
		this.prix = prix_prod;
		this.est_du_jour = false;
		actualisationListeProduits();
	}
	public Produit(int qte, int prix_prod,String nomProd, boolean estDuJour) {
		this.ref = this.id();
		this.qte_stock = qte;
		this.prix = prix_prod;
		this.nomProduit= nomProd;
		this.est_du_jour = estDuJour;
		actualisationListeProduits();
	}
	public int getPrix() {
		return prix;
	}
	public int getQte_stock() {
		return qte_stock;
	}
	public int getRef() {
		return ref;
	}
	
	public String getNomProduit(){
		return this.nomProduit;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public void setQte_stock(int qte_stock) {
		this.qte_stock = qte_stock;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	
	public void setNomProduit(String leNomDuProduit){
		this.nomProduit = leNomDuProduit;
	}
	
	public static Produit rechercheProduitDuJour(){
		Produit leproduitDujour = new Produit();
		for (Produit listeProduit : listeProduits) {
			if(listeProduit.est_du_jour){
				leproduitDujour=listeProduit;
			}
			break;
		}
		return leproduitDujour;	
	}
	
	
	public void retirerDuStock(int qte){
		this.setQte_stock(this.qte_stock - qte);
		System.out.println("mise a� jour OK. Reste " + this.getQte_stock() + " produits");
	}
	

}
