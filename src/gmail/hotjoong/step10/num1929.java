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
		ArrayList<Integer> result = new ArrayList();
		boolean check=true;
		int min=N;
		for(int i=M; i<=N; i++) {
			number.add(i);
		}
		for(int i=0; i<=N-M; i++) {
			for(int j=2; j<number.get(i); j++) {
				if(number.get(i)%j==0)
					check = false; 
			}
			if(check) {
				result.add(number.get(i));
			}
			check=true;
		}

		for(int i=0; i<result.size(); i++)
			System.out.println(result.get(i));
	}

}
