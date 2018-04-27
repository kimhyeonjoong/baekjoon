package gmail.hotjoong.step6;

import java.util.Scanner;

public class num2577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int result = A*B*C;
		int[] count = new int[10];
		for(int i=0; i<count.length; i++) {
			count[i] = 0;
		}
		String a = result + "";
		for(int i=0; i<a.length(); i++) {
			switch(a.charAt(i)) {
			case '0': count[0]++; break;
			case '1': count[1]++; break;
			case '2': count[2]++; break;
			case '3': count[3]++; break;
			case '4': count[4]++; break;
			case '5': count[5]++; break;
			case '6': count[6]++; break;
			case '7': count[7]++; break;
			case '8': count[8]++; break;
			case '9': count[9]++; break;
			}
		}
		for(int i=0; i<count.length; i++) {
			System.out.println(count[i]);
		}
	}

}
