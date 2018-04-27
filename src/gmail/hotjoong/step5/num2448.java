package gmail.hotjoong.step5;

import java.util.Scanner;

public class num2448 {

	static char[][] star_arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		star_arr = new char[N][N * 2 - 1];
		

		for (int j = 0; j < N; j++) {
			for (int i = 0; i < N * 2 - 1; i++) {
				star_arr[j][i] = ' ';
			}
		}
		
		if (N == 3) {
			star_stamp2(2,0);
			for (int i = 0; i < N; i++) {
				System.out.println(star_arr[i]);
			}
			return;
		}

		int x = N;
		int y = 1;
		int n = (int) (Math.log(N / 3) / Math.log(2));
		star(n, x, y);

		for (int i = 0; i < N; i++) {
			System.out.println(star_arr[i]);
		}
	}

	public static void star(int n, int x, int y) {

		if (n == 1) {
			star_stamp(x, y);
		} else {
			star(n - 1, x, y);
			star(n - 1, x - 3 * (int) (Math.pow(2, n - 1)), y + 3 * (int) (Math.pow(2, n - 1)));
			star(n - 1, x + 3 * (int) (Math.pow(2, n - 1)), y + 3 * (int) (Math.pow(2, n - 1)));
		}
	}

	public static void star_stamp(int x, int y) {
		star_stamp2(x - 1, y - 1);
		star_stamp2(x - 4, y + 2);
		star_stamp2(x + 2, y + 2);
	}

	public static void star_stamp2(int x, int y) {
		star_arr[y][x] = '*';
		star_arr[y + 1][x - 1] = '*';
		star_arr[y + 1][x + 1] = '*';
		star_arr[y + 2][x - 2] = '*';
		star_arr[y + 2][x - 1] = '*';
		star_arr[y + 2][x] = '*';
		star_arr[y + 2][x + 1] = '*';
		star_arr[y + 2][x + 2] = '*';
	}

}
