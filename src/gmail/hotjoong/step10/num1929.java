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
		
		int[] number = new int[N-M+1];
		for(int i=0; i<number.length; i++) {
			number[i] = M+i;
		}
		
		for(int i=0; i<number.length; i++) {
			if(number[i]==0)
				continue;
			for(int j=(i+M)+(i+M); j<N-M ;j+=(i+M)) {
				number[j] = 0;
			}
		}
		
		for(int i=0; )
		
	}

}
