package gmail.hotjoong.step10;

import java.util.ArrayList;
import java.util.Scanner;

public class num2581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		ArrayList<Integer> number = new ArrayList();
		boolean check=true;
		int min=N;
		int sum=0;;
		for(int i=M; i<=N; i++) {
			number.add(i);
		}
		int c=0;
		for(int i=0; i<=N-M; i++) {
			for(int j=2; j<number.get(i); j++) {
				if(number.get(i)%j==0)
					check = false; 
			}
			if(check) {
				if(min>number.get(i)&&number.get(i)!=1)
					min=number.get(i);
				sum+= number.get(i);
				c++;
			}
			check = true;
		}
		if(number.contains(1)) {
			sum--;
			c--;
		}
		if(c==0)
			System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

}
