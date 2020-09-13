
package _02_loop_variables._2_shiny_objects;

import java.applet.AudioClip;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;


public class ShinyObjects {
	public static void main(String[] args) {
		
		
		// 1. Ask the user how many shiny objects they want
		String input = JOptionPane.showInputDialog(null, "how many shiny objects do you want?");
		//Converts your string to an int
		int num = Integer.parseInt(input);
		// 2. Use a JOption that many times
		for(int i=0;i<num;i++) {
JOptionPane.showMessageDialog(null, "1,000,000");


	}

	

}
}
