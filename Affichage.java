import javax.swing.*;
import java.awt.*;


public class Affichage{
	protected JFrame fenetre;
	public Affichage(){
		fenetre = new JFrame("Souclick");
		fenetre.setSize(1000, 700);
		fenetre.setResizable(false);
		fenetre.setLocation(50, 0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}