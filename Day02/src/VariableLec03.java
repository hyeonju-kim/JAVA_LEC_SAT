
public class VariableLec03 {

	public static void main(String args[]) {
		
		//--선언과 동시에 초기화
		int a = 10;
		char b = 20;
		short c = 100;
		long d = 1000;
		
		//--선언과 초기화를 별도로
		int aa;
		char bb;
		short cc;
		long dd;
		
		aa = 10;
		bb = 20;
		cc = 100;
		dd = 1000;
		
		//--선언의방식2
		int aaaa, bbbb, cccc, dddd;
		aaaa = 20;
		System.out.println(aaaa);
		
		
		byte testCharLength;
		//testCharLength = 128; //127까지니까 에러
		
		testCharLength = 127;
		testCharLength ++; // testCharLength = testCharLength + 1  127까지 넣고 임의로 1을 더했을때 한바퀴돌아서 -128이 출력
		
		System.out.println(testCharLength);
	}
}
