public class Affichage{
	public Affichage(int ames, int gold, int ascention){
		System.out.println("+------------------------------------------+");
		System.out.println("|           Souclick stats                 |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		if(ames > 1)
			System.out.println("|      Vous avez " + ames + " âmes !                  |");
		else
			System.out.println("|      Vous avez " + ames + " âme !	           |");
		if(gold > 1)
			System.out.println("|      Vous avez " + gold + " ors !                   |");
		else
			System.out.println("|      Vous avez " + gold + " or !                    |");
		if (ascention != 0)
			System.out.println("|      Vous avez fait " + ascention + " ascention !        |");
		else
			System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("|                                          |");
		System.out.println("+------------------------------------------+");
	}
}