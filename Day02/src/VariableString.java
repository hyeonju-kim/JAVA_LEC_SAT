
public class VariableString {
	
	public static void main(String[] args) {
		
		char alpha = '이'; //문자형은 '' 싱글쿼테이션
						  // char 은 기본데이터타입
		String name = "이종석"; //문자열은 "" 더블쿼테이션
							  // 문자열은 참조데이터타입 ! 대문자로 시작되는건 다 참조데이터타입!!
		System.out.println("나의 이름은 " + name + "입니다.");
		
		name = "  ";  
		
		String message = "너의 점수는 " + 90 + "점입니다.";
		System.out.println(message);
		
		System.out.println(message.indexOf("점수") + "번째부터 시작");
		
		
		//--변수/상수
		int i = 10;
		System.out.println("변수 i = " + i);
		
		i = 100;
		System.out.println("변수 i = " + i);
		
		
	}
}
