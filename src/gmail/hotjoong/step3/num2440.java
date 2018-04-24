package gmail.hotjoong.step3;

import java.util.Scanner;

public class num2440 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String star="";
		for(int i=0; i<N ; i++) {
			star="";
			for(int k=0 ; k<i ; k++) {
				star += " ";
			}
			
			for(int j=0 ; j<N-i ; j++) {
				star += "*";
			}
			System.out.println(star);
		}
	}

}
