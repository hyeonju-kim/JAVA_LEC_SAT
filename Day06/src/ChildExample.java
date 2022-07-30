
public class ChildExample extends ParentExample {

	public ChildExample(String name) {
		super(name, 7);
		this.arms = 10;
		//아버지 클래스인 ParentExample의 생성자
		//ParentExample(String name, int age)호출
	}
}
