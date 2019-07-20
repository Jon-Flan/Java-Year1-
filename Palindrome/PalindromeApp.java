// intro to programming Sat 13th April 2019: A Palindrome is a word which is spelled the same forward as it is backward. 
//For example, noon is spelled the same forward and backward.  
//Modify the application from Problem 1 which reverses a word to check whether or not the word entered by the user 
//is a Palindrome

//@author Jonathan Flanagan

//filename: PalindromeApp.java

import javax.swing.JOptionPane;

public class PalindromeApp{
	public static void main(String args[]){
		//declare vairables
		String word = "";
		int answer; 

		//declare instance
		Palindrome myPalindrome;

		//create instance
		myPalindrome = new Palindrome();
	
		
		//get input from the user
		word = JOptionPane.showInputDialog(null,"Please enter a word: ");

		//set the message
		myPalindrome.setWord(word);

		//compute the message
		myPalindrome.computeWord();


		//get the new message
		answer = myPalindrome.getWord();

		//display new output to the user
		if(answer == 1)
			JOptionPane.showMessageDialog(null,"This is a Palindrome ");
		else
			JOptionPane.showMessageDialog(null,"This is not a Palindrome ");
	}	

	}
