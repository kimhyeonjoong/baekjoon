package samsung.lets.get.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num14500 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Line = br.readLine();
		String[] NM = Line.split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		
		int[][] NxM = new int[N][M];
		
		for(int i=0; i<N; i++) {
			Line = br.readLine();
			for(int j=0; j<M; j++) {
				NxM[i][j] = Integer.parseInt(Character.toString(Line.charAt(j*2)));
			}
		}
		
	}

}
