
public class Treasure {

	int treasureRowPosition=1;
	int treasureColumnPosition=1;
	
	
	
	public Treasure(int treasureRowPosition, int treasureColumnPosition) {
		super();
		this.treasureRowPosition = treasureRowPosition;
		this.treasureColumnPosition = treasureColumnPosition;
	}
	public int getTreasureRowPosition() {
		return treasureRowPosition;
	}
	public void setTreasureRowPosition(int treasureRowPosition) {
		this.treasureRowPosition = treasureRowPosition;
	}
	public int getTreasureColumnPosition() {
		return treasureColumnPosition;
	}
	public void setTreasureColumnPosition(int treasureColumnPosition) {
		this.treasureColumnPosition = treasureColumnPosition;
	}
	
}
