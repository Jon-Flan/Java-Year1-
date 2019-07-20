/*
 *RockPaperScissors.java
 *@author Jonathan Flanagan 5/04/2019
 *
 */

 public class RockPaperScissors{

 	//declaring variables
	 private String player1;
	 private int player2;
	 private String winner;

	 //constructor
	 public RockPaperScissors(){
		 player1 = new String();
		 player2 = (int)(Math.random()*3)+1;
		 winner = new String();
	 }

	 //set method for player 1
	 public void setPlayer1(String player1){
		 this.player1 = player1;
	 }

	 //comppute methods
	 public void compute(){
	 	// if player chooses Rock
		 if(player1.equalsIgnoreCase("Rock")){
			 if(player2 == 1){
				 winner = "draw";
			 }
			 else if(player2 == 2){
				 winner = "Player 2";
			 }
			 else{
				 winner = "Player 1";
			 }
		 }
		 //if player chooses paper
		 else if(player1.equalsIgnoreCase("Paper")){
			 if(player2 == 1){
			 	 winner = "Player 1";
			 }
			 else if(player2 == 2){
			 	 winner = "draw";
			 }
			 else{
			 	 winner = "Player 2";
			 }
		 }
		 //if player chooses Scissors
		 else if(player1.equalsIgnoreCase("Scissors")){
			 if(player2 == 1){
			 	 winner = "Player 2";
			 }
			 else if(player2 == 2){
			 	 winner = "Player 1";
			 }
			 else{
			 	 winner = "draw";
			 }
		 }
		 //default statment if wrong input
		 else{
			 winner = "Sorry, you have enered an invalid option.";
		 }
	 }

	 //get methods
	 public String getWinner(){
		 return winner;
	 }
	 public int getPlayer2(){
	 		 return player2;
	 }
 }
