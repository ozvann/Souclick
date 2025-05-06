import java.awt.event.*;
import javax.swing.*;


public class ListenerGlobal implements ActionListener{ 
	private JFrame fenetre;
	private int ames, gold;
	public ListenerGlobal(JFrame fenetre){
		this.fenetre = fenetre;					// Je peux enlever
	}
	@Override
	public void actionPerformed(ActionEvent e){ 
		String composant = e.getActionCommand();
		if(composant == "kill_buny"){
			// fenetre.dispose();
			this.ames = 1;
			System.out.println("Lapin tuer ! + 1 âme" + ames);
		} else if(composant == "quit"){
			// System.exit(0);
		}
	}
}
