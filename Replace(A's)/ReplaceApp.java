// intro to programming Sat 13th April 2019: 

//@author Jonathan Flanagan

//filename: ReplaceApp.java

import javax.swing.JOptionPane;

public class ReplaceApp{
	public static void main(String[] args) {
		//declare variables
		String name, newName;

		//declare instance
		Replace myReplace;

		//creat instance
		myReplace = new Replace();

		//get input from user
		name = JOptionPane.showInputDialog(null,"Name please: ");

		//set name in method
		myReplace.setName(name);

		//compute the new name
		myReplace.computeName();

		//get the new name
		newName = myReplace.getName();

		//show output to user
		JOptionPane.showMessageDialog(null,"New name is: " +newName);

	}
}