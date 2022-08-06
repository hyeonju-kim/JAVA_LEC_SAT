//p.310~
public class StringFormatExample {
	
	public static void main(String[] args) {
		//김현주, 만세 점수는 a점입니다.
		//1. 덧셈연산자사용!
		int a = 100;
		int b = 40;
		String message = "김현주, 만세 점수는" + a + "점 입니다."; //메모리낭비 심해서 format을 사용하자!! 메모리가 3개 생성됨;
		System.out.println(message);
		//이 방법은 "김현주", "만세", "김현주만세" 총 3개의 객체생성!!
		
		//2. format사용하면 메모리절약가능!!! format을 만들어놓고 그 부분만 갈아끼우는방식(replace)!!! 다국어?작업할때 많이 사용
		String message2 = "%s, 만세 점수는 %d점 입니다."; //%d(데시멀? 십진수라는뜻)는 숫자임 , %s 는 String
		//message2 = String.format(message2,"모모", a);
		message2 = String.format(message2,"나나", b);
		message2 = String.format(message2,"미미", a);
		System.out.println(message2);
	
		
		//p.319~  StringBuffer. String같은 문자열클래스. 변경이 가능한 문자열 객체. 불변이 아님. +말고 이 방법을 사용하면 예쁨받음ㅋ
		StringBuffer sb = new StringBuffer("김현주 ");
		sb.append("만세"); // 우와 메모리의 재생산없이 그냥 붙여준당~~!!!ㅎㅎ
		System.out.println(sb);
		//"김현주","만세"(객체2개생성) -> "김현주 만세"
	}
	
	
	
	

}
