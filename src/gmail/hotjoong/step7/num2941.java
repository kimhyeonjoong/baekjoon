package gmail.hotjoong.step7;

import java.util.Scanner;

public class num2941 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String alphabet = sc.nextLine();
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		int count=0;
		for(int i=0 ; i<croatia.length; i++) {
			if(alphabet.contains(croatia[i])){
				count++;
				alphabet = alphabet.replaceFirst(croatia[i], ",");
				i--;
			}
		}
		alphabet = alphabet.replace(",", "");
		System.out.println(count+alphabet.length());
		
	}

}
