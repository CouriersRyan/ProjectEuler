package euler1_10;
import java.util.List;
import java.util.ArrayList;

public class Euler3 {
	public static void main(String args[]){
		double j = 600851475.143;
		long num = (long)(j * 1000);
		long temp = num;
		System.out.println(temp);
		System.out.println(num);
		List<Long> PrimeFactors = new ArrayList<Long>();
		for(long i = 2; i < num/2; i++){
			if(temp % i == 0){
				while(temp % i == 0){
					System.out.println(i);
					temp = temp/i;
				}
				PrimeFactors.add(i);
			}
		}
		Object[] temp2 = PrimeFactors.toArray();
		System.out.println(temp2.length);
	}
}
