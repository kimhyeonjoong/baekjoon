package gmail.hotjoong.step11;

import java.util.ArrayList;
import java.util.Scanner;

public class num1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//먼저 1~n까지 수를 저장하는 리스트
		ArrayList<Integer> num = new ArrayList();
		//입력되는 숫자에 맞게끔 stack을 쌓는 리스트
		ArrayList<Integer> stack = new ArrayList();
		//pop되는 숫자를 저장하는 리스트
		ArrayList<Integer> result = new ArrayList();
		for(int i=0; i<n; i++)
			num.add(i+1);
		//첫번째 수를 받는다.
		int first =sc.nextInt();
		//first push
		for(int j=0 ; j<first ; j++) {
			stack.add(num.get(0));
			num.remove(0);
			System.out.println("+");
		}
		
		//first pop
		result.add(first);
		stack.remove(stack.size()-1);
		System.out.println("-");
		
		int num_list;
		//next push and pop
		for(int i=0; num.size()==0 ; i++) {
			
			num_list = sc.nextInt();
			//pop
			if(num_list<result.get(result.size()-1)) {
				result.add(stack.get(stack.size()-1));
				stack.remove(stack.size()-1);
				System.out.println("-");
			//push
			}else {
				do{
					stack.add(num.get(0));
					num.remove(0);
					System.out.println("num_size : " + num.size());
					System.out.println("+");
				}while(num.get(0)<=num_list);
				result.add(stack.get(stack.size()-1));
				stack.remove(stack.size()-1);
				System.out.println("-");
			}
			
		}
		System.out.println("???");
		for(int i=0; i<stack.size(); i++) {
			result.add(stack.get(stack.size()-1));
			stack.remove(stack.size()-1);
			System.out.println("-");
		}
			
		
	}

}
