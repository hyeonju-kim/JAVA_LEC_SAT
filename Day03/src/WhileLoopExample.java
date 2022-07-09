
public class WhileLoopExample {

	public static void main(String[] args) {
		boolean goLoop = false;
		
		while(goLoop) {
			System.out.println("고곡!!"); //처음부터 true일때만 출력하니까 안나온것!!
		}
		
		do {
			System.out.println("하악!!"); //처음부터 출력 먼저 해주니까 출력된거! do while은 게임에서 먼저 명령어 줄때 자주 사용
		} while(goLoop);
		
		int x = 10;
		while(x < 20) {
			System.out.println(x); // 이대로 하면 빠져나올수 없기때문에 무한루프 빠진다..
		}
		
		
		
		int x1 = 10;
		while(x1 < 20) {
			System.out.println(x1++); // 무한루프 안빠지려면 이렇게 x++ 해주거나 break써줘서 while 문을 사용해서 탈출해줘야해!!!!ㅠㅠ

	    }
		
		

}
