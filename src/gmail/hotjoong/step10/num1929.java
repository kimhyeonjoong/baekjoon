package gmail.hotjoong.step10;

import java.util.ArrayList;
import java.util.Scanner;

public class num1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		if(M==1) {
			M=2;
		}
		int N = sc.nextInt();
		ArrayList<Integer> number = new ArrayList();
		for(int i=0; i<=N-M ; i++) {
			number.add(M+i);
		}
		int c=2;
		for(int i=M ; i<=N/2 ; i++) {
			while(i*c<=N) {
				if(number.contains(i*c))
					number.remove(number.indexOf(i*c));
				c++;
			}
			c = 2;
		}
		

		for(int i=0; i<number.size(); i++)
			System.out.println(number.get(i));
	}

}
