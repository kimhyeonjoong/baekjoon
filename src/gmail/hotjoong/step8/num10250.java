package gmail.hotjoong.step8;

import java.util.Scanner;

public class num10250 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] H = new int[T];
		int[] W = new int[T];
		int[] N = new int[T];
		String[] result = new String[T];
		for(int t=0; t<T; t++) {
			H[t] = sc.nextInt();
			W[t] = sc.nextInt();
			N[t] = sc.nextInt();
			if(N[t]==1) {
				result[t] = "101";
				continue;
			}
			if(H[t]==1) {
				if(N[t]>10)
					result[t] = "1" + N[t];
				else
					result[t] = "10" + N[t];
				continue;
			}
			if(N[t]%H[t]==0) {
				result[t] = H[t] + "";
				if(N[t]/H[t]>10)
					result[t] += (N[t]/H[t]) + "";
				else
					result[t] += "0" + (N[t]/H[t]);
			}
			else {
				result[t] = N[t]%H[t] + "";
				if(N[t]/H[t]>10)
					result[t] += (N[t]/H[t]) + "";
				else
					result[t] += "0" + (N[t]/H[t]+1);
			}
			
		}
		for(String temp : result)
			System.out.println(temp);
			
	}

}
