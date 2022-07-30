
public class Student {
	int schoolTime; //등교시간
	String name;
	int age;
	int grade;
	int score;
	String gender;

	//생성자
	Student(){
		schoolTime = 9;
	}
	public void sayName() {
		System.out.println("이름은 "+ name + "입니다.");
	}
	public void sayGrade() {
		System.out.println("학년은 "+ grade + "학년이에요");
	}
	public void sayGender() {
		System.out.println(gender + "학생 입니다.");
	}
	public void sayScore() {
		System.out.println(score + "점 입니다.");
	}
	
	public void play() {
		System.out.println("어디로 놀러가자~~~");
	}
	
	public void gotoCR() {
		System.out.println("화장실 갑니다ㅜ");
	}
	
	public void printIsLateness(int inTime) {
		if(inTime >= this.schoolTime) {
			System.out.println("지각");
		}else {
			System.out.println("세이프~");
		}
	}
}
