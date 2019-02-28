package problem04;

public class Main {
	public static void main(String[] args) {
		
//		Quiz[] q = new Quiz[18];
//		for(int i=1; i<= ;i++) {
//			q[i-1] = new Quiz(i);
//		}
		
//		int[][] quiz = quizSetting();
		
		final int N = 9; 
		int[] dan = new int[N];
		int[] n1 = new int[N];
		int[] n2 = new int[N];
		int[] cnt = new int[N];
		
		
		//n1
		for (int i=0; i<N; i++) {
			int ran = (int)(Math.random()*9+1);
			n1[i] = ran;
		}
		
		//n2
		for (int i=0; i<N; i++) {
			int ran = (int)(Math.random()*9+1);
			if (n1[i] == ran) {
				i--;
			} else {
				n2[i] = ran;
			}
		}
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