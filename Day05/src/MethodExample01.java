/*
 * 메소드
 * 메소드는 절차지향언어에서는 "함수"라고 부른다.
 * 클래스/변수/상수명 구분 -> 클래스는 대문자 시작, 변수는 소문자 시작, 상수는 모두 대문자다. 라는 규칙이 있었음..
 * 메소드 명은 변수랑 규칙이 똑같아.. 소문자로 시작한다는것!!
 * 메소드명(); <--이게 메소드의 규칙입니다!!!
 * ex) System.out.println("Hello World");
 * ----------------------------------------
 * 메소드는 행위입니다. 행동..
 * 메소드를 왜사용하죠?
 * 1. 반복업무를 줄이기 위해서.
 * 2. 객체지향언어에서는 행동 즉 변수에 값을 넣는다거나, 더한다거나 이런 역할은 "메소드"밖에 할수 없습니다.
 * 
 * 메소드의 작성 문법
 * 
 * [접근한정자] [static/ non-static]리턴타입 메서드명 ([매개변수]) {
 *  .. 메서드 행동 정의 부
 *  }
 */

public class MethodExample01 {

	//반복적인 일을 메소드(함수)로 정의합니다...
	//값을 돌려주는 메소드 --> return타입..
	public static int add(int x, int y) { //int x, int y <--얘네가 매개변수!!
		return x + y;
		return z;  //반드시 같은 자료형으로 써야해. int면 int!!!
	}
	
	//값을 돌려주지 않는 메소드 --> void 메소드 라고한다.. return사용하지 않아도 돼
	public static void printAddValue(int x, int y) {
		int z = x + y;
		System.out.println(z);
	
	}
	
	static void printMyName() { //이렇게 매개변수가 없는것도 있다. 매개변수가 있는것도 있고.
		System.out.println("알아서머하게");
	}
	
	
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = add(10,20);
		printAddValue(a,b);
		printMyName();
	}

}
