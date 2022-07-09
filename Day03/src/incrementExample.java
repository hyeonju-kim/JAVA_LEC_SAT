
public class incrementExample {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(a);
		++a;
		System.out.println(a);
		
		
		a = 100;
		System.out.println(a++); // 보기만 하고 연산안해버림.. 다음줄로 넘김.. 그러니까 100이 출력 
		System.out.println(++a); // ++는 바로 +1을 해버리고 , 전줄에서 넘긴 계산도 해야하니까 +1 이 2번 되버림.. 그러니까 102출력 !!!!
		
	}

}
