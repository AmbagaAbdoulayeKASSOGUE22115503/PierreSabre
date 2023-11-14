package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boissonPreferee, int quantiteArgent, String clan) {
		super(nom, boissonPreferee, quantiteArgent);
		this.clan = clan;
	}

	public int getReputation() {
		return reputation;
	}

	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon clan est celui de " + clan);

	}

	public void extorquer(Commerçant victime) { // ICI .....
		int argentPique = victime.getQuantiteArgent();
		int fortune = super.getQuantiteArgent() + argentPique;
		super.setQuantiteArgent(fortune);

		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();

		parler("J’ai piqué les " + argentPique + " sous de " + victime.getNom() + ", ce qui me fait " + fortune
				+ " sous dans ma poche. Hi ! Hi !");
		++reputation;
	}

	public void perdre() {
		super.parler("J’ai perdu mon duel et mes " + super.getQuantiteArgent()
				+ " sous, snif... J'ai déshonoré le clan de " + clan + ".");
		super.perdreArgent(getQuantiteArgent());
		--reputation;
	}

	public void gagner(int gain) {
		super.setQuantiteArgent(getQuantiteArgent() + gain);
		++reputation;
		super.parler(" Ce ronin pensait vraiment battre " + super.getNom() + " du clan de " + clan
				+ " ? Je l'ai dépouillé de ses " + gain + " sous.");
	}

}
