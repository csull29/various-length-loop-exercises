/*
CharacterSample.java
C Sullivan
7 3 1017
*/

//Create an application to ask the user for their name and count the amount of characters in their name.

import javax.swing.*;
public class CharacterSample{
	public static void main(String args[]){


		//variables
		String name;
		int length;

		//Step 1: Ask the question and store the answer
		name=JOptionPane.showInputDialog(null, "Please enter your name");

		//Step 2: Get the lentgh of the word
		length=name.length();

		//Step 3: Print out the answer for the user
		JOptionPane.showMessageDialog(null, "There are "+length+ " characters in your name.");




	}
}