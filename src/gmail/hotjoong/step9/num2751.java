package gmail.hotjoong.step9;

import java.util.Scanner;

public class num2751 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array = new int[N];
		for(int i=0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		
		for(int t : sort(array , 0 , array.length-1))
    			System.out.println(t);
	}
	public static int[] sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
        
        return data;
    }

}
