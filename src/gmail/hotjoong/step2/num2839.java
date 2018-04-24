package gmail.hotjoong.step2;

import java.util.Scanner;

public class num2839 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M5,M3,min=-1;
		M5 = N/5;
		M3 = N%5/3;
		while(M5!=-1) {
			if((N-5*M5)%3==0) {
				min = M5+(N-5*M5)/3;
				break;
			}
			M5--;
		}
		
		System.out.println(min);
	}

}
