package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation=0;
	
	public Yakuza(String nom, String boissonPreferee, int quantiteArgent, String clan) {
		super(nom, boissonPreferee, quantiteArgent);
		this.clan= clan;
		this.reputation= reputation;
	}
	
	public void extorquer(Commerçant victime) {  //ICI .....
		int argentPique= victime.getQuantiteArgent();
		int fortune=super.getQuantiteArgent()+argentPique;
		super.setQuantiteArgent(fortune);
		
		parler(" Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		setQuantiteArgent(getQuantiteArgent()+victime.getQuantiteArgent());
		victime.seFaireExtorquer();
		
		parler("J’ai piqué les "+argentPique+" sous de "+victime.getNom()+", ce qui me fait "+fortune+" sous dans ma poche. Hi ! Hi !");
		++reputation;
	}
	
	

}
