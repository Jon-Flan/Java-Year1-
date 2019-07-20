// intro to programming Sat 13th April 2019: PigLatin is a secret language used by children whereby the first letter 
//of a word is moved to the end of the word and the letters “ay” are added to the end.  
//For example, Frances would translate to rancesfay in PigLatin.  
//You have been asked to develop an application that accepts a word from the user, 
//translates the word to PigLatin and outputs the translated word.  
//The application should make use of instantiable classes and the instantiable class should be named PigLatin.java

//@author Jonathan Flanagan

//filename: PigLatinApp.java

import javax.swing.JOptionPane;

public class PigLatinApp{
	public static void main(String args[]){
		//declare vairables
		String message = "";
		String newMessage; 

		//declare instance
		PigLatin myPigLatin;

		//create instance
		myPigLatin = new PigLatin();
		
		//get input from the user
		message = JOptionPane.showInputDialog(null,"Please enter a word to translate to Pig Latin: ");

		//set the message
		myPigLatin.setMessage(message);

		//compute the message
		myPigLatin.computeMessage();

		//get the new message
		newMessage = myPigLatin.getMessage();

		//display new output to the user
		JOptionPane.showMessageDialog(null,"The translation is: " +newMessage);

		

	}
}