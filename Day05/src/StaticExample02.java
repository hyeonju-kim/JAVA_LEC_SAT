// Static p.183~
class Counter{
	
	static int count = 0; //static 변수 이므로, 클래스가 로딩되는 시점부터 (프로그램 시작순간부터) static 영역에 저장되고, 프로그램이 끝날때까지 공유(사라지지않는다)
	
	int non_static_count = 0; //non-static 변수이므로, heap영역에 올라가는순간 초기화되며, heap에서 해제(사라지는)되는순간 삭제됨. 객체에 종속적.
	
	Counter(){ //Counter생성자를 만들거야.
		count++; //static
		non_static_count ++; //non-static
		System.out.println(count);
	}
	
	public static int getCount() {
		return count;
		
	}
	
	public int getNonStaticCount() {
		return non_static_count;
	}
}

public class StaticExample02 {
	
	public static void main(String[] args) {
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		Counter c3 = new Counter();
		
		int static_total_cnt = Counter.getCount();
		int non_static_total_cnt = c3.getNonStaticCount();
		
		System.out.println("Counter 객체 생성 수(static) : " + static_total_cnt);
		System.out.println("Counter 객체 생성 수 : " + non_static_total_cnt);
		
	}
}
