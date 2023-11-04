package personnages;

public class Humain {
	private String nom;
	private String boissonPreferee;
	private int quantiteArgent;
	
	
	public Humain(String nom, String boissonPreferee, int quantiteArgent) {
		this.nom = nom;
		this.boissonPreferee = boissonPreferee;
		this.quantiteArgent = quantiteArgent;
	}


	public String getNom() {
		return nom;
	}


	public int getQuantiteArgent() {
		return quantiteArgent;
	}
	
	public void setQuantiteArgent(int quantiteArgent) {
		this.quantiteArgent = quantiteArgent;
	}
	
	public void direBonjour() {
		String texte="Bonjour ! Je m’appelle "+nom+" et j’aime boire du "+boissonPreferee+".";
		parler(texte);
		
	}


	protected void parler(String texte) {
		System.out.println("("+nom+") -"+texte);
		
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonPreferee+" ! GLOUPS !");
		
	}
	
	public void  acheter(String bien, int prix){
		if(quantiteArgent>=prix) {
			parler("J'ai "+quantiteArgent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous.");
			quantiteArgent-=prix;
		}
		else
			parler("Je n'ai plus que "+quantiteArgent+" en poche. Je ne peux pas m'offrir "+bien+" à "+prix+" sous.");
	}
	
	protected void gagnerArgent(int gain){
		quantiteArgent+=gain;
	}
	
	protected void perdreArgent(int perte){
		quantiteArgent-=perte;	
	}
}
