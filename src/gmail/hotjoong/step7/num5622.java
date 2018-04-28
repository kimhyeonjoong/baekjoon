package gmail.hotjoong.step7;

import java.util.Scanner;

public class num5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String call = sc.next();
		int sum=0;
		//A-65, D-68, G-71, J-74, M-77, P-80, T-84, W-87, Z-90
		for(int i=0; i<call.length(); i++) {
			if(call.charAt(i)<68){
				sum+=3;
			}else if(call.charAt(i)<71){
				sum+=4;
			}else if(call.charAt(i)<74){
				sum+=5;
			}else if(call.charAt(i)<77){
				sum+=6;
			}else if(call.charAt(i)<80){
				sum+=7;
			}else if(call.charAt(i)<84){
				sum+=8;
			}else if(call.charAt(i)<87){
				sum+=9;
			}else
				sum+=10;
		}
		System.out.println(sum);
	}

}
