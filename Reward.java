import java.awt.event.*;
import javax.swing.*;


public class Reward extends FenetreJeux{
	private int pr_hollow, int pr_gold, String pr_item;
	public void Reward(int hollow = 0, int gold = 0, String item = "null"){
		this.pr_hollow = hollow;
		this.pr_gold = gold;
		this.pr_item = item;
	}
}