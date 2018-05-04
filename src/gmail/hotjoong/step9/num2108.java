package gmail.hotjoong.step9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class num2108 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] number = new int[N];
		for(int i=0; i<N; i++)
			number[i] = sc.nextInt();
//		산술평균 : N개의 수들의 합을 N으로 나눈 값
		double sum=0;
		for(int sum_temp : number)
			sum += sum_temp;
		
		System.out.println(Math.round(sum/(double)N));
//		중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
		Arrays.sort(number);
		System.out.println(number[(N+1)/2-1]);
//		최빈값 : N개의 수들 중 가장 많이 나타나는 값
		System.out.println(countsort(number, N));
//		범위 : N개의 수들 중 최대값과 최소값의 차이
		System.out.println(number[N-1]-number[0]);
		
	}

	public static int countsort(int[] array, int N) {
		int[] count = new int[array[N-1]-array[0]+1];
		ArrayList result = new ArrayList();
		for(int count_temp : count)
			count_temp = 0;
		for(int i=0; i<array.length; i++) {
			count[array[i]-array[0]]++;
			
		}
		int max=-1;
		for(int i=0; i<count.length; i++) {
			if(max<count[i])
				max = count[i];
		}
		for(int i=0; i<count.length; i++) {
			if(max==count[i])
				result.add(i+array[0]);
		}
		 
		if(result.size()>=2) {
			Collections.sort(result);
			return (int) result.get(1);
		}else
			return (int) result.get(0);
	}
	
	
	

}
