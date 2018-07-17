package samsung.lets.get.it;


import java.util.ArrayList;
import java.util.Scanner;

public class num1865 {

	public static void main(String[] args) {
		//N : 직원수, 일의 갯
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		//직원
		
		ArrayList<int[]> staff = null;
		int[] work = null;
		int[] tmp = null;
		
		for(int t=0; t<T ; t++) {
			int N = sc.nextInt();
			staff = new ArrayList();
			tmp = new int[N];
			
			//tmp초기화
			for(int i=0; i<N; i++) {
				for(int j=0; j<N ; j++) {
					tmp[i] = -1;
				}
			}
				
			for(int i=0; i<N; i++) {
				work = new int[N];
				for(int j=0; j<N; j++) {
					work[j] = sc.nextInt();
					if(work[j]==0)
						tmp[i] = 0;
				}
				staff.add(work);
			}
			while(true) {
				for(int i=0; i<N; i++) {
					//우선선택
					if(tmp[i]==0) {
						staff.get(i)
					}
				}
				
				for(int i=0; i<N; i++) {
					if(tmp[i]!=0||tmp[i]!=-1)
						break;
				}
			}
			
		}
		
		
	}
	public static int max(int N, int[] work) {
		int max=0;
		for(int i=0; i<work.length; i++) {
			if(max>work[i])
				max = work[i];
		}
		return max;
		
	}
}

