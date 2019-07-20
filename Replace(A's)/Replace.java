// intro to programming Sat 13th April 2019: 

//@author Jonathan Flanagan

//filename: Replace.java

public class Replace{
	//decalre variables
	private String name;
	private String newName;
	private StringBuffer strBuff;
	//consrtuctor
	public Replace(){
		name = " ";
		newName = " ";
		strBuff = new StringBuffer();
	}
	//set method
	public void setName(String name){
		this.name = name;
	}
	//compute method
	public void computeName(){
		for (int i = 0; i < name.length(); i++){
			if(name.charAt(i) == 'a'){
				strBuff.append('*');
			}
			else{
				strBuff.append(name.charAt(i));
			}
		}
		newName = strBuff.toString();
	}
	//get method
	public String getName(){
		return newName;
	}
}