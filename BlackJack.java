
public class BlackJack {
	
	public static int blackJack(int hand1, int hand2) {
			if( hand1 > 21 && hand2 > 21) {
				return 0;}
			if (hand1 < 22 && hand2 > 21) {
				return hand1;}
			if (hand1 > 21 && hand2 < 22) {
				return hand2;}
			if(hand1 > hand2) {
				return hand1;}
			if (hand2 > hand1) {
				return hand2;}
			return 0;
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(blackJack(16,16));
	}

}
