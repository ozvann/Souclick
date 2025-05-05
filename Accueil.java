import javax.swing.*;
import java.awt.*;


public class Accueil extends Affichage{
	public Accueil(){
		super();
		PaintAccueil panneau = new PaintAccueil();
		this.fenetre.add(panneau); 

		panneau.setLayout(null);

		JButton btn1 = new JButton("Jouer");
		JButton btn2 = new JButton("Quitter");

		btn1.setBounds(250,500,200,50);
		btn2.setBounds(550,500,200,50);

		ListenerGlobal obs = new ListenerGlobal(this.fenetre);
		btn1.addActionListener(obs);
		btn2.addActionListener(obs);

		btn1.setActionCommand("play");
		btn2.setActionCommand("quit");

		panneau.add(btn1);
		panneau.add(btn2);
	}
}
