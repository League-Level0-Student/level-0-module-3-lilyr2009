package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class OwnAdventure {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "one day I was at the park and I saw a dog");
		String input = JOptionPane.showInputDialog(null, "do I go pet the dog or leave it alone");
		if (input.equals("pet the dog")) {
		JOptionPane.showMessageDialog(null, "the dog turned into a monster and ate you");
		}
		if(input.equals("leave it alone")) {
			JOptionPane.showMessageDialog(null, "you got lucky, watch out next time");
		}
		String input2=JOptionPane.showInputDialog(null, "I see a lemonade stand. should you drink the lemonade?");
		if(input2.equals("yes")) {
			JOptionPane.showMessageDialog(null, "you DEAD");
		}
		if(input2.equals("no")) {
			JOptionPane.showMessageDialog(null, "your safe this time, but im coming for you");
		}
	}
}
