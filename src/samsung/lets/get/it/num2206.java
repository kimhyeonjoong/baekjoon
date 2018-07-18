package samsung.lets.get.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num2206 {
	private static int[][] NxM = null;
	private static boolean break_chance = true;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] NM = line.split(" ");
		int N = Integer.parseInt(NM[0]);
		int M = Integer.parseInt(NM[1]);
		NxM = new int[N][M];
		int route=1;
		int min=1;
		
		for(int i=0; i<N; i++) {
			line = br.readLine();
			for(int j=0; j<M; j++) {
				NxM[i][j] = (int)line.charAt(j)-48;
			}
		}
		
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<M; j++) {
//				//상
//				if(check(i-1,j,N,M)) {
//					if(NxM[i-1][j]==0||NxM[i-1][j]==2)
//						
//				}
//				//하
//				if(check(i+1,j,N,M)) {
//				}
//				//좌
//				if(check(i,j-1,N,M)) {
//				}
//				//우
//				if(check(i,j+1,N,M)) {
//				}
//			}
		
		
		
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<M; j++) {
//				//상
//				if(check(i-1,j,N,M)) {
//					breakwall(i-1,j);
//				}
//				//하
//				if(check(i+1,j,N,M)) {
//					breakwall(i+1,j);
//				}
//				//좌
//				if(check(i,j-1,N,M)) {
//					breakwall(i,j-1);
//				}
//				//우
//				if(check(i,j+1,N,M)) {
//					breakwall(i,j+1);
//				}
//			}
//		}
		
		
		
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<M; j++) {
//				System.out.print(NxM[i][j]);  
//			}
//			System.out.println();
//		}
	}
	
	//IOException error방지를 위한 함수
	public static boolean check(int x, int y, int N, int M) {
		if(0<=x&&x<N)
			if(0<=y&&y<M)
				return true;
		return false;
	}
	//벽을 부시자
	public static void breakwall(int x, int y) {
		if(NxM[x][y]==1) {
			NxM[x][y] = 2;
			break_chance = false;
		}
	}
	//벽을 부신 후 길을 찾자 길이 없을땐 -1출력
	public static int findroute() {
		return 0;
	}
	

}
