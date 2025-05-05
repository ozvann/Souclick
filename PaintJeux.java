import javax.swing.*;
import java.awt.*;


public class PaintJeux extends JPanel{
	private Image background;
	public PaintJeux(){
		super();
		this.background = Toolkit.getDefaultToolkit().getImage("Images/Fond.jpg");
	}
	@Override
	protected void paintComponent(Graphics pinceau){ 
		Graphics secondpinceau = pinceau.create();

		if(this.isOpaque()){
			secondpinceau.setColor(this.getBackground());
			secondpinceau.fillRect(0, 0, this.getWidth(), this.getHeight());
		}

		secondpinceau.drawImage(this.background, 0, 0, this);
	}
}