class Student {
	public void printName() {
		System.out.println("하악하악");
	}
}



public class ClassMethodExample {
	public static void main(String[] args) {
		
//		//객체생성방식
//		//1. 기존방식
//		Student s = new Student(); //고정된상태.. 바꾸고 싶으면 소스를 바꿔야돼. 이게 정적방식!! 직접 고쳐야되니까!!!
//		
//		//2. Class클래스 사용해서 객체생성. forName사용 (무슨말????????????????????)
//		Class c = Class.forName("Student");//내가 필요한객체를 그때마다 딱딱얻어낼수있다. forName안에 클래스명써주면되잖아. 이건 동적방식임!!
//		Student std = c.newInstance();
//	}
 }

	//모르겠음..
	String className = "AppProgramV1";
	Class clazz = Class.forName(className);
	AppInterface inc = (AppInterface)clazz.getConstructors().newInstance();
	inc.printMyName();
}	
