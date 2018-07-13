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
			NM = Line.split(" ");
			for(int j=0; j<M; j++) {
				NxM[i][j] = Integer.parseInt(NM[j]);
			}
		}
		int sum=0;
		int max=0;
		
		//네모
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<M-1; j++) {
				sum = NxM[i][j] + NxM[i][j+1] + NxM[i+1][j] + NxM[i+1][j+1];
				if(max<sum)
					max = sum;
			}
		}
		//짝대기 가로
		for(int i=0; i<N ; i++) {
			for(int j=0; j<M-3; j++) {
				sum = NxM[i][j] + NxM[i][j+1] + NxM[i][j+2] + NxM[i][j+3];
				if(max<sum)
					max = sum;
			}
		}
		
		//짝대기 세로
		for(int i=0; i<N-3 ; i++) {
			for(int j=0; j<M; j++) {
				sum = NxM[i][j] + NxM[i+1][j] + NxM[i+2][j] + NxM[i+3][j];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㅗ자
		for(int i=0; i<N-1 ; i++) {
			for(int j=1; j<M-1; j++) {
				sum = NxM[i][j] + NxM[i+1][j-1] + NxM[i+1][j] + NxM[i+1][j+1];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㅜ자
		for(int i=0; i<N-1 ; i++) {
			for(int j=1; j<M-1; j++) {
				sum = NxM[i][j] + NxM[i][j-1] + NxM[i+1][j] + NxM[i][j+1];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㅏ자
		for(int i=0; i<N-2 ; i++) {
			for(int j=0; j<M-1; j++) {
				sum = NxM[i][j] + NxM[i+1][j] + NxM[i+1][j+1] + NxM[i+2][j];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㅓ자
		for(int i=0; i<N-2 ; i++) {
			for(int j=1; j<M; j++) {
				sum = NxM[i][j] + NxM[i+1][j-1] + NxM[i+1][j] + NxM[i+2][j];
				if(max<sum)
					max = sum;
			}
		}
		
		//지렁이 세로1
		for(int i=0; i<N-2 ; i++) {
			for(int j=0; j<M-1; j++) {
				sum = NxM[i][j] + NxM[i+1][j] + NxM[i+1][j+1] + NxM[i+2][j+1];
				if(max<sum)
					max = sum;
			}
		}
		
		//지렁이 세로2
		for(int i=0; i<N-2 ; i++) {
			for(int j=1; j<M; j++) {
				sum = NxM[i][j] + NxM[i+1][j] + NxM[i+1][j-1] + NxM[i+2][j-1];
				if(max<sum)
					max = sum;
			}
		}
		
		//지렁이 가로1
		for(int i=0; i<N-1 ; i++) {
			for(int j=0; j<M-2; j++) {
				sum = NxM[i][j] + NxM[i][j+1] + NxM[i+1][j+1] + NxM[i+1][j+2];
				if(max<sum)
					max = sum;
			}
		}
		
		//지렁이 가로2
		for(int i=0; i<N-1 ; i++) {
			for(int j=1; j<M-1; j++) {
				sum = NxM[i][j] + NxM[i][j+1] + NxM[i+1][j] + NxM[i+1][j-1];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㄴ자 가로
		for(int i=0; i<N-1 ; i++) {
			for(int j=0; j<M-2; j++) {
				sum = NxM[i][j] + NxM[i+1][j] + NxM[i+1][j+1] + NxM[i+1][j+2];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㄴ자 가로 대칭
		for(int i=0; i<N-1 ; i++) {
			for(int j=2; j<M; j++) {
				sum = NxM[i][j] + NxM[i+1][j] + NxM[i+1][j-1] + NxM[i+1][j-2];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㄱ자 가로
		for(int i=0; i<N-1 ; i++) {
			for(int j=0; j<M-2; j++) {
				sum = NxM[i][j] + NxM[i][j+1] + NxM[i][j+2] + NxM[i+1][j+2];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㄱ자 가로 대칭 
		for(int i=0; i<N-1 ; i++) {
			for(int j=0; j<M-2; j++) {
				sum = NxM[i][j] + NxM[i][j+1] + NxM[i][j+2] + NxM[i+1][j];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㄴ자 세로
		for(int i=0; i<N-2 ; i++) {
			for(int j=0; j<M-1; j++) {
				sum = NxM[i][j] + NxM[i+1][j] + NxM[i+2][j] + NxM[i+2][j+1];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㄴ자 세로 대칭
		for(int i=0; i<N-2 ; i++) {
			for(int j=1; j<M; j++) {
				sum = NxM[i][j] + NxM[i+1][j] + NxM[i+2][j] + NxM[i+2][j-1];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㄱ자 세로
		for(int i=0; i<N-2 ; i++) {
			for(int j=0; j<M-1; j++) {
				sum = NxM[i][j] + NxM[i][j+1] + NxM[i+1][j+1] + NxM[i+2][j+1];
				if(max<sum)
					max = sum;
			}
		}
		
		//ㄱ자 세로 대칭
		for(int i=0; i<N-2 ; i++) {
			for(int j=0; j<M-1; j++) {
				sum = NxM[i][j] + NxM[i][j+1] + NxM[i+1][j] + NxM[i+2][j];
				if(max<sum)
					max = sum;
			}
		}
		
		System.out.println(max);
		
	}

}
