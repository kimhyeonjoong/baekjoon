package gmail.hotjoong.step4;

import java.util.Scanner;

public class num10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int list[] = new int[N];
		String result="";
		for(int i=0; i<N ; i++)
			list[i] = sc.nextInt();
		for(int i=0; i<N ; i++) {
			if(list[i]<X)
				result += list[i]+" ";
		}
		System.out.println(result);
	}

}
