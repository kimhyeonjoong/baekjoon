package gmail.hotjoong.step7;

import java.util.Scanner;

public class num1157 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int alphabet_count[] = new int[26];
		for(int i=0; i<alphabet_count.length; i++)
			alphabet_count[i] = 0;
		for(int i=0; i<word.length(); i++) {
			if((int)word.charAt(i)-97>=0)  	// 소문자
				alphabet_count[(int)word.charAt(i)-97]++;
			else 							// 대문자
				alphabet_count[(int)word.charAt(i)-65]++;
		}
		int max=0;
		int index=0;
		int same_count=0;
		for(int i=0; i<alphabet_count.length; i++) {
			if(alphabet_count[i]>max) {
				max = alphabet_count[i];
				index=i;
			}
		}
		for(int i=0; i<alphabet_count.length; i++) {
			if(alphabet_count[i]==max) {
				same_count++;
			}
		}
		if(same_count==1)
			System.out.println((char)(index+65));
		else
			System.out.println("?");
		//A - 65 / a - 97
	}

}
