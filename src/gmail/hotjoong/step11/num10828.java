package gmail.hotjoong.step11;

import java.util.ArrayList;
import java.util.Scanner;

public class num10828 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> stack = new ArrayList();
		ArrayList<Integer> result = new ArrayList();
		int e_num = sc.nextInt();
		String input;
		for(int i=0; i<e_num; i++) {
			input = sc.next();
			if(input.equals("push"))
				stack.add(sc.nextInt());
			else {
				switch(input) {
				case "top" : 
					if(stack.size()==0)
						result.add(-1);
					else
						result.add(stack.get(stack.size()-1));
					break;
				case "size" :
					result.add(stack.size());
					break;
				case "empty" : 
					if(stack.size()==0)
						result.add(1);
					else
						result.add(0);
					break;
				case "pop" :
					if(stack.size()==0)
						result.add(-1);
					else {
						result.add(stack.get(stack.size()-1));
						stack.remove(stack.size()-1);
					}
					break;
				}
			}
		}
		for(int i=0; i<result.size(); i++)
			System.out.println(result.get(i));
	}

}
