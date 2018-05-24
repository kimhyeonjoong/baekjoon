package gmail.hotjoong.step10;

import java.util.Scanner;

public class num1929 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		if(M==1) {
			M=2;
		}
		
		int N = sc.nextInt();
		
		int[] number = new int[N-M+1];
		for(int i=0; i<number.length; i++) {
			number[i] = M+i;
		}
		
		int count=2;
		for(int i=0; i<number.length/2+1; i++) {
				while((i+2)*count-M<number.length) {
					if((i+2)*count-M>=0)
						number[(i+2)*count-M] = 0;
					count++;
				}
			count=2;
	 	}
		
		for(int temp : number)
			if(temp!=0)
				System.out.println(temp);
	}

}
