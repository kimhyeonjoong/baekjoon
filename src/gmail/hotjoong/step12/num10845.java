package gmail.hotjoong.step12;

import java.util.ArrayList;
import java.util.Scanner;

public class num10845 {
//	push X: 정수 X를 큐에 넣는 연산이다.
//	pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	size: 큐에 들어있는 정수의 개수를 출력한다.
//	empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//	front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//	back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> que = new ArrayList();
		ArrayList<Integer> result = new ArrayList();
		String ex;
		for(int i=0; i<N; i++) {
			//push
			ex = sc.next();
			switch(ex) {
				case "push":
					que.add(sc.nextInt());
					break;
				case "pop":
					if(que.size()!=0) {
						result.add(que.get(0));
						que.remove(0);
					}else
						result.add(-1);
					break;
				case "size":
					result.add(que.size());
					break;
				case "empty":
					if(que.size()==0)
						result.add(1);
					else
						result.add(0);
					break;
				case "front":
					if(que.size()!=0) {
						result.add(que.get(0));
					}else
						result.add(-1);
					break;
				case "back":
					if(que.size()!=0) {
						result.add(que.get(que.size()-1));
					}else
						result.add(-1);
					break;
			}
			
		}
		for(int i=0; i<result.size(); i++)
			System.out.println(result.get(i));
	}

}
