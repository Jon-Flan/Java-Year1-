// Intro to programming Lab 23rd of March Star App

//@author: Jonathan Flanagan

//filename: StarApp

import javax.swing.JOptionPane;

public class StarApp{
	public static void main(String[] args) {
		//declare variables
		String month;
		int date;

		//instaiate class
		Star myStar;


		//create objects
		myStar = new Star();

		//take input from user
		month = JOptionPane.showInputDialog(null,"What month where you born: ");
		date = Integer.parseInt(JOptionPane.showInputDialog(null,"What day of " +month+ " where you born: "));


		//output & process
		myStar.setMonth(month);
		myStar.setDay(date);
		myStar.computeSign();

	}
}