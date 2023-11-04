package histoire;
import personnages.*;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain humain= new Humain("Prof","kombucha",54);
//		humain.direBonjour();
//		humain.acheter("une boisson", 12);
//		humain.boire();
//		humain.acheter("un jeu", 2);
//		humain.acheter("un kimono", 50);
		
		Commerçant marco= new Commerçant("Marco",20);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();
		
		Yakuza yaku= new Yakuza("Yaku Le Noir","whisky",30,"Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
		
		Ronin roro= new Ronin("Roro","shochu",60);
		roro.direBonjour();
		roro.donner(marco);

	}

}
