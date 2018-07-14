package samsung.lets.get.it;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class num9328 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String Line=br.readLine();
		int T = Integer.parseInt(Line);
		int[] result = new int[T];
		for(int t=0; t<T; t++) {
			Line=br.readLine();
			String[] hw = Line.split(" ");
			int h = Integer.parseInt(hw[0]);
			int w = Integer.parseInt(hw[1]);
			String[][] hXw = new String[h][w];
			int count=0;
			
			ArrayList<String> keylist = new ArrayList();
			
			for(int i=0; i<h; i++) {
				Line = br.readLine();
				for(int j=0; j<w; j++) {
					hXw[i][j] = Character.toString(Line.charAt(j));
					if(hXw[i][j].equals(".")) {
						if(i==0||i==h-1||j==0||j==w-1)
							hXw[i][j] = "#";
					}
				}
			}
			
			Line=br.readLine();
			
			for(int i=0; i<Line.length(); i++) {
				keylist.add(Character.toString(Line.charAt(i)));
			}
			
			while(true){
				count=0;
				//1
				for(int i=0; i<h; i++) {
					for(int j=0; j<w; j++) {
						if(hXw[i][j].equals("#")) {
							//상하좌우
							if(check(h,w,i-1,j))
								if(hXw[i-1][j].equals(".")) {
									hXw[i-1][j] = "#";
									count++;
								}
							if(check(h,w,i+1,j))
								if(hXw[i+1][j].equals(".")) {
									hXw[i+1][j] = "#";
									count++;
								}
							if(check(h,w,i,j-1))
								if(hXw[i][j-1].equals(".")) {
									hXw[i][j-1] = "#";
									count++;
								}
							if(check(h,w,i,j+1))
								if(hXw[i][j+1].equals(".")) {
									hXw[i][j+1] = "#";
									count++;
								}
						}else if(i==0||i==h-1||j==0||j==w-1) {
							//문이 있을때 키가 있으면
							if((int)hXw[i][j].charAt(0)>=65&&(int)hXw[i][j].charAt(0)<=90) {
								if(keylist.contains(Character.toString((char)((int)hXw[i][j].charAt(0)+32)))) {
									hXw[i][j] = "#";
									count++;
								}
							}
							if((int)hXw[i][j].charAt(0)>=97&&(int)hXw[i][j].charAt(0)<=122) {
								keylist.add(hXw[i][j]);
								hXw[i][j] = "#";
								count++;
							}
							if(hXw[i][j].equals("$")) {
								hXw[i][j] = "#";
								result[t]++;
								count++;
							}
						}
					}
				}
				
				//2
				for(int i=0; i<h; i++) {
					for(int j=0; j<w; j++) {
						if(hXw[i][j].equals("#")) {
							//상하좌우
							//상 
							if(check(h,w,i-1,j))
								//위에 문이 있으면
								if((int)hXw[i-1][j].charAt(0)>=65&&(int)hXw[i-1][j].charAt(0)<=90) {
									//문이 있을때 키가 있으면
									if(keylist.contains(Character.toString((char)((int)hXw[i-1][j].charAt(0)+32)))) {
										hXw[i-1][j] = "#";
										count++;
									}
								//위에 키가 있으면
								}else if((int)hXw[i-1][j].charAt(0)>=97&&(int)hXw[i-1][j].charAt(0)<=122) {
									keylist.add(hXw[i-1][j]);
									hXw[i-1][j] = "#";
									count++;
								}else if(hXw[i-1][j].equals("$")) {
									hXw[i-1][j] = "#";
									count++;
									result[t]++;
								}
							//하 
							if(check(h,w,i+1,j))
								if((int)hXw[i+1][j].charAt(0)>=65&&(int)hXw[i+1][j].charAt(0)<=90) {
									if(keylist.contains(Character.toString((char)((int)hXw[i+1][j].charAt(0)+32)))) {
										hXw[i+1][j] = "#";
										count++;
									}
								}else if((int)hXw[i+1][j].charAt(0)>=97&&(int)hXw[i+1][j].charAt(0)<=122) {
									keylist.add(hXw[i+1][j]);
									hXw[i+1][j] = "#";
									count++;
								}else if(hXw[i+1][j].equals("$")) {
									hXw[i+1][j] = "#";
									count++;
									result[t]++;
								}
							//좌
							if(check(h,w,i,j-1))
								if((int)hXw[i][j-1].charAt(0)>=65&&(int)hXw[i][j-1].charAt(0)<=90) {
									if(keylist.contains(Character.toString((char)((int)hXw[i][j-1].charAt(0)+32)))) {
										hXw[i][j-1] = "#";
										count++;
									}
								}else if((int)hXw[i][j-1].charAt(0)>=97&&(int)hXw[i][j-1].charAt(0)<=122) {
									keylist.add(hXw[i][j-1]);
									hXw[i][j-1] = "#";
									count++;
								}else if(hXw[i][j-1].equals("$")) {
									hXw[i][j-1] = "#";
									count++;
									result[t]++;
								}
							
							//우
							if(check(h,w,i,j+1))
								if((int)hXw[i][j+1].charAt(0)>=65&&(int)hXw[i][j+1].charAt(0)<=90) {
									if(keylist.contains(Character.toString((char)((int)hXw[i][j+1].charAt(0)+32)))) {
										hXw[i][j+1] = "#";
										count++;
									}
								}else if((int)hXw[i][j+1].charAt(0)>=97&&(int)hXw[i][j+1].charAt(0)<=122) {
									keylist.add(hXw[i][j+1]);
									hXw[i][j+1] = "#";
									count++;
								}else if(hXw[i][j+1].equals("$")) {
									hXw[i][j+1] = "#";
									count++;
									result[t]++;
								}
						}
					}
				}
//				for(int i=0; i<h; i++) {
//					for(int j=0; j<w; j++) {
//						System.out.print(hXw[i][j]);
//					}
//					System.out.println();
//				}
//				
//				for(int i=0; i<keylist.size(); i++) {
//					System.out.println(keylist.get(i));
//				}
				if(count==0)
					break;
			}
		}
		
		
		
		
		
		for(int i=0; i<T; i++)
			System.out.println(result[i]);
	}
	public static boolean check(int h, int w, int x, int y) {
		if(0<=x&&x<h)
			if(0<=y&&y<w)
				return true;
			
		return false;
	}

}
