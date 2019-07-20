// intro to programming Sat 13th April 2019: You have been asked to develop an application that accepts a word from the user, 
//reverses and saves the reversed word as a new word and outputs the new word.  
//The application should make use of instantiable classes and the instantiable class should be named Reverse.java.

//@author Jonathan Flanagan

//filename: ReverseApp.java

import javax.swing.JOptionPane;

public class ReverseApp{
	public static void main(String args[]){
		//declare vairables
		String word = "";
		String newWord; 

		//declare instance
		Reverse myReverse;

		//create instance
		myReverse = new Reverse();
		
		//get input from the user
		word = JOptionPane.showInputDialog(null,"Please enter a word: ");

		//set the message
		myReverse.setWord(word);

		//compute the message
		myReverse.computeWord();

		//get the new message
		newWord = myReverse.getWord();

		//display new output to the user
		JOptionPane.showMessageDialog(null,"New word is: " +newWord);

		

	}
}