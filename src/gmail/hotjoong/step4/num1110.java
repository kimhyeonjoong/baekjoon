package gmail.hotjoong.step4;

import java.util.Scanner;

public class num1110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int N_sum = N / 10 + N % 10;
		int new_num = N % 10 * 10 + N_sum % 10;
		int count = 0;
		while (true) {
			count++;
			if (new_num == N)
				break;
			N_sum = new_num / 10 + new_num % 10;
			new_num = new_num % 10 * 10 + N_sum % 10;
		}
		System.out.println(count);

	}

}
