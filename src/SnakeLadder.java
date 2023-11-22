import java.util.Random;
class Player{
	private String name;
	private int position;
	private int noOfRolls;
	Player(String name){
		System.out.println("Player " + name + " created");
		this.name = name;
		position = 0;
		noOfRolls = 0;
	}
	public int getPosition(){
		return position;
	}
	public void setPosition(int moves) {
		if(position + moves <= 100 && position + moves >= 0) {
			position += moves;
			System.out.println("Player at position: "+ position);
		}
	}
	public int getNoOfRolls() {
		return noOfRolls;
	}
	public void setNoOfRolls() {
		noOfRolls += 1;
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
	
	public static void playGame(Player p1, Die die) {
		while(p1.getPosition() < 100) {
			int roll = die.rollDie();
			int move = p1.nextMove();
			p1.setNoOfRolls();
			if(move == 0) {
				roll = -1 * roll;
				p1.setPosition(roll);
			}
			else if(move == 1) {
				//No Move
			}
			else {
				p1.setPosition(roll);
			}
		}
		System.out.println("PLayer Won");
		System.out.println("No of die rolls to win: "+ p1.getNoOfRolls());
	}
	
	public static void main(String args[]) {
		Die die = new Die();
		Player p1 = new Player("Player 1");
		playGame(p1, die);
	}
	
}
