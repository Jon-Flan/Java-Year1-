// intro to programming lab 23rd March Blood bank app

//@author Jonathan Flanagan

//filename Blood.java

import javax.swing.JOptionPane;

public class Blood{
	//decare variables
	String type;
	int age;

	//constructor
	public Blood(){
		type = "xxxx";
		age = 0;
	}

	//set mehtods for Month and Day
	public void setType(String type){
		this.type = type;
	}

	public void setAge(int age){
		this.age = age;
	}
	//compute method using nested if statement for selection of Starsign
	public void computeDonate(){
		if (age >= 18){
			if(type.equalsIgnoreCase("AB")){
				JOptionPane.showMessageDialog(null,"You can give blood to AB and receive from AB, A, B, O");
			}
			else if(type.equalsIgnoreCase("A")){
				JOptionPane.showMessageDialog(null,"You can give blood to A and AB and receive from A and O");
			}
			else if(type.equalsIgnoreCase("B")){
				JOptionPane.showMessageDialog(null,"You can give blood to B and AB and receive from B and O");
			}
			else if(type.equalsIgnoreCase("O")){
				JOptionPane.showMessageDialog(null,"You can give blood to AB, A, B, O and receive O");
			}
			else
				JOptionPane.showMessageDialog(null,"You did not enter a valid blood type");
		}
		else
			JOptionPane.showMessageDialog(null,"Sorry you are not old enough to Donate");
		
		

}
}