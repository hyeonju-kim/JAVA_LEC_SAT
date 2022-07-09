/*
 * 반복문 For
 * for(초기화식;조건식;증감식){
 * 		실행문
 * 	}	
 */
public class ForLoopExample {

	public static void main(String[] args) {
		
	 // 1-10까지 출력하세요
		
		for(int i=1; i<=10; i++)
		
		
		System.out.println(i);
		
		int x;
		for(x = 1; x <= 10; x++) {
			System.out.println(x);
		}
		System.out.println(x); 
		
		int y = 1;
		for(; y<=10; y++) {
			
		}
		
		/*for(;;) {
			//무한루프
			System.out.println(y++);
			if(y>5) break;
		}
		*/
		
		for(int x1 = 2; x1 <= 9; x1++) { //x결정됨
			
			System.out.println("====" + x1 + "단 =====");
			for(int y1 = 1; y1 <= 9; y1++) { //y결정됨
				if(y1 == 5) break;
				System.out.println(x1 + "x" + y1 + "=" + (x1*y1)); //왜 무한루프되지...
			}

		}
		
		
		
	}

}
