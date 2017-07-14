package euler1_10;

public class Euler7 {
	public static void main(String args[]){
		long num = 2;
		int count = 1;
		
		while(count < 10001){
			num++;
			boolean isPrime = true;
			for(long i = 2; i <= num/2; i++){
				if(num % i == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime){
				count++;
			}
		}
		System.out.println(num);
	}
}
