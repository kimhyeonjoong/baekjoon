package gmail.hotjoong.step3;

import java.util.Scanner;

public class num11721 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		String str_line = "";
		for(int i=0; i<number.length() ; i++) {
			str_line += number.charAt(i);
			if((i+1)%10==0) {
				System.out.println(str_line);
				str_line = "";
			}
		}
		System.out.println(str_line);
		
	}

}
