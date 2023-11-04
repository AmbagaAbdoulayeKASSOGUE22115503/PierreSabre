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
	
	public void provoquer(Yakuza adversaire) {
		int force= 2*honneur;
		
		if (force>=adversaire.getReputation()) {
			super.parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
			int gain= adversaire.getQuantiteArgent()+super.getQuantiteArgent();
			super.setQuantiteArgent(gain);
			++honneur;
			super.parler("Je t’ai eu petit yakusa!");
			adversaire.perdre();
		}
		else {
			--honneur;
			super.parler(" J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(super.getQuantiteArgent());
			super.perdreArgent(getQuantiteArgent());
		}
		
	}

}
