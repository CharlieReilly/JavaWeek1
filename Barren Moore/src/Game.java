import java.util.Scanner;

public class Game {
	
	Treasure t;
	Player p;
	
	public Game(Player p, Treasure t) {
		this.p = p;
		this.t = t;
	}
	//Scanner s = new Scanner(System.in);
	
//	Spawn player at position [4,4] in 7x7 array
 public static void playerSpawn(Player p) {
 p.setPlayerRowPosition(3);
 p.setPlayerColumnPosition(3);
 }
  
 public static void treasureSpawn (Treasure t) {
 t.setTreasureRowPosition((int) Math.random()*7);
 t.setTreasureColumnPosition((int) Math.random()*7);
 }
//	Creates 7x7 array
	public int[][] gameMap = new int[7][7];
	
	public void setPlayer(Player p) {
	this.gameMap[p.playerRowPosition][p.playerColumnPosition] = 1;
	}
	
	public void setTreasure(Treasure t) {
		this.gameMap[t.treasureRowPosition][t.treasureColumnPosition] = 2;
	}
//	Method to print array
	public void printMap() {
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(gameMap[i][j]);
			}
			System.out.println();
		}

	}

	
	
	
	


// Spawn treasure at random point in 7x7 array

 
 
 
public  double pythag() {
// Pythagoras For Treasure Distance.
 double treasureDistance =( Math.sqrt(((t.treasureRowPosition -
 p.playerRowPosition)*(t.treasureRowPosition -
 p.playerRowPosition))+((t.treasureColumnPosition -
 p.playerColumnPosition)*(t.treasureColumnPosition - p.playerColumnPosition))));
 return treasureDistance;
}
 


public void playerMove() {
	
	
	
	while(pythag()>0) {
	
	Scanner sc = new Scanner(System.in);
	
	String direction = sc.nextLine();
	
 if(direction.equals("north")) {
 p.playerRowPosition = p.playerRowPosition - 1;
 }
 if(direction.equals("south")) {
 p.playerRowPosition = p.playerRowPosition + 1;
 }
 if(direction.equals("west")) {
 p.playerColumnPosition = p.playerColumnPosition - 1;
 }
 if(direction.equals("east")) {
 p.playerColumnPosition = p.playerColumnPosition + 1;
 }
 System.out.println("Distance on compass reads: " + pythag() + "m.");
 }
	System.out.print("CONGRATULATIONS!! You found the treasure!");
}


 }
