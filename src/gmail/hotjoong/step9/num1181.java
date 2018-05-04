package gmail.hotjoong.step9;

import java.util.ArrayList;
import java.util.Scanner;

public class num1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<String> word_list = new ArrayList();
		String in;
		for(int i=0; i<N; i++) {
			in = sc.next();
			if(!word_list.contains(in))
				word_list.add(in);
		}
		for(int i=0; i<word_list.size(); i++) {
			System.out.println(word_list.get(i));
		}
		String temp="";
		for(int i=0; i<word_list.size()-1; i++) {
			for(int j=1; j<word_list.size()-1; j++)
				if((int)word_list.get(i).charAt(0) > (int)word_list.get(j).charAt(0)) {
					
				}
		}
		
		//a-97 z-122
		for(int i=0; i<word_list.size(); i++) {
			System.out.println(word_list.get(i));
		}
		
	}

}
