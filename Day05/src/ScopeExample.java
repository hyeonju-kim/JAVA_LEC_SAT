/*
 * 변수의 사용범위 (Scope)
 * 
 * 변수는 어디까지 사용할수 있는것인가????
 */

public class ScopeExample {

	static String name = "김현주"; //전역변수
			
	public static int add(int x, int y) {
		System.out.println(name);
		int z = x + y;
		return z;
		
	}
	
	public static void scopeTest(int a) { //여기있는 a 와 밑에 있는 a 는 효용범위가 달라서 서로 다른 a 라고 봐도돼!!! stack에서 각자 다른방에 있는거야! add, scopeTest, main 방 3개!!!
		a++;
		System.out.println(name);
	}
	
	public static void printName() {
		String name = "냐냐냐"; //지역변수... 여기안에 name이 있으면 냐냐냐가 출력되고, 여기 없으면 전역변수를 불러와서 김현주가 출력됨!!
		System.out.println(name);
	}
	
	public static void changeClassVarValue() {
		name = "하악하악"; // 전역변수에 있는 name이라는 전역변수를 사용해서 거기에 값을 집어넣은것! 변경시킨거지!
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		System.out.println(name);
		int a = 10;
		scopeTest(a);
		System.out.println(a);

	}

}
