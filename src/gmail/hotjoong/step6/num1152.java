package gmail.hotjoong.step6;

import java.util.Scanner;

public class num1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		if(words.length==1 && words[0].equals(""))
			System.out.println(0);
		else if(words.length>1 && words[0].equals("")){
			System.out.println(words.length-1);
		}else{
			System.out.println(words.length);
		}
	}
}