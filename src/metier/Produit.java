package metier;

public class Produit {
	
	private int prix;
	private int qte_stock;
	private int ref;
	
	
	private int idObjet = (int) (Math.random()*((9999 - 0) + 1) + 0);
	private int typeOperation = (int) (Math.random()*((10 - 0) + 1) + 0);
	private int typeObjet = (int) (Math.random()*((40 - 0) + 1) + 0);
	
	private int id()
	{
		int hash = idObjet + (typeOperation * 10000) + (typeObjet * 10000 * 11);
		return hash;
	}
	public Produit(int qte, int prix_prod){ // est ce que le produit par défaut est le produit du jour ?
		this.ref = this.id();
		this.qte_stock =qte;
		this.prix = prix_prod;
	}

}
