
public class Application01 {

	public static void main(String[] args) {

		ParentExample ex = new ParentExample("김현주", 4);
		ex.printMyInfo();
		
		ParentExample ex2 = new ParentExample(); //빈생성자를 호출했어..
		ex2.printMyInfo();
		
		ChildExample cx = new ChildExample("하악아앙");
		cx.printMyInfo();
		System.out.println(cx.name);
		cx.name = "하악";
	}

}
