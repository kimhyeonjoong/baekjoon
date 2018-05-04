package gmail.hotjoong.step9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class num1427 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		ArrayList list = new ArrayList();
		for(int i=0; i<N.length(); i++)
			list.add(N.charAt(i));
		Collections.sort(list);
		String result="";
		for(int i=list.size()-1; i>=0 ; i--)
			result += list.get(i);
		System.out.println(result);
	}

}
