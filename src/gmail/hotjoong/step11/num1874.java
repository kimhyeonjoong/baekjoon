package gmail.hotjoong.step11;

import java.util.ArrayList;
import java.util.Scanner;

public class num1874 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> record = new ArrayList();
		//먼저 1~n까지 수를 저장하는 리스트
		ArrayList<Integer> num = new ArrayList();
		//입력되는 숫자에 맞게끔 stack을 쌓는 리스트
		ArrayList<Integer> stack = new ArrayList();
		//pop되는 숫자를 저장하는 리스트
		ArrayList<Integer> result = new ArrayList();
		for(int i=0; i<n; i++)
			num.add(i+1);
		
		int next_num[] = new int[n];
		//첫번째 수를 받는다.
		next_num[0] = sc.nextInt();
		for(int i=1; i<n ; i++) {
			next_num[i] = sc.nextInt();
		}
		//first push and pop
		for(int j=0 ; j<next_num[0] ; j++) {
			stack.add(num.get(0));
			num.remove(0);
			record.add("+");
		}
		result.add(next_num[0]);
		stack.remove(stack.size()-1);
		record.add("-");
		//first push and pop
		
		int num_list;
		//next push and pop
		for(int i=1; i<n ; i++) {
			//pop
			if(num.size()==0||next_num[i]<result.get(result.size()-1)) {
				result.add(stack.get(stack.size()-1));
				stack.remove(stack.size()-1);
				record.add("-");
			//push and pop
			}else {
				while(num.get(0)<=next_num[i]){
					stack.add(num.get(0));
					num.remove(0);
					record.add("+");
					if(num.size()==0)
						break;
				}
				result.add(stack.get(stack.size()-1));
				stack.remove(stack.size()-1);
				record.add("-");
			}
		}
		boolean b=true;
		for(int i=0; i<n; i++) {
			if(result.get(i)!=next_num[i]) {
				System.out.println("NO");
				b = false;
				break;
			}
		}
		if(b) {
			for(int j=0; j<record.size(); j++)
				System.out.println(record.get(j));
		}
			
	}
}
