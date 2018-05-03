package gmail.hotjoong.step9;

import java.util.Scanner;

public class num2750 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		int temp;
		for(int j=0; j<N-1; j++)
			for(int k=j+1; k<N; k++)
				if(array[j] > array[k]) {
					temp = array[k];
					array[k] = array[j];
					array[j] = temp;
				}
		for(int temp_array:array)
			System.out.println(temp_array);
		
	}

}
