package metier;

import java.util.Date;

public class Commande {
	private Date date;
	private int nb_prod;
	private String num_cmd; // id unique
	private Produit prod; // a voir (heritage ou comment faire puisque le produit du jour est un produit particulier
	//(Spécialisé) ou constructeur par défaut ?
	private Client clt;
	
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
	
	public Commande(int nb_prod, Client leClient){
		date = new Date();//timestamp.getTime());
		this.nb_prod=nb_prod;
		//prod = produit_jr // par défaut (on pourrait le mettre en paramètre par défaut
		this.num_cmd = this.id();
		this.clt = leClient;
		
	}
	
	// écrire la toString pour toutes les classes
	public static void main(String args[]){
		Client clt_1 = new Client("Ya", "Mvrinka", "barbie","mmmm");
		Commande cmd = new Commande(2,clt_1);
		System.out.println(cmd.date);
	}

}
