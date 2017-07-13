package euler1_10;

public class Euler2 {
	public static void main(String args[]){
		int i = 1;
		int j = i;
		int temp = 0;
		while(i < 4000000){
			if(i % 2 == 0){
				temp += i;
			}
			i += j;
			j = i -j;
		}
		System.out.println(temp);
	}
}
