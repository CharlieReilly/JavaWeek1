import java.util.Scanner;

public class Player {

	public int playerRowPosition=2;
	public int playerColumnPosition=2;
	

	
	public Player(int playerRowPosition, int playerColumnPosition) {
		super();
		this.playerRowPosition = playerRowPosition;
		this.playerColumnPosition = playerColumnPosition;
	}

	public int getPlayerRowPosition() {
		return playerRowPosition;
	}

	public void setPlayerRowPosition(int playerRowPosition) {
		this.playerRowPosition = playerRowPosition;
	}

	public int getPlayerColumnPosition() {
		return playerColumnPosition;
	}

	public void setPlayerColumnPosition(int playerColumnPosition) {
		this.playerColumnPosition = playerColumnPosition;
	}
	

		
}


