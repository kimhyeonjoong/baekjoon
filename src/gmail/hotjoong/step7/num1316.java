package gmail.hotjoong.step7;

import java.util.Scanner;

public class num1316 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String[] words = new String[N];
		int result = 0;
		for(int i=0 ; i<N ; i++) {
			words[i] = sc.next();
		}
		
		int alphabet_count[] = new int[26];
		
		
		for(int i=0 ; i<N ; i++) {
			for(int c=0; c<alphabet_count.length ; c++){
				alphabet_count[c]=0;
			}
			for(int j=0; j<words[i].length()-1 ;j++) {
				if(words[i].charAt(j)!=words[i].charAt(j+1))
					alphabet_count[(int)words[i].charAt(j)-97]++;
			}
			alphabet_count[(int)words[i].charAt(words[i].length()-1)-97]++;
			boolean count=true;
			for(int k=0; k<alphabet_count.length ; k++){
				if(alphabet_count[k]>=2){
					count=false;
				}
			}
			if(count)
				result++;
		}
		System.out.println(result);
	}

}
