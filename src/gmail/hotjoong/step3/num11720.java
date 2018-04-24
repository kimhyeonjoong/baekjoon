package gmail.hotjoong.step3;

import java.util.Scanner;

public class num11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String number = sc.next();
		int sum=0;
		for(int i=0; i<N ; i++) {
			sum += number.charAt(i)-'0';
		}
		System.out.println(sum);
	}

}
