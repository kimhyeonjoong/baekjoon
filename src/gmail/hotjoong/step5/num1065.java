package gmail.hotjoong.step5;

import java.util.Scanner;

public class num1065 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String number = "";
		int result=0;
		if(N<100) {
			result=N;
		}else if(N<1000) {
			result=99;
			for(int i=100; i<=N; i++) {
				if((i/100-i%100/10)==(i%100/10-i%10))
					result++;
			}
		}else
			result=144;
		System.out.println(result);
	}

}
