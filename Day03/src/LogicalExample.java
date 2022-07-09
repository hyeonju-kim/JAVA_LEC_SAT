
public class LogicalExample {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 11;
		int c = 15;
		int d = 3;
		
		boolean result = a > b;
		result = result && c > d;  // result = false && true  -> false
		
		System.out.println(result);
		System.out.println((10>1));
		
		
		
	}

}
