package gmail.hotjoong.step6;

import java.util.Scanner;

public class num10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] students = new int[5];
		int sum=0;
		for(int i=0; i<5 ; i++) {
			students[i] = sc.nextInt();
			if(students[i]<40)
				students[i] = 40;
			sum+=students[i];
		}
		System.out.println(sum/5);
	}

}
