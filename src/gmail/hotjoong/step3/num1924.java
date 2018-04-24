package gmail.hotjoong.step3;

import java.util.Scanner;

public class num1924 {

//	1, 3, 5, 7, 8, 10, 12 월은 31일까지, 
//	4, 6, 9, 11 월은 30일까지,
//	2 월은 28일까지 있다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month_day[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		int in_month = sc.nextInt();
		int in_day = sc.nextInt();
		
		int count_days=0;
		for(int i=0; i<in_month-1 ; i++) {
			count_days += month_day[i];
		}
		count_days += in_day;
		String week="";
		switch(count_days%7) {
		case 0:
			week="SUN";
			break;
		case 1:
			week="MON";
			break;
		case 2:
			week="TUE";
			break;
		case 3:
			week="WED";
			break;
		case 4:
			week="THU";
			break;
		case 5:
			week="FRI";
			break;
		case 6:
			week="SAT";
			break;
		}
		System.out.println(week);
	}

}
