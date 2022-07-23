/*
 * Singleton 예제 p.196~~
 * 싱글톤 = 하나의 객체로 모두 공유하는 방식... 아무데나 쓰면 안돼. 적재적소에 사용해야한다..예를들어 학교의 학생한테는 쓰면 안되겠지. 개개인이 객체니까. 그럴때는 new로 생성해야함..
 */

class Counter2 {
	
	static Counter2 counter2;
	int cnt = 0; // 덧셈숫자
	
	// 싱글턴 패턴 객체생성 메서드
	public static Counter2 getInstance() {
		if(counter2 == null) { //counter2 객체에 null이 들어가있니??? 그러면 넣어!!
			counter2 = new Counter2();
		}
		return counter2; //주소값만 리턴!!!!!
	}
	
	


//--cnt 변수에 1씩 증가
	public void addCnt() {
	cnt++;
	}

	public void printCnt() {
	System.out.println("cnt = " + cnt);
	}
}


public class SingletonExample {
	
	public static void main(String args[]) {
		
		//일반 방식
		Counter2 ccount1 = new Counter2();
		Counter2 ccount2 = new Counter2();
		Counter2 ccount3 = new Counter2();
		
		ccount1.addCnt();
		ccount1.addCnt();
		ccount1.addCnt();
		ccount3.printCnt(); //--cnt
		
		
		//Singleton방식(객체를 하나 생성해서 count1,2,3에 그 주소값을 공유)
		Counter2 count1 = Counter2.getInstance();
		Counter2 count2 = Counter2.getInstance();
		Counter2 count3 = Counter2.getInstance();

		//count1 addCnt() 메소드 3번 호출 -> cnt = 3;
		count1.addCnt();
		count1.addCnt();
		count1.addCnt();
		
		count3.printCnt();
	}

}
