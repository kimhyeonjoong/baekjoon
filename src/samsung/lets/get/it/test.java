package samsung.lets.get.it;

public class test {

	public static void main(String[] args) {
		String[][] a = new String[][]{{"1","2"}};
		String[][] b = new String[1][2];
//		aaa ddd = new aaa();
//		ddd.bb = a;
		b = a;
		System.out.println(a[0][0]);
		System.out.println(meso(b));
		System.out.println(a[0][0]);
	}
	public static int meso(String[][] aa) {
		String[][] tmp = new String[aa.length][aa.length];
		tmp = aa;
		tmp[0][0] = "0";
		return 0;
	}
	
}

class aaa{
	String[][] bb = null; 
}