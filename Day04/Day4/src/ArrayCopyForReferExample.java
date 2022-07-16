/*
 * 배열은 참조변수 입니다(Object) p.137~
 */
public class ArrayCopyForReferExample {

	public static void main(String[] args) {
		
		int arrInt[] = {10,20,30};
		int arrInt2[] = arrInt;
		
		for(int i = 0; i < arrInt.length; i++) {
		 	System.out.println("arrInt["+i+"]=" + arrInt[i]);
		}
		
		for(int i = 0; i < arrInt2.length; i++) {
		 	System.out.println("arrInt2["+i+"]=" + arrInt[i]);
		}
		
		System.out.println("===================================");
		arrInt2[1] = -100; // arrInt2만 바꿨는데 arrInt 도 변경되서 출력되네?? 이게 참조자료형의 특징이다!!!
		//arrInt2가 arrInt의 주소값을 그냥 가져오기만 하니까.. 연결되어 있겠지!! 책 p.141 2번 참조형 필기참고!!
		
		for(int i = 0; i < arrInt.length; i++) {
		 	System.out.println("arrInt["+i+"]=" + arrInt[i]);
		}
		
		for(int i = 0; i < arrInt2.length; i++) {
		 	System.out.println("arrInt2["+i+"]=" + arrInt[i]);
		}
		
	}

}
