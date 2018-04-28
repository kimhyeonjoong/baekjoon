package gmail.hotjoong.step7;

import java.util.Scanner;

public class num10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		//a-97
		int alphabet_count[] = new int[26];
		for(int i=0; i<alphabet_count.length ; i++){
			alphabet_count[i]=-1;
		}
		for(int i=0; i<word.length() ; i++) {
			if(alphabet_count[(int)word.charAt(i)-97]==-1)
				alphabet_count[(int)word.charAt(i)-97]=i;
		}
		for(int i=0; i<alphabet_count.length ; i++){
			System.out.print(alphabet_count[i]+" ");
		}
		
	}

}
