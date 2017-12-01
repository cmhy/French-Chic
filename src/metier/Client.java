package metier;

import java.util.Random;

public class Client {
	private String nom;
	private String prenom;
	private String pseudo;
	private String mdp;
	private String numero_client; // id unique
	private Commande cmd[];
	
	
	
	private int randomNum = (int) (Math.random()*((9999 - 0) + 1) + 0);
	private  int idObjet= randomNum;
	private int typeOperation = (int) (Math.random()*((10 - 0) + 1) + 0);
	private int typeObjet = (int) (Math.random()*((40 - 0) + 1) + 0);
	
	
	private String id()
	{
		int hash = idObjet + (typeOperation * 10000) + (typeObjet * 10000 * 11);

	    String res= String.valueOf(hash);
	    return res;
	}
	
	public Client(){
		numero_client = this.id();
	}
	
	public Client(String leNom,String lePrenom, String pseudonyme,String psswd){
		this.nom = leNom;
		this.prenom= lePrenom;
		this.pseudo= pseudonyme;
		this.mdp= psswd;
		this.numero_client=this.id();
	}
	
	
	public static void main(String args[]){
		Client clt=new Client();
		Client clt_2=new Client();
		System.out.println(clt.numero_client);
		System.out.println(clt_2.numero_client);
	}
	

}
