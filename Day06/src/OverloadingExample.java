//오버로딩(같은이름의 메소드를 확장 - 인자의 갯수나 데이터타입이 달라야해~!!)
class P {
	int add(int x, int y) {
		System.out.println("x,y호출");
		return x + y;
	}
	float add(float x, float y) {
		System.out.println("float x,y 호출");
		return x + y ;
	}
}
class C extends P {
	
	int add(int x) {
		System.out.println("C.add x 호출");
		return x + 10;
	}
	@Override
	int add(int x, int y) {
		System.out.println("C.add x, y 호출");
		return x - y;
	}
}
public class OverloadingExample {
	public static void main(String[] args) {
		C c = new C();
		int sum = c.add(10,20);
		System.out.println("덧셈은 " + sum + "입니다.");
		c.add(1.0f, 2.0f);
		c.add(100);
		P p = new P();
		//((C)p).add(10,20); // 객체의 캐스팅은 예외발생시, 컴파일에러가 발생안해. 런타임때 발생해. --> 이건 나중에 예외처리 배울거임!
		// 상위객체를 하위객체로 형변환을 했다.
		
		p = new C();
		p.add(10,20);
		p.add(1.0f, 2.0f);
	}
}
