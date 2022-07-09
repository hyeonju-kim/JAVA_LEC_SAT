
public class BinaryExample {
	public static void main(String[] args) {
		
		int x = 2;
		// 2를 2진수로 바꾸면? 10
		int y = 3;
		System.out.println(x & y);  //이게 왜 2가 나오지? 2 & 3인데????????????? 
		// x를 2진수로 바꾸면 0010 (자동으로 2진수로 바꿔주는듯????????)
		// y를 2진수로 바꾸면 0011
		// x & y = 자리수대로 비교를 하면 0010이되고 --> 10진수로 다시 바꿔주면 2 가 나옴!!!!!!!!!!!
		// x | y = 자리수대로 비교를 하면 0011이되고 --> 10진수로 다시 바꿔주면 3 이 나옴!!!!!!!!!!
		// x ^ y = 자리수대로 비교를 하면 0001이되고 --> 10진수로 다시 바꿔주면 1 이 나옴!!!!!!!!!!
		System.out.println(x | y);
		System.out.println(x ^ y);
		
		System.out.println(Integer.toBinaryString(x));
		
		
	}
}
