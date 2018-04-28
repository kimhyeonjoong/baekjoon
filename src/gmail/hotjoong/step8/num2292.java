package gmail.hotjoong.step8;

import java.util.Scanner;

public class num2292 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int n=1;
		int count=0;
		while(n<N) {
			count++;
			n+=count*6;
		}
		System.out.println(count+1);
	}

}
