package gmail.hotjoong.step11;

import java.util.ArrayList;
import java.util.Scanner;

public class num9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		ArrayList<String> result = new ArrayList();
		String bracket;
		for(int i=0; i<T; i++) {
			bracket = sc.next();
			while(bracket.contains("()")) {
				bracket = bracket.replace("()", "");
			}
			if(bracket.length()==0)
				result.add("YES");
			else
				result.add("NO");
		}
		for(String temp : result)
			System.out.println(temp);
		
	}

}
