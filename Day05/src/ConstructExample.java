/*
 * 생성자 p.174~
 */
class Student{
	
	String name = "김현주"; //이렇게 메소드 밖에서 값을 할당하는 행위를 했다. 옛날엔 안됐는데 지금은 됨!!!!!!!!!!
	int grade;
	String gender;
	
	//--------------------생성자 선언-----------------------------------
	public Student() { //기본생성자(인자없는생성자)
		name = "김현주";
		grade = 6;
		gender = "여성";
	}
	
	
	public Student(String p_name, int p_grade, String p_gender) {
		name = p_name;
		grade = p_grade;
		gender = p_gender;
	}
	
	void sayName() {
		System.out.println("이름은 '" + name + "'입니다");
	}
	
	void sayGrade() {
		System.out.println(grade + "학년이에요.");
	}
}

//class는 배열과 마찬가지로 heap영역에 저장된다.... heap에 저장되려면 무슨 키워드를 써야한다고햇지? new!!!!!!!!
public class ConstructExample {

	public static void main(String[] args) {
		
		Student std = new Student();
		std.name = "냐냐냐";
		std.sayName();
		std.sayGrade();
		
		Student std2 = new Student("하악하악", 2, "남성");
		std2.sayName();
		std2.sayGrade();

	}
}

