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
		
		int c, max, remainder;
		for(int i=0; i<T; i++) {
			c=0;
			max=0;
			remainder = 0;
			while(true){
				c++;
				if(distance[i]<Math.pow(c, 2)) {
					max = c-1;
					break;
				}
			}
			for(int j=0; j<max; j++) {
				route[i]+=j+1;
			}
			route[i]+=route[i]-max;
			remainder = distance[i] - route[i];
			
			int temp=0;
			int max_temp=0,route_temp=0;
			temp=remainder;
			max_temp=max;
			while(true) {
				if(temp%max_temp==0) {
					route[i]+=temp/max_temp + route_temp;
					break;
				}else if(temp>max_temp) {
					route_temp+=temp/max_temp;
					temp%=max_temp;
					max_temp--;
				}else {
					route_temp = 0;
					temp=remainder;
					max_temp--;
				}
			}
		}
		for(int temp:distance)
			System.out.println(temp); 
	}

}
