
public class GirlStudent extends Student{

	//생성자
	GirlStudent(String name, int age, int grade, int score){
		
		super(); //super를 통해서 등교시간 세팅(?)
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.score = score;
		this.gender = "여";
		
	}
	
	//오버라이딩
	
	@Override
	public void gotoCR() {
		System.out.println("여자화장실가유");
	}
			
}
