// intro to programming 06th April 2019 

//@author Jonathan Flanagan

//filename: Counting.java

public class Counting{
	//declare variables
	private String sentence;
	private int spacesCount;
	private int vowelCount;
	private int consonantsCount;

	//constructor
	public Counting(){
		sentence = "xxx";
		spacesCount = 0;
		vowelCount = 0;
		consonantsCount = 0;
	}

	//set methods
	public void setSentence(String sentence){
		this.sentence = sentence;
	}

	//compute method
	public void compute(){
		for(int i = 0; i < sentence.length(); i++){
			if(sentence.charAt(i) == ' '){
				spacesCount = spacesCount + 1;	
			}
			else if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || 
				     sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u')
			{
				vowelCount = vowelCount + 1;
			}
			else if (sentence.charAt(i) == 'b' || sentence.charAt(i) == 'c' || sentence.charAt(i) == 'd' || 
				     sentence.charAt(i) == 'f' || sentence.charAt(i) == 'g' || sentence.charAt(i) == 'h' || 
				     sentence.charAt(i) == 'j' || sentence.charAt(i) == 'k' || sentence.charAt(i) == 'l' || 
				     sentence.charAt(i) == 'm' || sentence.charAt(i) == 'n' || sentence.charAt(i) == 'b' || 
				     sentence.charAt(i) == 'p' || sentence.charAt(i) == 'q' || sentence.charAt(i) == 'r' ||
				     sentence.charAt(i) == 's' || sentence.charAt(i) == 't' || sentence.charAt(i) == 'v' || 
				     sentence.charAt(i) == 'w' || sentence.charAt(i) == 'x' || sentence.charAt(i) == 'y' || 
				     sentence.charAt(i) == 'z') 
				
				consonantsCount = consonantsCount +1;
			}	
	}


	public int getSpacesCount(){
		return spacesCount;
	}

	public int getVowelCount(){
		return vowelCount;
	}

	public int getConsonantsCount(){
		return consonantsCount;
	}

}