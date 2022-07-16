// 07. 클래스 p.146~
// * 동물클래스
// * 상위클래스로 정의
// */
public class Animal {

	
		//속성
		int legs = 4; //다리가 4개
		String name = "동물";
		
		//행위(메소드)
		public void bark() {
			System.out.println("동물동물");
		}
	
		
		// 다형성
		Animal[] animal = new Animal[3];
		
		animal[0] = new Cat("야옹이0번");
		animal[1] = new Dog("멍멍이1번");
		animal[2] = new Dog("멍멍이2번");
		
		((Cat)animal[0]).grrrr(); // 앞에 (Cat)으로 캐스팅(형변환)을 해줘야한다. grrrr가 animal에는없고
		//Cat에만 있으니까 Cat으로 캐스팅을 해줘야지!!

}
