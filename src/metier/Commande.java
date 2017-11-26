package metier;

import java.util.Date;

public class Commande {
	private Date date;
	private int nb_prod;
	private String num_cmd; // id unique
	//private Produit prod; // a voir (heritage ou comment faire puisque le produit du jour est un produit particulier
	private Client clt;
	private LigneDeCommande[] ligne_de_cmd;
	private static Produit pdtJour;
	
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
	
	public Commande(int nb_prod, Client leClient){ //= produit_du_jr ){
		date = new Date();//timestamp.getTime());
		this.nb_prod=nb_prod;
		
		this.num_cmd = this.id();
		this.clt = leClient;
		
	}
	

	
	public Date getDate() {
		return date;
	}

	public int getNb_prod() {
		return nb_prod;
	}

	/*public Produit getProd() {
		return prod;
	}*/

	public Client getClt() {
		return clt;
	}

	public LigneDeCommande[] getLigne_de_cmd() {
		return ligne_de_cmd;
	}

	public static Produit getPdtJour() {
		return pdtJour;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setNb_prod(int nb_prod) {
		this.nb_prod = nb_prod;
	}

	/*public void setProd(Produit prod) {
		this.prod = prod;
	}*/

	public void setClt(Client clt) {
		this.clt = clt;
	}

	public void setLigne_de_cmd(LigneDeCommande[] ligne_de_cmd) {
		this.ligne_de_cmd = ligne_de_cmd;
	}

	public static void setPdtJour(Produit pdtJour) {
		Commande.pdtJour = pdtJour;
	}

	// écrire la toString pour toutes les classes
	public static void main(String args[]){
		Client clt_1 = new Client("Ya", "Mvrinka", "barbie","mmmm");
		Commande cmd = new Commande(2,clt_1);
		System.out.println(cmd.date);
	}

}
