package gmail.hotjoong.step1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num11718 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0; i<100; i++) {
			try {
				String str= br.readLine();
				if(str==null || str.equals("")) {
					break;
				}else {
					sb.append(str+"\n");
				}
			} catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		System.out.println(sb);
	}
}
