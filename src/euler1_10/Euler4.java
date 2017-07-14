package euler1_10;

public class Euler4 {
	public static void main(String args[]){
		int[] palindrome = new int[6];
		int result = 0;
		final int DIGITS = 6;
		System.out.println("Start");
		full_loop:
		for(int i = 999; i > 100; i--){
			for(int j = 999; j > 100; j--){
				int temp = j * i;
				palindrome = new int[6];
				int k = 0;
				while(temp != 0){
						palindrome[k] = temp % 10;
						temp -= temp % 10;
						temp /= 10;
						k++;
				}
				if(isPalindrome(palindrome)){
					if(i*j > result){
						result = i * j;
					}
				}
			}
		}
		System.out.println(result);
	}
	public static boolean isPalindrome(int[] palindrome){
		boolean temp = true;
		for(int i = 0; i < (palindrome.length); i++){
			if(palindrome[i] != palindrome[palindrome.length - (i+1)]){
				temp = false;
				break;
			}
		}
		return temp;
	}
}
