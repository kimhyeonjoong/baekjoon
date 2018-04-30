package gmail.hotjoong.step8;

import java.util.Scanner;

public class num1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int x,y;
		int[] distance = new int[T];
		int[] route = new int[T];
		for(int i=0; i<T; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			distance[i] = y-x;
			route[i] = 0;
		}
		
		int max, sub, except;
		
		for(int i=0; i<T; i++) {
			max=0;
			except = 0;
			while(true){
				max++;
				if(distance[i]<Math.pow(max, 2)) {
					break;
				}else if(distance[i]==Math.pow(max, 2)) {
					except = max;
					break;
				}
			}
			
			if(except>0) {
				route[i] = except*2 -1;
				continue;
			}else {
				sub = (int) Math.pow(max, 2) - distance[i] + 1;
				if(sub>max) {
					route[i] = max*2 -2;
					continue;
				}else {
					route[i] = max*2 -1;
					continue;
				}
			}
		}
		for(int temp : route) {
			System.out.println(temp);
		}
	}

}
