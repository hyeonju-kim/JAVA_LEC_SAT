//06. 배열 p.116~

/* 선언방법 
 * 1. 데이터타입[] 변수명 (int[] arrInt;)
 * 2. 데이터타입 변수명[] (int arrInt[];) 
 */
public class ArrayExample {

	public static void main(String[] args) {
		
		//A. 방을 만들고, 각 호실에 데이터를 따로 입력하는 방식
		int[] arrInt = new int[5]; 	//1.  메모리 할당. int라는 방을 5개 만들거야.. 배열은 객체라고 부름..
		arrInt[0] = 1; //2. 각 호실에 데이터값을 집어넣기
		arrInt[1] = 2;
		arrInt[2] = 3;
		arrInt[3] = 4;
		arrInt[4] = 5;
		
		//이런식으로 배열에 값을 집어넣기도 함.. 자주 하진 않지만....
//		for(int = i; i < arrInt.length; i++) {
//			arrInt[i] = i;
//		}
		
		//B. 선언과 동시에, 각 호실에 데이터를 한번에 입력하는 방식 (선언과 동시에 초기화)
		int arrInt2[] = {11,22,33,44,55};
		
		System.out.println(arrInt[0]);
		System.out.println(arrInt2[1]);
		System.out.println(arrInt[5]);
		
		
		//A-Z까지 char[] 넣어라..
		char[] alpha = new char[25];
		for(char i = 0; i < alpha.length; i++){
			alpha[i] = (char)(i +65);
		}
		
		//A-Z까지 출력
		for(int  i = 0; i < alpha.length; i++) {
			System.out.print((char)alpha[i]);
		}
		
		
	}

}
