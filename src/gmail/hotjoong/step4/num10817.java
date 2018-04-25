package gmail.hotjoong.step4;

import java.util.Scanner;

public class num10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int list[] = new int[3];
		int temp = 0;
		for (int i = 0; i < 3; i++)
			list[i] = sc.nextInt();
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;
				}
			}
		}
		System.out.println(list[1]);
	}

}
