package gmail.hotjoong.step5;

import java.util.Scanner;

public class num2448 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int k = 0;
		int M = N/3;
		
		while (M >= 2) {
			k++;
			M /= 2;
		}
		k_check(k,N);
		
	}

//	private static void k_check2(int k, int N) {
//		String[] star_line = new String[N+1];
//		star_line = k_check(1, 6);
//		
//	}

	public static String[] k_check(int k, int N) {
		String[] star_line = new String[N+1];
		star_line[1] = "  *  ";
		star_line[2] = " * * ";
		star_line[3] = "*****";
		
		for(int j=N/2+1 ; j<=N ; j++) {
			star_line[j] = star_line[j-N/2] + " " + star_line[j-N/2];
		}
		
		for(int i=1 ; i<k ; i++) {
			k_check(i,N/2);
		}
		for(int i=1; i<star_line.length ; i++) {
			System.out.println(star_line);
		}
		return star_line;
	}
}
