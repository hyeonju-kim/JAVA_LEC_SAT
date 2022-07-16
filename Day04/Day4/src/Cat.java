/*
 * Cat클래스. 
 * Cat은 동물(Animal)
 */
public class Cat extends Animal { //Cat은 Animal을 상속받는다!!!!
	
	public Cat() { //생성자
		super.name = "야옹이";
	}
	
	
	//Cat의 행위(method)
	public void grrrr() {
		System.out.println("그릉그릉");
	}
	
	//메서드 재정의(행위의 재정의) (행위는 재정의가 가능하지만 속성은 값만 바꿔서 넣을수있따)
	public void bark() {
		System.out.println("야옹야옹");
	}

}



/*
 * Dog클래스. 개도 동물(Animal)
 * 
 */

class Dog extends Animal {
	//Dog의 특정 행위(method)
	public void kaengkaeng() {
		System.out.println("깨갱깨갱");
	}
	
	public void bark() {
		System.out.println("멍멍");
	}
}


