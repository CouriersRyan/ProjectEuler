package euler1_10;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Program to find all multiples of 3 and 5 below 1000
public class Euler1 {
	public static void main(String args[]){
		List<Integer> multiples = new ArrayList<Integer>();
		for(int i = 1; i < 1000; i++){
			if(i % 3 == 0){
				multiples.add(i);
			}else if(i % 5 == 0){
				multiples.add(i);
			}else{
				
			}
		}
		int temp = 0;
		for(int i : multiples){
			temp += i;
		}
		System.out.println(temp);
	}
}
