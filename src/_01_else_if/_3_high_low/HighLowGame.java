
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(5);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times
		for(int l=0;l<10;l++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
String responce=JOptionPane.showInputDialog(null, "can I have a guess?");
					
// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int i=	Integer.parseInt(responce);
			// 5. if the guess is correct
		    // if( i == random ){
		    //    // our code
			// }
		if (i==random) {
			
		
				// 6. Win
		JOptionPane.showMessageDialog(null, "you won!");
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		System.exit(0);	
		}
			// 7. if the guess is high
		if(i>random) {
				// 8. Tell them it's too high
			JOptionPane.showMessageDialog(null, "its too high!");
		}
			// 9. if the guess is low
		if(i<random) {
				// 10. Tell them it's too low
			JOptionPane.showMessageDialog(null, "its too low");
		} }
			// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "u loose");
	}

}


