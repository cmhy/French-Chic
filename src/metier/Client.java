package metier;

import java.util.Random;

public class Client {
	private String nom;
	private String prenom;
	private String pseudo;
	private String mdp;
	private String numero_client; // id unique
	private Commande[] cmd;
	
	
	
	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getPseudo() {
		return pseudo;
	}

	public String getMdp() {
		return mdp;
	}

	public Commande[] getCmd() {
		return cmd;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public void setCmd(Commande[] cmd) {
		this.cmd = cmd;
	}


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
		this.nom= "defaultName";
		this.prenom = "defaultSurname";
		pseudo = "defaultNickname";
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
