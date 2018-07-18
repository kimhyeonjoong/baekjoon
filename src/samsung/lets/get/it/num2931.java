package samsung.lets.get.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//가스관
public class num2931 {
	static int result_x=0;
	static int result_y=0;
	static String result_pipe = "";
	static int[][] map = null;
	static int[] hidden_pipe = {0,0,0,0}; 
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] RC = line.split(" ");
		int R = Integer.parseInt(RC[0]);
		int C = Integer.parseInt(RC[1]);
		
		map = new int[R][C];
		
		
		
		for(int i=0; i<R; i++) {
			line = br.readLine();
			for(int j=0; j<C; j++) {
				switch(line.charAt(j)){
				case '.':
					map[i][j] = -1;
					break;
				case '+':
					map[i][j] = 0;
					break;
				case '1':
					map[i][j] = 1;
					break;
				case '2':
					map[i][j] = 2;
					break;
				case '3':
					map[i][j] = 3;
					break;
				case '4':
					map[i][j] = 4;
					break;
				case '|':
					map[i][j] = 5;
					break;
				case '-':
					map[i][j] = 6;
					break;
				default :
					map[i][j] = 7;
					break;
				}
			}
		}
		
		
		int[] num = new int[4];
		 
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				switch(map[i][j]) {
				case 0:
					num[0]=1;num[1]=1;num[2]=1;num[3]=1;
					check(i,j, num);
					break;
				case 1:
					num[0]=0;num[1]=1;num[2]=1;num[3]=0;
					check(i,j, num);
					break;
				case 2:
					num[0]=1;num[1]=1;num[2]=0;num[3]=0;
					check(i,j, num);
					break;
				case 3:
					num[0]=1;num[1]=0;num[2]=0;num[3]=1;
					check(i,j, num);
					break;
				case 4:
					num[0]=0;num[1]=0;num[2]=1;num[3]=1;
					check(i,j, num);
					break;
				case 5:
					num[0]=1;num[1]=0;num[2]=1;num[3]=0;
					check(i,j, num);
					break;
				case 6:
					num[0]=0;num[1]=1;num[2]=0;num[3]=1;
					check(i,j, num);
					break;
				}
			}
		}
		int[][] check_pipe = new int[][] {{1,1,1,1},{0,1,1,0},{1,1,0,0},{1,0,0,1},{0,0,1,1,},{1,0,1,0},{0,1,0,1}};
		int count = 0;
		for(int i=0;i<7;i++) {
			count=0;
			for(int j=0; j<4; j++) {
				if(hidden_pipe[j]==check_pipe[i][j]) {
					count++;
				}
			}
			if(count==4) {
				if(i==0)
					result_pipe = "+";
				else if(i==5)
					result_pipe = "|";
				else if(i==6)
					result_pipe = "-";
				else
					result_pipe = i+"";
			}
		}
		
		System.out.println((result_x+1)+" "+(result_y+1)+" "+result_pipe);
		
	}
	
	
	
	public static void check(int x,int y, int[] num) {
		for(int i=0; i<4; i++) {
			if(num[i]==1) {
				switch(i) {
				case 0:
					if(map[x-1][y]<0) {
						hidden_pipe[2] = 1;
						result_x = x-1;
						result_y = y;
					}
					break;
				case 1:
					if(map[x][y+1]<0) {
						hidden_pipe[3] = 1;
						result_x = x;
						result_y = y+1;
					}
					break;
				case 2:
					if(map[x+1][y]<0) {
						hidden_pipe[0] = 1;
						result_x = x+1;
						result_y = y;
					}
					break;
				case 3:
					if(map[x][y-1]<0) {
						hidden_pipe[1] = 1;
						result_x = x;
						result_y = y-1;
					}
					break;
				}
			}
		}
	}
}
