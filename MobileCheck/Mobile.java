// intro to programming 06th April 2019 5.	Develop an application that accepts a mobile number 
//(Irish mobile format: 085000000 or 0860000000) from the user and check the validity of the mobile number. 
//Create an instantiable class to check the validity of the mobile number. 
//The application should check first three digits of the mobile number for the valid format.

//@author Jonathan Flanagan

//filename: Mobile.java


public class Mobile
{
	//declare variable
	private String mobileNum;
	private int answer;
	private int numlength;

	//constructor
	public Mobile(){
		mobileNum = "xxx";
		answer = 0;
		numlength = 0;
	}

	//set method
	public void setNumber(String mobileNum){
		this.mobileNum = mobileNum;
	}

	//compute if correct input
	public void computeNum(){
	//set numlength to the number entered	
	numlength = mobileNum.length();	

	if((numlength == 10)&&(mobileNum.charAt(0) == '0')){

		if(mobileNum.charAt(1) == '8'){

			if(mobileNum.charAt(2) == '3' || mobileNum.charAt(2) == '5' || 
			   mobileNum.charAt(2) == '6' || mobileNum.charAt(2) == '7' ||
			   mobileNum.charAt(2) == '8' || mobileNum.charAt(2) == '9'){
				answer = 1;
				}
		}
	}
	else
		answer = 0;			
	}

	public int getAnswer(){
		return answer;
	}
}
