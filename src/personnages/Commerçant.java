package personnages;

public class Commerçant extends Humain {

	public Commerçant(String nom,int quantiteArgent) {
		super(nom,"thé",quantiteArgent);
	}
	
	public void seFaireExtorquer() {
		parler("J’ai tout perdu! Le monde est trop injuste...");
		setQuantiteArgent(0);
	}
	
	public void recevoir(int argent) {
		parler(argent+" sous! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
	
}
