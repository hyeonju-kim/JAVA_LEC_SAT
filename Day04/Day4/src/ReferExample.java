/*
 * 참조자료형 특징 p.138~
 * 지금까지 쓴 예제에서 사용한 "참조자료형"은 2가지..
 * 1. String(문자열)
 * 2. [] (배열)
 * 
 */
public class ReferExample {

	public static void main(String[] args) {
		
		String name = "홍길동";
		String name2 = "홍길동";
		System.out.println(name == name2); //true 가 나옴. String pool 홍길동객체 하나 생성
		//name, name2 공유(주소값은 하나) 
		
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		System.out.println(name3 == name4); //false
		System.out.println(name3.equals(name4));
		//new키워드를 통해서 각자 다른 객체를 상성
		//name3, name4 각자 주소 달라서 false.. 주소값 비교 말고 값을 비교하고싶으면 equals()라는 메서드사용하면돼
		

	}

}
