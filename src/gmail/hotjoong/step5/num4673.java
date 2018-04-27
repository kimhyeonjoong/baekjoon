package gmail.hotjoong.step5;

import java.util.ArrayList;

public class num4673 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		int d=0;
		
		for(int i=1; i<=10000; i++) {
			numbers.add(i);
		}
		int count=0;
		
		while(count<=10000) {
			count++;
			if(count<10)
				d=count+count%10;
			else if(count<100)
				d=count+count/10 + count%10;
			else if(count<1000) {
				d=count+count/100+(count%100)/10+count%10;
			}else if(count<10000) {
				d=count+count/1000+(count%1000)/100+(count%100)/10+count%10;
			}
			try {
			numbers.remove(numbers.indexOf(d));
			}catch(Exception e) {
				
			}
		}
		
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
	}

}
