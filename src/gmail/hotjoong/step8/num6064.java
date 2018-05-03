package gmail.hotjoong.step8;

import java.util.Scanner;

public class num6064 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int M,N,x,y,lcm;
		int result[] = new int[T];
		for(int i=0; i<T; i++) {
			M = sc.nextInt();
			N = sc.nextInt();
			lcm = lcm(M,N);
			int M_[] = new int[lcm/M];
			x = sc.nextInt();
			y = sc.nextInt();
			int N_ = y;
			
			for(int j=0; j<lcm/M+1 ; j++) {
				if(x + j*M <= lcm) {
					M_[j] = x + j*M;
					if((M_[j]-y)%N==0) {
						result[i] = M_[j];
						break;
					}
				}
			}
			
		}
		for(int temp_result : result)
			if(temp_result!=0)
				System.out.println(temp_result);
			else
				System.out.println(-1);
	}
	public static int gcd(int a, int b){
		while(b!=0){
			int r = a%b;
			a= b;
			b= r;
		}
		return a;
	}
	public static int lcm(int a, int b){
	    return a * b / gcd(a,b);
	}

}
