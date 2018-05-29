package gmail.hotjoong.step11;

import java.util.ArrayList;
import java.util.Scanner;

public class num2504 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bracket = sc.next();
		
		System.out.println(bracket_check(bracket));
	}

	private static String bracket_check(String bracket) {
		//올바른 괄호인지 검사
//		String bracket2 = bracket;
//		while(bracket2.contains("()")||bracket2.contains("[]")) {
//			bracket2 = bracket.replace("()", "");
//			bracket2 = bracket.replace("[]", "");
//			
//			//System.out.println("?");
//		}
//		
//		
//		
//		if(bracket2.length()!=0)
//			return "0"; //올바른 괄호가 아니면 0리턴
		
		//올바른 괄호 일때 괄호의 값 출력을 하자
		ArrayList<String> stack = new ArrayList();
		for(int i=0; i<bracket.length(); i++) {
			try {
			switch(bracket.charAt(i)) {
			case '(':
				stack.add(bracket.charAt(i)+"");
				break;
			case '[':
				stack.add(bracket.charAt(i)+"");
				break;
			case ')':
				if(stack.get(stack.size()-1).equals("(")){
					stack.remove(stack.size()-1);
					stack.add("2");
					//괄호안에 숫자가 두 개 일때 더하기 하자
				}else if(!stack.get(stack.size()-2).equals("(")||!stack.get(stack.size()-2).equals("[")){
					stack.add(Integer.parseInt((stack.get(stack.size()-2))+Integer.parseInt(stack.get(stack.size()-1)))*2+"");
				}else { // 괄호안에 숫자 하나일때
					stack.add(Integer.parseInt(stack.get(stack.size()-1))*2+"");
					stack.remove(stack.size()-2);
				}
				break;
			case ']':
				if(stack.get(stack.size()-1).equals("[")){
					stack.remove(stack.size()-1);
					stack.add("3");
				}else if(!stack.get(stack.size()-2).equals("(")||!stack.get(stack.size()-2).equals("[")){
					stack.add(Integer.parseInt((stack.get(stack.size()-2))+Integer.parseInt(stack.get(stack.size()-1)))*3+"");
				}else {
					stack.add(Integer.parseInt(stack.get(stack.size()-1))*3+"");
					stack.remove(stack.size()-2);
				}
				break;
			}
			}catch(Exception e) {
				continue;
			}
		}
		return stack.get(0);
	}
	

}
