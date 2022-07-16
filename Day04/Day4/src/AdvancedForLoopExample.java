/*
 * 향상된 for문 p.135~
 */
public class AdvancedForLoopExample {

	public static void main(String[] args) {
		
		int arrInt[] = {100,200,300,400};
		
		for(int i = 0; i < arrInt.length; i++) {
			System.out.println(arrInt[i]);
		}
		
		//배열이나, List같은 Collection계열
		//for(데이터타입변수 : Collections)  
		System.out.println("\n#######향상된 for문#########");
		
		for(int item : arrInt) { //변수명 내가 임의로 만들어라!
			System.out.println(item);//향상된 for 문은 0~끝까지 자동으로 도는거다...!!
			//자동으로 도니까 언제부터 돌겠다.. 뭐 이런 조건은 안통하겠지! 그게 단점임.. 
			//JS에서는 for each문 사용!
		}
		
		int arr[];
	
	}

}
