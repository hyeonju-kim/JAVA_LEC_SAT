
public class BoyStudent extends Student{
	//생성자
	BoyStudent(String name, int age, int grade, int score){
		
		super(); //super를 통해서 등교시간 세팅(?)
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.score = score;
		this.gender = "남";
	}
	
	//오버라이딩
	@Override
	public void gotoCR() {
		System.out.println("남자화장실가유");
	}
	
	//새로 만든 메서드..
	public void smoking() {
		System.out.println("ㅇㅅㅇ뻐끔뻐끔.. 후...===3 ");
	}
}
