
public class ParentExample {

	String name;
	int arms;
	
	//--생성자 메서드
	//--리턴타입이없고 클래스명과 동일~~
	public ParentExample(String name, int arms) {
		this.name = name;
		this.arms = arms;
	}
	
	public ParentExample() { 
//      Application01클래스에서 빈 생성자를 호출시키려면 이게 필요하니까.. 
//		this.name = "하악";
//		this.arms = 10;
		
		this("하항",15); //위에처럼 해도되고 ~~ 이렇게 해도됨~!!
	}
	
	public void printName() {
		System.out.println("내 이름은 " + name + "이야." );
	}
	
	public void printArms() {
		System.out.println("내 팔은 " + arms + "개야.");
	}
	
	public void printMyInfo() {
		//내이름과 팔의수를 보여주는 메서드
		printName();
		printArms();
	}
	
}
