package gmail.hotjoong.step5;

import java.util.ArrayList;

public class num4673 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for(int i=1; i<=10000; i++) {
			numbers.add(i);
		}
		for(int i=1; i<=10000; i++) {
			System.out.println(numbers.get(i));
		}
	}

}
