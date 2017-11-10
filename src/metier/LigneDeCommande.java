package metier;

public class LigneDeCommande {
	
	private int qte;
	private Produit prdt;
	
	public LigneDeCommande(int qte, Produit prdt) {
		this.qte = qte;
		this.prdt = prdt;
	}

	public int getQte() {
		return qte;
	}

	public Produit getPrdt() {
		return prdt;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	public void setPrdt(Produit prdt) {
		this.prdt = prdt;
	}
}
