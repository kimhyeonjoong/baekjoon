package gmail.hotjoong.step8;

import java.util.Scanner;

public class num2775 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int k,n;
		int[] result = new int[T]; 
		

		for(int t=0; t<T; t++) {
			int temp=0;
			k = sc.nextInt();
			n = sc.nextInt();
			int[] residents = new int[n];
			//residents초기화
			for(int i=0; i<n; i++) {
				residents[i] = i+1;
				//System.out.println(residents[i]);
			}
			for(int K=0; K<k; K++) {
				for(int N=0; N<n; N++) {
					if(N==0)
						residents[N] = residents[N];
					else
						residents[N] = residents[N-1] + residents[N]; 
				}
			}
			result[t] = residents[n-1];
			
		}
		for(int temp2 : result)
			System.out.println(temp2);
	}
}