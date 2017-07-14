package euler1_10;

import java.util.stream.*;

public class Euler5 {
	public static void main(String args[]){
		boolean temp = false;
		int n = 0;
		while(!temp){
			n++;
			temp = true;
			for(int i = 1; i < 20; i++){
				temp = temp && (n % i == 0);
			}
		}
		System.out.println(n);
	}
	
}
