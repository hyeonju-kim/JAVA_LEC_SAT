
interface PersonAction{
	
	int giveMoney(); // 인터페이스는 모두 추상메서드기 때문에 굳이 abstract 를 안써도돼!!
	void sayName();
}

class Person implements PersonAction{

	@Override
	public int giveMoney() {
		return 1000;
	}

	@Override
	public void sayName() {
		System.out.println("아악!!");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		Person p = new Person();
		p.sayName();
		p.giveMoney();
		
		PersonAction action = new Person();
		action.sayName();
		
		System.out.println("action instance of PersonAction" + (action instanceof PersonAction)); //왼쪽에있는 객체가 오른쪽클래스의 타입(인스턴스)이냐???라고 물어보는것!!
		System.out.println("action instance of DogAction" + (action instanceof PersonAction));
		System.out.println("action instance of Person" + (action instanceof PersonAction));
		
		PersonAction anoObj = new PersonAction() {
			
		};
	}
	
}
