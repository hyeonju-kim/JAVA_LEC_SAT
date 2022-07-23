/* Static에 대하여.. p.183~?
 * 
 * Static 정적 :  메소드/ 클래스 전역변수에만 사용이 된다.
 * static 은 heap메모리가 아닌 따로 저장이 된다. jvm이 static을 찾아서 실행시킨다... 동적영역인 heap이랑은 반대된다..
 * Heap / Stack = 동적 메모리 영역 (코드에 따라, 실행 순서에 따라 데이터가 저장되고 사라지는 영역)
 * Static 영역 = 정적 메모리 영역(코드에 따라 실행되는게아니고, 프로그램 시작하자마자 로딩이됨.. 프로그램자체가 끝날때까지 유지가 된다.이걸 너무 많이 쓰면 메모리가 과부하됨..)
 * 
 */


class CounterObject{
	int cnt = 0;
	void addCount() {
		cnt++;
		System.out.println(cnt);
	}
}

class StaticCounterObject{
	static int cnt = 0;
	static void addCount() {
		cnt++;
		System.out.println(cnt);
	}
}

public class StaticExample {
	
	static void callAddCount() {
		CounterObject cnt = new CounterObject();
		cnt.addCount();
	}
	
	static void callStaticAddCount() {
		//static 메소드/변수는 Heap메모리가 아닌 Static영역에 저장되기 때문에, new 라는 키워드를 사용하지 않습니다.
		//그러면 어케해?? 클래스명.변수명 ,  클래스명.메소드명(); 이렇게 사용해야됨
		StaticCounterObject.addCount();
	}
	
	void printName() {
		System.out.println("난 동적메서드 printName이야");
	}
	
	
	
	public static void main(String[] args) {
		
		callAddCount();
		callAddCount();
		callAddCount(); //객체의 cnt값이 공유되지 않음(항상 동적으로 새롭게 객체 생성)
		
		
		callStaticAddCount();
		callStaticAddCount();
		callStaticAddCount(); //Static은 공용영역이라서 new 메소드를 사용하지 않는다.
		
		//Static메소드 내에서 non-static(동적) 객체를 사용하고 싶다. --> 그럼 반드시 new 키워드를 써서 heap영역에 올려서 가시화를 시켜야해!!!!
		CounterObject c_obj = new CounterObject(); //메모리를 heap영역에 올리고
		c_obj.addCount(); //--필요 메서드를 사용한다.
		//같은 클래스의 동적 메서드라 할지라도, 
		//new를 통해 자기 자신을 heap영역에 올리고 사용해야한다.
		//printName(); //--에러
		
		StaticExample example = new StaticExample();
		example.printName();
		

	}

}
