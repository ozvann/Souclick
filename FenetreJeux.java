import javax.swing.*;
import java.awt.*;


public class FenetreJeux{
	protected JFrame fenetre;
	public void Affichage(){
		fenetre = new JFrame("Souclick");
		fenetre.setSize(1280, 720);
		fenetre.setResizable(false);
		fenetre.setLocation(50, 0);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
