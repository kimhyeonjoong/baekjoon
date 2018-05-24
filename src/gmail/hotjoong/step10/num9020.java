package gmail.hotjoong.step10;

import java.util.Scanner;

public class num9020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] number = new int[T];
		for(int i=0; i<T ; i++)
			number[i] = sc.nextInt();
		for(int i=0; i<number.length; i++) {
			Goldbach(number[i]);
		}
	}

	private static void Goldbach(int N) {
		int[] num = new int[N-1];
		for(int i=0; i<num.length; i++) 
			num[i] = i;
		num[1] = 0;
		for(int i=2; i<N/2 ; i++) {
			for(int j=i+i; j<=N ; j+=i) {
				if(j<N-1)
					num[j] = 0;
			}
		}
		
		for(int i=N/2 ; i>1 ; i--) {
			if(num[i]!=0&&num[N-i]!=0) {
				System.out.println(i + " " + (N-i));
				break;
			}
		}
		
	}
	
	

}
