/* 
 * Type Casting (형변환)
 * 
 */
public class VariableCasting {
	
	//-- Java Application Starting Point
	public static void main(String[] args) {
		// 묵시적 형변환
		byte a = 127;
		short b = a; //short(2) > byte(1) short가 더 크니까 그냥 넣기가능!
		
		long c = 1000;
		float d = c; // 실수형은 무조건 정수형보다 크니까 이것도 문제안되지~~
		
		System.out.println("long to float : " + d); //long to float : 1000.0  <--이렇게 출력됨! 이런식으로 실수형으로 변환된거야
		
		
		// 명시적 형변환
		short aa = 127;
		byte bb = (byte)aa; //short이 16비트고 byte가 8비트이니까, short 의 상위 8비트를 강제로 잘라주는것
		System.out.println(bb); //127 출력됨
		
		
		aa = 128;
		bb = (byte)aa; // -128 이 출력됨 
		
		
		//교재 p55 6번문제. 실수->정수로 형변환을 하는 경우에는 소숫점이하 버림.
		double aaa = 3.141562;
		int bbb = (int)aaa;   // 소수점 아래는 다 잘라버림!!!
		System.out.println(bbb); // 3 출력됨
		
		System.out.println((int)'A'); //65 출력됨..  아스키코드나 유니코드에 1대1매칭되니까
		System.out.println((int)'B'); //66 출력됨
		
		long regNo = 9201252152618L; //주민번호는 13자린데 int는 10자리까지밖에안되니까 int는 안되겠지!! L을 뒤에안붙여주면 int가 기본형이기때문에 범위를 벗어나서 오류남ㅋㅋ
		System.out.println(regNo); 
		
		
		
	}
	
}
