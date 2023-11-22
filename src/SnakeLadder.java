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
	
	public int nextMove() {
		Random random = new Random();
		int nextMove = random.nextInt(3);
		if(nextMove == 0) {
			System.out.println("Snake");
		}
		else if(nextMove == 1) {
			System.out.println("No Move");
		}
		else {
			System.out.println("Ladder");
		}
		return nextMove;
	}
	
}

class Die{
	public int rollDie() {
		Random random = new Random();
		int number = random.nextInt(6) + 1;
		System.out.println("Die rolled, result: " + number);
		return number;
	}
}

public class SnakeLadder {
	public static void main(String args[]) {
		Die die = new Die();
		Player p1 = new Player("Player 1");
		die.rollDie();
		p1.nextMove();
	}
	
}
