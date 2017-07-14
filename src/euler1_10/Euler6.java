package euler1_10;

public class Euler6 {
	public static void main(String args[]){
		int sqSum = 0;
		for(int i = 1; i <= 100; i++){
			sqSum += Math.pow(i, 2);
			System.out.println(sqSum);
		}
		
		int sumSq = 0;
		for(int i = 1; i <=100; i++){
			sumSq += (long)(i);
		}
		sumSq = (int)(Math.pow(sumSq, 2));
		System.out.println(sqSum - sumSq);
	}
}
