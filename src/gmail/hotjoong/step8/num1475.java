package gmail.hotjoong.step8;

import java.util.Scanner;

public class num1475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		int[] set = new int[10]; 
		boolean half=true;
		while(N.contains("6")) {
			if(half) {
				set[6]++;
				half = false;
			}else
				half = true;
			N = N.replaceFirst("6", "");
		}
		while(N.contains("9")) {
			if(half) {
				set[6]++;
				half = false;
			}else
				half = true;
			N = N.replaceFirst("9", "");
		}
		for(int i=0; i<=8; i++) {
			while(N.contains(""+ i + "")) {
				N = N.replaceFirst(""+i+"", "");
				set[i]++;
			}
		}
		int max=0;
		for(int j=0; j<10; j++) {
			if(max<set[j])
				max = set[j];
		}
		
		System.out.println(max);
		
	}

}
