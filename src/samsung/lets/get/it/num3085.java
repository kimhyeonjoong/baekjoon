package samsung.lets.get.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class num3085 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = "";
		line = br.readLine();
		int N = Integer.parseInt(line);
		
		String[][] candybox = new String[N][N];
		for(int i=0; i<N; i++) {
			line = br.readLine();
			for(int j=0; j<N; j++) {
				candybox[i][j] = Character.toString(line.charAt(j));
			}
		}
		int max=0;
		String tmp="";
		for(int i=0; i<N; i++) {
			for(int j=0; j<N-1; j++) {
					tmp = candybox[i][j];
					candybox[i][j] = candybox[i][j+1];
					candybox[i][j+1] = tmp;
					
					if(max<check(candybox)) {
						max = check(candybox);
					}
					tmp = candybox[i][j];
					candybox[i][j] = candybox[i][j+1];
					candybox[i][j+1] = tmp;
				
					tmp = candybox[j][i];
					candybox[j][i] = candybox[j+1][i];
					candybox[j+1][i] = tmp;
					if(max<check(candybox)) {
						max = check(candybox);
					}
					tmp = candybox[j][i];
					candybox[j][i] = candybox[j+1][i];
					candybox[j+1][i] = tmp;
				
				
			}
		}
		System.out.println(max);
	}
	
	public static int check(String[][] candybox) {
		int max=0;
		int count=1;
		int count2=1;
		for(int i=0; i<candybox.length; i++) {
			for(int j=0; j<candybox.length-1; j++) {
				if(candybox[j][i].equals(candybox[j+1][i])) {
					count++;
				}else
					count=1;
				
				if(candybox[i][j].equals(candybox[i][j+1])) {
					count2++;
				}else
					count2=1;
			}
			if(count>max)
				max = count;
			if(count2>max)
				max = count2;
			count=1;
			count2=1;
			
		}
		
		return max;
	}
}
