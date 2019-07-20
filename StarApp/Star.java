// intro to programming lab 23rd March Star App

//@author Jonathan Flanagan

//filename Star.java

import javax.swing.JOptionPane;

public class Star{
	//decare variables
	String month;
	int day;

	//constructor
	public Star(){
		month = "xxxx";
		day = 0;
	}

	//set mehtods for Month and Day
	public void setMonth(String month){
		this.month = month;
	}

	public void setDay(int day){
		this.day = day;
	}
	//compute method using nested if statement for selection of Starsign
	public void computeSign(){
		if ( ( (month.equalsIgnoreCase("January")) && ((day >= 1)&&(day <= 19)) ) || ( (month.equalsIgnoreCase("December")) && ( (day >= 22)&&(day <= 31) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Capricorn");
		} 
		else if ( ( (month.equalsIgnoreCase("January")) && ((day >= 20)&&(day <= 31)) ) || ( (month.equalsIgnoreCase("February")) && ( (day >= 1)&&(day <= 18) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Aquarius");
		}
		else if ( ( (month.equalsIgnoreCase("February")) && ((day >= 19)&&(day <= 28)) ) || ( (month.equalsIgnoreCase("March")) && ( (day >= 1)&&(day <= 20) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Pisces");
		}  
		else if ( ( (month.equalsIgnoreCase("March")) && ((day >= 21)&&(day <= 31)) ) || ( (month.equalsIgnoreCase("April")) && ( (day >= 1)&&(day <= 19) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Aries");
		} 
		else if ( ( (month.equalsIgnoreCase("April")) && ((day >= 20)&&(day <= 30)) ) || ( (month.equalsIgnoreCase("May")) && ( (day >= 1)&&(day <= 20) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Taurus");
		} 
		else if ( ( (month.equalsIgnoreCase("May")) && ((day >= 21)&&(day <= 31)) ) || ( (month.equalsIgnoreCase("June")) && ( (day >= 1)&&(day <= 20) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Gemini");
		} 
		else if ( ( (month.equalsIgnoreCase("June")) && ((day >= 21)&&(day <= 30)) ) || ( (month.equalsIgnoreCase("July")) && ( (day >= 1)&&(day <= 22) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Cancer");
		} 
		else if ( ( (month.equalsIgnoreCase("July")) && ((day >= 23)&&(day <= 31)) ) || ( (month.equalsIgnoreCase("August")) && ( (day >= 1)&&(day <= 22) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Leo");
		} 
		else if ( ( (month.equalsIgnoreCase("August")) && ((day >= 23)&&(day <= 31)) ) || ( (month.equalsIgnoreCase("September")) && ( (day >= 1)&&(day <= 22) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Virgo");
		} 
		else if ( ( (month.equalsIgnoreCase("September")) && ((day >= 23)&&(day <= 30)) ) || ( (month.equalsIgnoreCase("October")) && ( (day >= 1)&&(day <= 22) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Libra");
		} 
		else if ( ( (month.equalsIgnoreCase("October")) && ((day >= 23)&&(day <= 31)) ) || ( (month.equalsIgnoreCase("November")) && ( (day >= 1)&&(day <= 21) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Scorpio");
		} 
		else if ( ( (month.equalsIgnoreCase("November")) && ((day >= 22)&&(day <= 30)) ) || ( (month.equalsIgnoreCase("December")) && ( (day >= 1)&&(day <= 21) ) )){
			JOptionPane.showMessageDialog(null,"Your star sign is Sagitarius");
		} 
		else{
			JOptionPane.showMessageDialog(null,"Not a valid input");	
		}

		
		

}
}