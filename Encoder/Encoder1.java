// intro to programming Sat 13th April 2019: Develop an application that accepts a one word message from the user as input. 
//The application should then encode and output the word by reversing the word and replacing all of the vowels with 
//numbers as follows: a = 1, e = 5, i = 9, o = 15 and u = 21.

//@author Jonathan Flanagan

//filename: Encoder1.java

public class Encoder1{
	//decalre variables
	private String word;
	private String newWord;
	private StringBuffer wordBuffer;

	//constructor
	public Encoder1(){
		word = " ";
		newWord = " ";
		wordBuffer = new StringBuffer();
	}
	//set method
	public void setEncoder( String word){
		this.word = word;
	}
	//comput the new word
	public void computeEncoder(){

		for (int i = word.length() -1 ; i >=0; i--){
			
			if(word.charAt(i) == 'a'){
				wordBuffer.append('1');
			}
			else if (word.charAt(i) == 'e'){
				wordBuffer.append('5');
			}
			else if (word.charAt(i) == 'i'){
				wordBuffer.append('9');
			}
			else if (word.charAt(i) == 'o'){
				wordBuffer.append("15");
			}
			else if (word.charAt(i) == 'u'){
				wordBuffer.append("21");
			}
			else{
				wordBuffer.append(word.charAt(i));
			}				
	}
	newWord = wordBuffer.toString();
	}
	//get method
	public String getEncoder(){
		return newWord;

}
}

