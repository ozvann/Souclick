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
		if(composant == "kill_buny"){
			// fenetre.dispose();
			System.out.println("Lapin tuer ! + 1 âme");
		} else if(composant == "quit"){
			// System.exit(0);
		}
	}
}
