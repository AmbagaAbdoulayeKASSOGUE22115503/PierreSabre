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
	
	public void direBonjour() {
		String texte="Bonjour ! Je m’appelle "+nom+"et j’aime boire du "+boissonPreferee;
		parler(texte);
		
	}


	private void parler(String texte) {
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
	
	public void gagnerArgent(int gain){
		quantiteArgent+=gain;
		parler(gain+" sous! Je te remercie généreux donateur!");
	}
	
	private void perdreArgent(int perte){
		quantiteArgent-=perte;
		parler("J’ai tout perdu! Le monde est trop injuste...");
		
	}
}
