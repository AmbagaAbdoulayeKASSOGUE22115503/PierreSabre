package histoire;

import personnages.Commerçant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain humain= new Humain("Prof","kombucha",54);
//		humain.direBonjour();
//		humain.acheter("une boisson", 12);
//		humain.boire();
//		humain.acheter("un jeu", 2);
//		humain.acheter("un kimono", 50);

		// Commerçant marco= new Commerçant("Marco",20);
//		marco.direBonjour();
//		marco.seFaireExtorquer();
//		marco.recevoir(15);
//		marco.boire();

		// Yakuza yaku= new Yakuza("Yaku Le Noir","whisky",45,"Warsong");
//		yaku.direBonjour();
//		yaku.extorquer(marco);
//		System.out.println("");

		// Ronin roro= new Ronin("Roro","shochu",54);
//		roro.direBonjour();
//		roro.donner(marco);

		// roro.provoquer(yaku);

		Commerçant marco = new Commerçant("Marco", 20);
		Commerçant chonin = new Commerçant("Chonin", 40);
		Commerçant kumi = new Commerçant("Kumi", 10);
		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);

		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);

		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();

	}

}
