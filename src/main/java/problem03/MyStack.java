package problem03;

import java.util.Arrays;

public class MyStack {
	
	private String[] buffer;
	private int top = -1;

	public MyStack( int size ) {
		buffer = new String[size];
	}
	
	public void push(String item) {
		top++;
		//System.out.println(top+ " " +buffer.length);
		int size = size();
		if (size <= top) {
			buffer = Arrays.copyOf(buffer, size*2);
			//System.out.println(buffer.length);
		}
		/*
		if (buffer.length <= top) {
			buffer = Arrays.copyOf(buffer, buffer.length*2);
			//System.out.println(buffer.length);
		}
		*/
		
		buffer[top] = item;
		
//		for(int i=0; i<buffer.length; i++) {
//			System.out.print(buffer[i]+" ");
//		}
	}

	public String pop() {
//		for(int i=0; i<buffer.length; i++) {
//			System.out.print(buffer[i]+" ");
//		}
//		System.out.println();
//		System.out.println(top);
//			
		if (top < 0) return "null";
		else {
			String pop = buffer[top];
			buffer[top--] = null;
			
			//buffer = Arrays.copyOf(buffer, buffer.length-1);
			return pop;
		}
		
		
	}

	public boolean isEmpty() {
		
		if (top < 0) return true;
		else return false;
	}
	
	public int size() {
		return buffer.length;
		//return 0;
	}
}