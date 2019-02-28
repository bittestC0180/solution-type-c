package problem04;

public class Quiz {
	int dan;
	int n;
	boolean isSolved = false;
	
	public Quiz(int dan) {
		this.dan = dan;
		setting();
	}
	
	public void setting() {
		int n = (int)(Math.random()*9+1);
		
	}
}
