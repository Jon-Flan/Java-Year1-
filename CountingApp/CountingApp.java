// intro to programming 06th April 2019 

//@author Jonathan Flanagan

//filename: CountingApp.java

import javax.swing.JOptionPane;

public class CountingApp{
	public static void main(String[] args) {
		
		//declare variables
		String input;
		int spacesCount;
		int vowelCount;
		int consonantsCount;

		//declare objects
		Counting myCount;
		//create objects
		myCount = new Counting();
		//get input from the user
		input = JOptionPane.showInputDialog(null,"Type a sentence: ");
		//set the inputted sentence to all lower case for ease of cmomputing
		String sentence = input.toLowerCase();
		//set sentence
		myCount.setSentence(sentence);
		//compute the counting of the vowels, spaces and consonants.
		myCount.compute();
		//get the answer 
		spacesCount = myCount.getSpacesCount();
		vowelCount = myCount.getVowelCount();
		consonantsCount = myCount.getConsonantsCount();
		//display answer to the user
		JOptionPane.showMessageDialog(null,"This sentance has " +spacesCount+ " spaces, "+vowelCount+ " vowels, and " +consonantsCount+ " consonants.");
	}
}