import javax.swing.*;
import java.awt.*;


public class Jeux extends FenetreJeux{
	public int hollow, gold;
	public Jeux(){
		super();

		PaintJeux panneau = new PaintJeux();
		this.fenetre.add(panneau); 
		ListenerGlobal obs = new ListenerGlobal(fenetre);
		panneau.setLayout(null);

		this.hollow = 5; 

		JButton kill_buny = new JButton("Tuer un lapin");
		kill_buny.setBounds(100,50,200,50);
		kill_buny.addActionListener(obs);
		kill_buny.setActionCommand("kill_buny");
		panneau.add(kill_buny);

		JLabel texte = new JLabel("ames " + hollow);
		texte.setBounds(650, 50, 200, 50);
		panneau.add(texte);
	}
}
