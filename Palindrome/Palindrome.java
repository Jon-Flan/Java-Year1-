// intro to programming Sat 13th April 2019: A Palindrome is a word which is spelled the same forward as it is backward. 
//For example, noon is spelled the same forward and backward.  
//Modify the application from Problem 1 which reverses a word to check whether or not the word entered by the user 
//is a Palindrome

//@author Jonathan Flanagan

//filename: PalindromeApp.java


public class Palindrome{
	//decalre variables
	private String word;
	private String newWord;
	private StringBuffer wordBuffer;
	private int answer;

	//constructor
	public Palindrome(){
		word = " ";
		newWord = " ";
		wordBuffer = new StringBuffer();
		answer = 0;
	}
	//set method
	public void setWord( String word){
		this.word = word;
	}
	//comput the new word
	public void computeWord(){

		for (int i = word.length() -1 ; i >=0; i--){
			wordBuffer.append(word.charAt(i));
		}
		newWord = wordBuffer.toString();


		if(word.equalsIgnoreCase(newWord))
			answer = 1;
		else
			answer = 0;
	}


	//get method
	public int getWord(){
		return answer;
	}

}