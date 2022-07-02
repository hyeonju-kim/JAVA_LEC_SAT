
public class VariableLec01 {//클래스 선언부
	
	public static void main(String[] args) { //자바 어플리케이션 스타팅 포인트
		
		System.out.println("Hello Var!");
		
		int score = 10;
		System.out.println(score);
		
		//--1. 변수명은 영어,숫자,특수문자,한글사용가능하나지양
		//int Age;
		int age;  //변수의 시작은 소문자로!!!!!!!!!!
		//int aGE;
		int student4age; //숫자도 사용가능 
		int student4_age; //특수문자도 사용가능. 보통 언더바 많이 씀
		int $_age; // 특수문자 사용 가능
		
		//--2. 변수명은 숫자로 시작불가
		//int 4age; //--컴파일 에러 발생
		
		//---3. 공백 사용불가
		//int student age; // --컴파일 에러 발생
		int studentAge; //보통 이렇게 카멜케이스 많이씀!!
		int student_age;//이렇게 써도됨
		
		//---4. 대소문자 구분
		int studentAge2;
		int StudentAge2;
		int sTudentAGE2;
		int stUdentage2;
		
		//---5. 예약어는 변수명으로 사용불가.
		//int static;
		
		//---6. 의미를 부여하자
		int a = 40; //40이 뭘 말하는지 모르잖아..;; 일케 쓰면 욕먹음.....
		int friendAge = 40; //변수만 보고도, 아 친구의 나이를 말하는구나!! 알수있음!!
		
		char alpha = 65; 
		System.out.println((int)alpha + ":" + alpha);
		
		for(char i = 65; i<=90; i++) {
			System.out.println(i + "=" + (int)i);
		}
		
		
		}
		
	}
	
}