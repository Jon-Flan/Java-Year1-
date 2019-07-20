// intro to programming 06th April 2019 5.	Develop an application that accepts a mobile number 
//(Irish mobile format: 085000000 or 0860000000) from the user and check the validity of the mobile number. 
//Create an instantiable class to check the validity of the mobile number. 
//The application should check first three digits of the mobile number for the valid format.

//@author Jonathan Flanagan

//filename: MobileApp.java

import javax.swing.JOptionPane;

public class MobileApp{
	public static void main(String[] args) {
		//declare variables
		String mobilenum;
		int answer;

		//declare objects
		Mobile myMobile;

		//create objects
		myMobile = new Mobile();

		do{
		//get input from the user
		mobilenum = JOptionPane.showInputDialog(null,"Please enter a valid Irish Mobile Number: ");

		//set methods
		myMobile.setNumber(mobilenum);

		//compute if correct number
		myMobile.computeNum();

		//get answer 
		answer = myMobile.getAnswer();
	    }
	    while(answer == 0);
	    JOptionPane.showMessageDialog(null,"Thank you!");
	}
}