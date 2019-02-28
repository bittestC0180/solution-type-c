package problem04;

public class Main {
	public static void main(String[] args) {
		
//		Quiz[] q = new Quiz[18];
//		for(int i=1; i<= ;i++) {
//			q[i-1] = new Quiz(i);
//		}
		
		int[][] quiz = quizSetting();
		
	}
	
	public static int[][] quizSetting() {
		int quiz[][] = new int[9][2];

		for (int i=0; i<quiz.length; i++) {
			for (int j=0; j<2; j++) {
				int ran = (int)(Math.random()*9+1);  //1~9
				
				if(j==1 && quiz[i][0]==ran) {
					j--;
				} else {
					quiz[i][j] = ran;
				}
				
			}
		}
		return quiz;
	}
}