/*
 * Switch문
 */
public class Condition2 {

	public static void main(String[] args) {
	
		int a = 8;
		
		switch(a) {
			case 5 :
				System.out.println("5입니다");
				break;
			case 10 :
				System.out.println("10입니다");
				break;
			default:
				System.out.println("맞는 숫자가 없습니다ㅠㅠ");
		}
		
		int b = 9;
		if(b == 5) {
			System.out.println("5입니다");
		}else if (b == 10) {
			System.out.println("10입니다");
		} else {
			System.out.println("맞는 숫자가 없습니다ㅠㅠ");
		}

		
	}

}
