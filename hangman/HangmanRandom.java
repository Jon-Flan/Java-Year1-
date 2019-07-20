/*create a game of hangmany where the chosen hidden phrase is picked at random from an array of phrases.
  the letters to be covered with an asterix isalso random each time.
  When the user inputs a letter, they receive either a message to say their letter was in the phrase and show it revealed or
  the letter wasnt in the phrase and to try again, once all the letters are guessed correctly a congratulations message along with the entire
  phrase is shown
*/

//@author:Jonathan Flanagan
//date: 7th May 2019
//filename: HangmanRandom.java


import java.util.Random;

public class HangmanRandom{
	//declare variables
	private char guess;
	private String phrase;
	private String secretPhrase;
	private String phraseArray [];
	private StringBuffer phraseGuess;
	private Boolean correct;
	private int randomNum;
	private int phraseLength;

	//contructor
	public HangmanRandom(){
		guess = ' ';
		phrase = " ";
		phraseArray = new String[5];
		phraseGuess = new StringBuffer();
		correct = false;
		randomNum = 0;
		phraseLength = 0;

		
	}

	//set the users guess
	public void setGuess(char guess){
		this.guess = guess;
	}

	//compute method for choosing the secret phrase at random from array of phrases
	public void computeSecretPhrase()
	{
		//set the phrases into the phrase array
		phraseArray[0] = "programming";
		phraseArray[1] = "university";
		phraseArray[2] = "ireland";
		phraseArray[3] = "europe";
		phraseArray[4] = "elephant";


		//set the random number
		Random rand = new Random();
		randomNum = rand.nextInt(phraseArray.length);
		//set the phrase to the corresponding random number
		phrase = phraseArray[randomNum];

		//set the length of the phrase being used 
		phraseLength = phrase.length(); 
		//transverse the phrase and if there is a vowel to change append the phrase buffer to * then to save it to a string
		for (int i = 0; i < phraseLength; i++)
		{
			if(phrase.charAt(i) == 'a' || phrase.charAt(i) == 'e' || phrase.charAt(i) == 'i' ||
			   phrase.charAt(i) == 'o' || phrase.charAt(i) == 'u')
			{

				phraseGuess.append('*');
			}

			else
			{

				phraseGuess.append(phrase.charAt(i));
			}

			}
			secretPhrase = phraseGuess.toString();
		}

		//compute the users guess and if correct replace the asterix with the guess
		public void computeGuess(){
		phraseGuess = new StringBuffer();
		correct = false;
		//for loop to iterate over phrase and check if same as guess
		for (int i = 0; i < phrase.length(); i++){
			if(phrase.charAt(i) == guess){
				phraseGuess.append(guess);
				correct = true;
			}
			else{
				phraseGuess.append(secretPhrase.charAt(i));
				
			}
		}
		secretPhrase = phraseGuess.toString();

	}
		//get method for the actual phrase
		public String getPhrase(){
			return phrase;
		}
		//get method for the secret phrase
		public String getSecretPhrase(){
			return secretPhrase;
		}

		//get if correct or not
		public Boolean getCorrect(){
			return correct;
		}

	


	}
