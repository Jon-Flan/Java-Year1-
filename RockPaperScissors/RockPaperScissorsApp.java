/*
 *RockPaperScissorsApp.java
 *@author  by Jonathan Flanagan 5/04/2019
 *
 */
 import javax.swing.JOptionPane;
 public class RockPaperScissorsApp{
	 public static void main(String args[]){
	 	//declaring variables
		 String player1, winner;
		 int player2;
		 int player1score = 0; 
		 int computerScore = 0;
		 
		 
		 //intialise and create objects
		 RockPaperScissors myRock = new RockPaperScissors();

		 //while loop set to count the computer and players score
		 while ((computerScore < 2) && (player1score < 2)){
		 JOptionPane.showMessageDialog(null,"The game is best out of three, the score is Player " +player1score+ " and Computer "+computerScore);
		 player1 = JOptionPane.showInputDialog(null,"Please enter your choice, Rock, Paper or Scissors");
		 myRock.setPlayer1(player1);
		 //computing the result
		 myRock.compute();
		 //getting the winnre 
		 winner = myRock.getWinner();
		 player2 = myRock.getPlayer2();

 		 //if staement depending on what the outcome was and increasing the players score by 1
		 if(winner.equals("Player 1")){
			 if(player2==1){
		 		JOptionPane.showMessageDialog(null,"Congratulations, you have beaten the computer! The computer chose Rock");
		 		player1score = player1score + 1;
			}
			else if(player2==2){
		 		JOptionPane.showMessageDialog(null,"Congratulations, you have beaten the computer! The computer chose Paper");
			    player1score = player1score + 1;
			}
			else{
		 		JOptionPane.showMessageDialog(null,"Congratulations, you have beaten the computer! The computer chose Scissors");
			    player1score = player1score + 1;
			}
		}
		 // else if staement depending on what the outcome was and increasing the computers score by 1
		else if(winner.equals("Player 2")){
			 if(player2==1){
		 		JOptionPane.showMessageDialog(null,"Hard Luck, you have been beaten by the computer! The computer chose Rock");
			    computerScore = computerScore +1;
			}
			else if(player2==2){
		 		JOptionPane.showMessageDialog(null,"Hard Luck, you have been beaten by the computer!The computer chose Paper");
			    computerScore = computerScore +1;
			}
			else{
		 		JOptionPane.showMessageDialog(null,"Hard Luck, you have been beaten by the computer! The computer chose Scissors");
			    computerScore = computerScore +1;
			}
		}
		 // else if staement depending if it was a draw
		else if(winner.equals("draw")){
			 if(player2==1){
		 		JOptionPane.showMessageDialog(null,"It was a draw this time! The computer chose Rock");
			}
			else if(player2==2){
		 		JOptionPane.showMessageDialog(null,"It was a draw this time! The computer chose Paper");
			}
			else{
		 		JOptionPane.showMessageDialog(null,"It was a draw this time! The computer chose Scissors");
			}
		}
		//else this default message appears
		else{

			JOptionPane.showMessageDialog(null, "You have entered an invalid option");
			}
	    }

	    //after escaping out of while loop depending on the score we give a different result
	    if (computerScore == 2){
	    	JOptionPane.showMessageDialog(null,"Hard luck, the computer won with a score of " +computerScore+ " to " +player1score);
			}
		else if(player1score ==2){
			JOptionPane.showMessageDialog(null,"Congratulations, you won with a score of " +player1score+ " to " +computerScore);
			}	

	    }
	}
