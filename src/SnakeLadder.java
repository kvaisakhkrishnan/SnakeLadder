import java.util.Random;
class Player{
	private String name;
	private int position;
	Player(String name){
		System.out.println("Player " + name + " created");
		this.name = name;
		position = 0;
	}
	public int getPosition(){
		return position;
	}
	public void setPosition(int moves) {
		if(position + moves <= 100) {
			position += moves;
			System.out.println("Player at position: "+ position);
		}
	}
	
}
public class SnakeLadder {
	public static void main(String args[]) {
		Player p1 = new Player("Player 1");
	}
	
}
