package gmail.hotjoong.step3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class num15552 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		int T=0;
		try {
			T = br.read();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		int[] result = new int[T];
		int A = 0,B = 0;
		
		for(int i=0;  i<T ; i++) {
			try {
				String in = br.readLine();
				bw.write(in); 
				bw.flush(); 
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		
		
	}

}
