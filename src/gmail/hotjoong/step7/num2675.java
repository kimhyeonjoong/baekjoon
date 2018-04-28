package gmail.hotjoong.step7;

import java.util.Scanner;

public class num2675 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] R = new int[T];
		String[] S = new String[T];
		String[] result = new String[T];
		for(int i=0; i<T ; i++) {
			R[i] = sc.nextInt();
			S[i] = sc.next();
			result[i]="";
			for(int k=0; k<S[i].length(); k++) {
				for(int j=0; j<R[i] ; j++) {
					result[i] += String.valueOf(S[i].charAt(k));
				}
			}
		}
		for(int i=0 ; i<result.length ; i++) {
			System.out.println(result[i]);
		}
	}

}
