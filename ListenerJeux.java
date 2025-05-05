import java.awt.event.*;
import javax.swing.*;


public class ListenerJeux implements ActionListener{ 
	private JFrame fenetre;
	public ListenerJeux(JFrame fenetre){
		this.fenetre = fenetre;
	}
	@Override
	public void actionPerformed(ActionEvent e){ 
		String composant = e.getActionCommand();
		// if(composant == "play"){
			// fenetre.dispose();
		// }
	}
}
