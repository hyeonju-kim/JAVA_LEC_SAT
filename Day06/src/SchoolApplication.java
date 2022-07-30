
public class SchoolApplication {

	public static void main(String[] args) {
		//상속을 통한 is a 관계 !!
		//A is a B (A는 B이다.)
		//인간은 동물이다, 남학생은 학생이다
		//여학생은 학생이다. 학생은 인간이다. 인간은 동물이다.
		
		Student std1 = new BoyStudent("멋쟁이", 45, 6, 10);
		BoyStudent std2 = new BoyStudent("이종석", 45, 6, 10);
		Student std3 = new GirlStudent("하악잉", 20, 1, 90);

		std1.sayName();
		std2.sayName();
		std3.sayName();
		std1.gotoCR();
		std3.gotoCR();
		std2.gotoCR();
		// std1.smoking(); 이건 에러남.. 왜? Student 타입의 클래스에는 smoking이 없으니까 읽을수가없는거야!!!
		
		//형변환으로 하면되지!! (헐..) 이렇게 부모에게 없던 기능같은게 생기면 일케 타입캐스팅 해줘야된다공ㅋ
		((BoyStudent)std1).smoking();
		//std1 은 Student데이터타입으로 smoking메서드가 없잖아. 그니까 smoking은 BoyStudent클래스에만 정의된
		//메서드잖아. 그니까 Student타입의 std1을 BoyStudent로 형변환(타입캐스팅)을 해야 스모킹이 호출되겠지!!
		//wow.. 클래스명을 앞에 써줘서 형변환을 해줄줄은 몰랐네 신기하네.........ㅋㅋㅋ
		
		
		//한 반에 10명이 수업을 듣는다. 남녀 합반으로. 배열을 만들어보자.
		//이것도 연습하자;; 기억안나;
		// p.232 객체를 배열로 처리
		Student[] classRoom = new Student[10];
		classRoom[0] = new BoyStudent("김모모",45,1,10);
		classRoom[1] = new GirlStudent("김미미",45,1,10);

		for(Student std : classRoom) {
			if(std == null) break;
			
			std.sayGender();
			std.sayName();
		}
	}

}
