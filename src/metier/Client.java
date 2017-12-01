package metier;

import java.util.ArrayList;
import java.util.Random;

public class Client {
	private String nom;
	private String prenom;
	private String pseudo;
	private String mdp;
	private String numero_client; // id unique
	private ArrayList<Commande> cmd = new ArrayList<Commande>();
	public static ArrayList<Client> listeClients = new ArrayList<Client>();
	
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
	
	private  void miseAjourListeClients(){
		
		listeClients.add(this);
	}
	
	public Client(){
		this.nom= "defaultName";
		this.prenom = "defaultSurname";
		pseudo = "defaultNickname";
		numero_client = this.id();
		miseAjourListeClients();
	}
	
	public Client(String leNom,String lePrenom, String pseudonyme,String psswd){
		this.nom = leNom;
		this.prenom= lePrenom;
		this.pseudo= pseudonyme;
		this.mdp= psswd;
		this.numero_client=this.id();
		miseAjourListeClients();
	}
	
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

	public ArrayList<Commande> getCmd() {
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

	public void setCmd(ArrayList<Commande> cmd) {
		this.cmd = cmd;
	}


	public static Client rechercherClientParPseudo(String pseudo, String mdp){
		Client leClient = new Client();
		for (Client lesClients : listeClients) {
			if(lesClients.pseudo.equals(pseudo) && lesClients.mdp.equals(mdp)){
				leClient=lesClients;
			}
			break;
		}return leClient;
	}
	
	public static void main(String args[]){
		Client clt = new Client("Ndour", "Youssou", "youssou", "ndour");
		Client clt_2=new Client("Mvrinka", "Yangbo", "mvrinka", "yangbo");
		System.out.println(clt.mdp);
		System.out.println(clt_2.numero_client);
		System.out.println(listeClients);
		System.out.println(listeClients.size());
		
		
	}
	

}
