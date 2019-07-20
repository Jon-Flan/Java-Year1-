/*create a game of hangmany where the chosen hidden phrase is picked at random from an array of phrases.
  the letters to be covered with an asterix isalso random each time.
  When the user inputs a letter, they receive either a message to say their letter was in the phrase and show it revealed or
  the letter wasnt in the phrase and to try again, once all the letters are guessed correctly a congratulations message along with the entire
  phrase is shown
*/

//@author:Jonathan Flanagan
//date: 7th May 2019
//filename: HangmanRandomApp.java

import javax.swing.JOptionPane;


public class HangmanRandomApp{
	public static void main(String arg[]){
		//declare variables
		String userGuess = " ";
		char guess = ' ';
		String secretPhrase = " ";
		String phrase = " ";
		String againQ = " ";
		Boolean tryAgain = true;
		Boolean correct = false;

		while(tryAgain == true){
		//declare and Instantiate classes
		HangmanRandom myHangman = new HangmanRandom();

		//compute the secret phrase randomly from the list of phrases
		myHangman.computeSecretPhrase();
		//get the secret phrase and store in variable
		secretPhrase = myHangman.getSecretPhrase();
		//get the actual phrase and store in variable
		phrase = myHangman.getPhrase();

			while(!phrase.equalsIgnoreCase(secretPhrase)){
			//show the secret phrase to the user & get users guess
			userGuess = JOptionPane.showInputDialog(null,"Guess the hidden letters in the phrase: " +secretPhrase);
			guess = userGuess.charAt(0);

			//set the users guess
			myHangman.setGuess(guess);
			//compute the guess
			myHangman.computeGuess();
			//reset the secret phrase
			secretPhrase = myHangman.getSecretPhrase();
			//get if answer is correct
			correct = myHangman.getCorrect();
					//if the guess is correct display congratulations else say try again
					if(correct == true){
						JOptionPane.showMessageDialog(null,"Great, your letter "+guess+" is in the phrase " +secretPhrase);
					}
					else
						JOptionPane.showMessageDialog(null,"Sorry, "+guess+" is not in the phrase, try again.");
			}
		//if the user has guessed all the correct letters, display congratulations,
		JOptionPane.showMessageDialog(null,"Congratulations, you guessed all the letters: " +secretPhrase);
		//gives the user the option to play the game again
		againQ = JOptionPane.showInputDialog(null,"Would you like to try again?: ");
			if(againQ.equalsIgnoreCase("yes") || againQ.equalsIgnoreCase("y")){
				tryAgain = true;
			}else
				tryAgain = false;
		}
		System.exit(0);
	}
}