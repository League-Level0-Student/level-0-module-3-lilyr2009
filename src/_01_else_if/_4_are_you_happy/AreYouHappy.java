package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("are you happy?");
	if(input.equals("yes"))  {
	JOptionPane.showMessageDialog(null,"keep doing what your doing!");
	}
		if(input.equals("no"))   {
	  String input2= JOptionPane.showInputDialog("do you want to be happy?");
        if(input2.equals("no")) {
        	JOptionPane.showMessageDialog(null,"keep doing what your doing");
        	
        }
        if(input2.equals("yes")) {
        	JOptionPane.showMessageDialog(null,"change something");
        }
		}
        }	}	
		