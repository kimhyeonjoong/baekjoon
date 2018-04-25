	package gmail.hotjoong.step4;
	
	import java.text.DecimalFormat;
	import java.util.Scanner;
	
	public class num4344 {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int C = sc.nextInt();
			int N = 0;
			double result[] = new double[C];
			double sum = 0, avg=0;
			int count=0;
			DecimalFormat df = new DecimalFormat("0.000"); 
			for(int i=0; i<C ; i++) {
				N = sc.nextInt();
				double score[] = new double[N];
				sum=0;
				count=0;
				for(int j=0; j<N ; j++) {
					score[j] = sc.nextDouble();
					sum += score[j];
				}
				avg=sum/(double)N;
				
				for(int k=0; k<N ; k++) {
					if(score[k] > avg) {
						count++;
					}
				}
				result[i] = count/(double)N*100;
			}
			for (int i = 0; i < C; i++) {
				System.out.println(df.format(Math.round(result[i]*1000.0)/1000.0)+"%");
			}
		}
	
	}
