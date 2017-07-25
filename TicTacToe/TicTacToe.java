package TicTacToe;

public class TicTacToe 
{

	public static void main(String[] args) 
	{
		
		GameBoard myGame = new GameBoard();
		myGame.dispalyBoard();
		
		int counter = 1;
		while(myGame.gameActive() && counter < 10)
		{
			if(counter % 2 == 0)
				myGame.askPlayer('O');
			else
				myGame.askPlayer('X');
			counter++;
			
			System.out.println("\n");
			myGame.dispalyBoard();
			myGame.checkForWinner();
			
			if(counter == 10)
			{
				System.out.println("State mate! \n");
			}
		}
		
		//myGame.makeMove('O','0','0');
		//myGame.makeMove('X','1','1');
		
	}

}


