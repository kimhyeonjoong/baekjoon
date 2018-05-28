package gmail.hotjoong.step11;

import java.util.Scanner;

public class num2504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bracket = sc.next();
		int result=-1;
		
		
		System.out.println(bracket_check(bracket));
	}

	private static int bracket_check(String bracket) {
		//올바른 괄호인지 검
		String bracket2 = bracket;
		while(bracket2.contains("()")||bracket2.contains("[]")) {
			bracket2 = bracket.replace("()", "");
			bracket2 = bracket.replace("[]", "");
		}
		if(bracket2.length()!=0)
			return 0; //올바른 괄호가 아니면 0리턴
		
		while(bracket.contains("()")||bracket.contains("[]")) {
			bracket.replace("()", "2");
			bracket.replace("()", "3");
		}
		while(bracket.contains("(")||bracket.contains(")")||bracket.contains("[")||bracket.contains("]")) {
			
		}
		
		
		
		
		
		return 0;
	}
	

}
