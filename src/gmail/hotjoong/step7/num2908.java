package gmail.hotjoong.step7;

import java.util.Scanner;

public class num2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int result = 0;
		
		if(A%10>B%10)
			result = A;
		else if(A%10<B%10)
			result = B;
		else {
			if(A%100>B%100)
				result = A;
			else if(A%100<B%100)
				result = B;
			else {
				if(A/100>B/100)
					result = A;
				else
					result = B;
			}
				
		}
		int result_ = result/100 + (result-result/100*100)/10*10 + result%10*100;
		System.out.println(result_);
			
	}
}
