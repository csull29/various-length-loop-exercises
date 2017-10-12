/*
CharacterSample2.java
C Sullivan
7 3 2017
*/

//Create an applicaion that asks the user to enter a word and then print back each letter individually.
//JOptionPane to be used

import javax.swing.*;
public class CharacterSample2{
	public static void main(String args[]){

		String word;
		int len;

		word=JOptionPane.showInputDialog(null, "Please enter a word.");

		len=word.length();

		for(int i=0;i<len;i=i+1){ //Looping around the word until the condition is met which is the length of the word

		//Print out each individual character
		JOptionPane.showMessageDialog(null,word.charAt(i)); //Gets the word and print out each letter individually via. the loop

	}

	//Print out full word
	JOptionPane.showMessageDialog(null, "So the word is "+word);








	}
}