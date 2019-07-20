// intro to programming Sat 13th April 2019: Develop an application that accepts a one word message from the user as input. 
//The application should then encode and output the word by reversing the word and replacing all of the vowels with 
//numbers as follows: a = 1, e = 5, i = 9, o = 15 and u = 21.

//@author Jonathan Flanagan

//filename: Encoder1App.java
import javax.swing.JOptionPane;

public class Encoder1App{
	public static void main(String[] args) {

	//decalre variables
		String word = "";
		String newWord; 

		//declare instance
		Encoder1 myEncoder;

		//create instance
		myEncoder = new Encoder1();
		
		//get input from the user
		word = JOptionPane.showInputDialog(null,"Please enter a word: ");

		//set the message
		myEncoder.setEncoder(word);

		//compute the message
		myEncoder.computeEncoder();

		//get the new message
		newWord = myEncoder.getEncoder();

		//display new output to the user
		JOptionPane.showMessageDialog(null,"New word is: " +newWord);
	}
}