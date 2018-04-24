package gmail.hotjoong.step3;

import java.util.Scanner;

public class num2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String star="";
		for(int i=1; i<=N ; i++) {
			star="";
			for(int j=0 ; j<i ; j++) {
				star += "*";
			}
			System.out.println(star);
		}
	}

}
