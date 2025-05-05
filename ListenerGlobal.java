import java.awt.event.*;
import javax.swing.*;


public class ListenerGlobal implements ActionListener{ 
	private JFrame fenetre;
	public ListenerGlobal(JFrame fenetre){
		this.fenetre = fenetre;
	}
	@Override
	public void actionPerformed(ActionEvent e){ 
		String composant = e.getActionCommand();
		if(composant == "play"){
			fenetre.dispose();
			new Jeux();
		} else if(composant == "quit"){
			System.exit(0);
		}
	}
}
