package gmail.hotjoong.step10;

import java.util.ArrayList;
import java.util.Scanner;

public class num4948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList();
		do{
			list.add(sc.nextInt());  
		}while(list.get(list.size()-1)!=0);
		list.remove(list.size()-1);
		for(int i=0 ; i<list.size(); i++)
			System.out.println(sosu_count(list.get(i)));
	}

	private static int sosu_count(int N) {
		if(N==1)
			return 1;
		int[] number = new int[N+1];
		for(int i=0; i<=N; i++) {
			number[i] = N+i;
		}
		number[0] = 0;
		int count=2;
		
		for(int i=0; i<3*N/2+1; i++) {
				while((i+2)*count-N<number.length) {
					if((i+2)*count-N>=0)
						number[(i+2)*count-N] = 0;
					count++;
				}
			count=2;
	 	}
		int result = 0; 
		for(int temp : number)
			if(temp!=0)
				result++;
		return result;
	}
	
}
