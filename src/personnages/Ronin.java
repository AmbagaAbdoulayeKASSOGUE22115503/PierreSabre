package personnages;

public class Ronin extends Humain {
	private int honneur=1;
	
	
	public Ronin(String nom, String boissonPreferee, int quantiteArgent) {
		super(nom,boissonPreferee,quantiteArgent);
	}
	
	public void donner(Commerçant beneficiaire){
		int argentDonne= (super.getQuantiteArgent()*10)/100;
		int argentRestant=(int) (getQuantiteArgent()-0.1);
		super.setQuantiteArgent(argentRestant);
		
		super.parler(beneficiaire.getNom()+" prend ces "+argentDonne+" sous.");
		beneficiaire.recevoir(argentDonne);
		
	}

}
