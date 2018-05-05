package gmail.hotjoong.step9;

import java.util.ArrayList;
import java.util.Collections;
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
		
		Collections.sort(word_list);
		
		
		
		
		for(int i=0; i<word_list.size(); i++)
			for(int j=i+1; j<word_list.size(); j++)
				if(word_list.get(i).length() > word_list.get(j).length()) {
					word_list.add(i, word_list.get(j));
					word_list.remove(j+1);
				}
		for(int i=0; i<word_list.size(); i++)
			System.out.println(word_list.get(i));
	}
}
