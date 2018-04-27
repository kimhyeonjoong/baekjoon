package gmail.hotjoong.step6;

import java.util.Scanner;

public class num8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		String[] ox = new String[N];
		for(int i=0; i<N ; i++){
			ox[i] = sc.next();
		}
		int[] score = new int[N];
		int o_count=0;
		for(int i=0; i<ox.length; i++) {
			for (int j = 0; j < ox[i].length(); j++) {
				switch(ox[i].charAt(j)) {
				case 'O':
					o_count++;
					score[i] = score[i] + o_count;
					break;
				case 'X':
					o_count=0;
					break;
				}
			}
			o_count=0;
		}
		for(int tempValue : score) {
			System.out.println(tempValue);
		}
	}

}
