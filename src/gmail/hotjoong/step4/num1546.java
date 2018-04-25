package gmail.hotjoong.step4;

import java.text.DecimalFormat;
import java.util.Scanner;

public class num1546 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("###.00");
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double list[] = new double[N];
		double temp=0;
		double sum = 0;
		for(int i=0; i<N ; i++)
			list[i] = sc.nextInt();
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 0; j < list.length - 1 - i; j++) {
				if (list[j] > list[j + 1]) {
					temp = list[j + 1];
					list[j + 1] = list[j];
					list[j] = temp;
				}
			}
		}
		for(int i=0; i<list.length; i++) {
			sum += list[i]/list[list.length-1]*100;
		}
		double avg = sum/(double)N; 
		String number = df.format(avg);
		System.out.println(number);

	}

}
