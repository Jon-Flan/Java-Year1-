// intro to programming Sat 13th April 2019: PigLatin is a secret language used by children whereby the first letter 
//of a word is moved to the end of the word and the letters “ay” are added to the end.  
//For example, Frances would translate to rancesfay in PigLatin.  
//You have been asked to develop an application that accepts a word from the user, 
//translates the word to PigLatin and outputs the translated word.  
//The application should make use of instantiable classes and the instantiable class should be named PigLatin.java

//@author Jonathan Flanagan

//filename: PigLatin.java


public class PigLatin{
	//decalre variables
	private String message;
	private String newMessage;
	private StringBuffer messageBuffer;
	private int messagelength;

	//constructor
	public PigLatin(){
		message = " ";
		newMessage = " ";
		messageBuffer = new StringBuffer();
		messagelength = 0;
	}
	//set method
	public void setMessage( String message){
		this.message = message;
	}
	//comput the new word
	public void computeMessage(){
		messagelength = message.length()-1;
		messageBuffer.append(message);
		messageBuffer.setCharAt(0, message.charAt(message.length()-1));
		messageBuffer.setCharAt(messagelength, message.charAt(0));
		messageBuffer.append("ay");

		newMessage = messageBuffer.toString();
	}

	//get method
	public String getMessage(){
		return newMessage;
	}

}
