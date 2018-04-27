package gmail.hotjoong.step6;

import java.util.Scanner;

public class num2920 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dajangjo[] = new int[8]; 
		for(int i=0; i<8 ; i++) {
			dajangjo[i] = sc.nextInt();
		}
		int count=0;
		if(dajangjo[0]==1) {
			for(int i=0; i<8 ; i++) {
				if(dajangjo[i]==i+1) 
					count++;
				else
					count=0;
				}
			if(count==8)
				System.out.println("ascending");
			else
				System.out.println("mixed");
			return;
		}else if(dajangjo[0]==8) {
			for(int i=8; i>0 ; i--) {
				if(dajangjo[8-i]==i)
					count++;
				else
					count=0;
			}
			if(count==8)
				System.out.println("descending");
			else
				System.out.println("mixed");
			return;
		}else
			System.out.println("mixed");
			
	}

}
