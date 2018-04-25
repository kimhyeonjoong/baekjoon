package gmail.hotjoong.step3;

import java.util.Scanner;

public class num15552 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int A,B=0;
		int[] result = new int[T];
		for(int i=0; i<T ; i++) {
			A = sc.nextInt();
			B = sc.nextInt();
			result[i] = A+B;
		}
		for(int i=0;  i<T ; i++) {
			System.out.println(result[i]);
		}
	}

}
