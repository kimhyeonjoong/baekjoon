package gmail.hotjoong.step10;

import java.util.ArrayList;
import java.util.Scanner;

public class num1978 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> number = new ArrayList();
		int c=0;
		boolean check=true;
		for(int i=0; i<N; i++) {
			number.add(sc.nextInt());
			for(int j=2; j<number.get(i); j++) {
				if(number.get(i)%j==0)
					check = false;
			}
			if(check)
				c++;
			check = true;
		}
		if(number.contains(1))
			c--;
		System.out.println(c);
	}

}
