/* 
 * 반복문 For
 * 구구단!!!!!!!!!!!!!!!!!!!!!!
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
		System.out.println("\n");
		
		
		
		
		for(int y1 = 1; y1 <= 9; y1++) { //x결정됨
			for(int x1 = 2; x1 <= 9; x1++) { //y결정됨
				
				System.out.print(x1 + "x" + y1 + "=" + (x1*y1) + "\t");
				
			}
			
			System.out.print("\n");

		}
		
		
		
	}

}
