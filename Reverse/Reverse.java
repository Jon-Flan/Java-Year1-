// intro to programming Sat 13th April 2019: You have been asked to develop an application that accepts a word from the user, 
//reverses and saves the reversed word as a new word and outputs the new word.  
//The application should make use of instantiable classes and the instantiable class should be named Reverse.java.

//@author Jonathan Flanagan

//filename: Reverse.java

public class Reverse{
	//decalre variables
	private String word;
	private String newWord;
	private StringBuffer wordBuffer;

	//constructor
	public Reverse(){
		word = " ";
		newWord = " ";
		wordBuffer = new StringBuffer();
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
	}

	//get method
	public String getWord(){
		return newWord;
	}

}

