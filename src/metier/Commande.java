package metier;

import java.util.ArrayList;
import java.util.Date;

public class Commande {
	private Date date;
	private int nb_prod;
	private String num_cmd; // id unique
	private Produit prod; // a voir (heritage ou comment faire puisque le produit du jour est un produit particulier
	private Client clt;
	private ArrayList<LigneDeCommande> ligne_de_cmd;
	
	
	private int idObjet = (int) (Math.random()*((9999 - 0) + 1) + 0);
	private int typeOperation = (int) (Math.random()*((10 - 0) + 1) + 0);
	private int typeObjet = (int) (Math.random()*((40 - 0) + 1) + 0);
	
	private String id()
	{
		int hash = idObjet + (typeOperation * 10000) + (typeObjet * 10000 * 11);

	    String res= String.valueOf(hash);
	    return res;
	}
	
	public Commande(){
		this.num_cmd=this.id();
		this.clt = new Client();
		// this.produit =produit_du_jr;
		
	}
	
	public Commande(int nb_prod, Client leClient, Produit produit){ //= produit_du_jr ){
		ligne_de_cmd = new ArrayList<LigneDeCommande>();
		date = new Date();//timestamp.getTime());
		this.nb_prod=nb_prod;
		LigneDeCommande oneLine = new LigneDeCommande(nb_prod, produit); 
		ligne_de_cmd.add(oneLine);
		this.num_cmd = this.id();
		this.clt = leClient;
		this.prod = produit;
	}
	

	
	public Date getDate() {
		return date;
	}

	public int getNb_prod() {
		return nb_prod;
	}

	public Produit getProd() {
		return prod;
	}

	public Client getClt() {
		return clt;
	}

	public ArrayList<LigneDeCommande> getLigne_de_cmd() {
		return ligne_de_cmd;
	}

	

	public void setDate(Date date) {
		this.date = date;
	}

	public void setNb_prod(int nb_prod) {
		this.nb_prod = nb_prod;
	}

	public void setProd(Produit prod) {
		this.prod = prod;
	}

	public void setClt(Client clt) {
		this.clt = clt;
	}

	public void setLigne_de_cmd(ArrayList<LigneDeCommande> ligne_de_cmd) {
		this.ligne_de_cmd = ligne_de_cmd;
	}
	

	public void ajouterProduit (Produit lePrdt, int qte){
		LigneDeCommande ldc=new LigneDeCommande(qte, lePrdt);
		lePrdt.retirerDuStock(qte);
		
	}



	// écrire la toString pour toutes les classes
	public static void main(String args[]){
		Client clt_1 = new Client("Ya", "Mvrinka", "barbie","mmmm");
		Produit produit = new Produit();
		Commande cmd = new Commande(2,clt_1, produit);
		System.out.println(cmd.date);
	}

}
