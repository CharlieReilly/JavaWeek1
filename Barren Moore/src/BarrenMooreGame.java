import java.util.Scanner;




public class BarrenMooreGame {

//Game map = new Game(int[][]);	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	
	Player p = new Player(3,3);
	Treasure t = new Treasure(1,1);
	Game map = new Game(p,t);
	
	map.p = p;
	map.playerSpawn(p);
	
	map.setPlayer(p);
//	map.p.getPlayerRowPosition();
//	map.p.getPlayerColumnPosition();
	
	map.t = t;
	map.treasureSpawn(t);
	
	map.setTreasure(t);
//	map.t.getTreasureColumnPosition();
//	map.t.getTreasureRowPosition()
// 	map.printMap();
	
	System.out.println("You awaken in a thick fog in a Barren Moor. Try 'look' to look around.");
		Scanner s = new Scanner(System.in);
	String look = s.next();{
		}
			if(look.equals("look")) {
				System.out.println("You look around.\n There is deep grey fog in every direction, and a bubbling sound coming from the grey swamp beneath you feet. \n You notice a small gold compass in your hand. \n It has dials on it that don't tell the time, but does display a distance... \n Try 'north', 'south', 'east' or 'west'.");
			}
			else{
				System.out.println("Try 'look' first to view your surroundings.");
			}
			
			map.playerMove();

	}


	}
	
