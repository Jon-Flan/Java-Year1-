// Intro to programming Lab 23rd of March Blood App

//@author: Jonathan Flanagan

//filename: BloodApp

import javax.swing.JOptionPane;

public class BloodApp{
	public static void main(String[] args) {
		//declare variables
		String type;
		int age;

		//instaiate class
		Blood myBlood;


		//create objects
		myBlood = new Blood();

		//take input from user
		type = JOptionPane.showInputDialog(null,"What blood type are you ");
		age = Integer.parseInt(JOptionPane.showInputDialog(null,"What age are you: "));


		//output & process
		myBlood.setType(type);
		myBlood.setAge(age);
		myBlood.computeDonate();

	}
}