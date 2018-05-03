package gmail.hotjoong.step9;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class num10989 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int array[] = new int[N];
		int max=-1;
		for(int i=0; i<N; i++) {
			array[i] = sc.nextInt();
			if(max<array[i])
				max = array[i];
		}
		int count[] = new int[max+1];
		int result[] = new int[N];
		for(int i=0; i<max; i++)
			count[i] = 0; 
		for(int i=0; i<N; i++)
			count[array[i]]++; 
		for(int i=0; i<max; i++)
			count[i+1] += count[i];
		for(int i=N-1; 0<=i; i--) {
			result[count[array[i]]-1] = array[i];
			count[array[i]]--;
		}
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for (int i : result) 
		{
			bw.write(i + "\n");
		}
		bw.flush();
		
		
	}

}
