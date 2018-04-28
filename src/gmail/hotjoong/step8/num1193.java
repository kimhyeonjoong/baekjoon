package gmail.hotjoong.step8;

import java.util.Scanner;

public class num1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int H=1;
		int V=0;
		int m=0;
		while(true) {
			H++;
			V++;
			m++;
			V+=4*m-2;
			if(V>=X) {
				break;
			}
			H+=m*4;
			if(H>=X) {
				break;
			}
		}
		if(H>V)
			System.out.println(H-X+1 + "/" + (H/(m+1)-(H-X)));
		else
			System.out.println((V-m)/m-(V-X) + "/" + (V-X+1));
		
	}

}
