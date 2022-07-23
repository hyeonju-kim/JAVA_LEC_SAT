/* p.194~
 * 접근제한자
 * 
 * public / protected / default / private 4가지가 있음!!!
 * 아무것도 안써있으면 default 임!!
 * 
 * 접근제한자는 아래와 같은 곳에 붙을수 있습니다.
 * 1. 클래스(클래스는 public / default 만 가능) 전체공개를 하거나, 패키지내에서만 공개를 하거나 두가지만.....
 * 2. 메서드
 * 3. 클래스 전역 변수
 * 
 */

class Class01 { //일케 아무것도 안써있으면 default라고! 그리고 class앞에 private으로 설정할수는 없다. 클래스를 공개하지않을수 없잖아.. 나를 호출할수 있는건, 내 방에 있는 나를 아는 사람들.. default니까!
	 			//같은 폴더(같은 패키지)내에 있는 사람들(프로그램/클래스들)
	
	private int money = 100; //내가 가진돈은 나밖에 접근할수 없어!!(나밖에 알수없어!)  (private이니까)
	String name = "김현주"; //내 이름을 바꿀수 있는 사람은 , 내 방에 있는 나를 아는 사람들  (default니까)
	protected int getMoney(int m) { //m은 빌린돈. 나한테 돈을 가져갈수 있는 사람은 나랑 아는 사람들(다른방에있어도) (protected니까) 
		money -= m;
		return m;
	}
	
	public void sayMyName() { //내 이름을 물어볼수 있는 사람은, 전세계 모두!!(public이니까)
		System.out.println(name);
	}
	
}


public class AccessExample {

	public static void main(String args[]) {
		
		Class01 cs = new Class01();
		// cs.money = 1000; // 안되는이유 : money는 private이기 때문에!!!!!!!!!!!!!!!!직접 접근 불가!!!!!!!!! 에러남;
		cs.name = "하악"; //name은 default 기 때문에 같은 패키지 안에서는 접근 가능하니까..가능하겠지
		int money = cs.getMoney(40);
		System.out.println("빌린돈 = " + money + "원");
	}
}
