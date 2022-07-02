/*
 * 상수와 변수의 차이
 */
public class VariableConst {
	
	public static void main(String args[]) {
		//--변수선언
		int var_age = 50;
		var_age = 100; //변수는 '변'할수있는 값(수)
		var_age = -100; //따라서 값이 변하더라도 오류가 발생하지 않음
		
		//--상수선언
		final int MAX_AGE = 1000; //상수는 final 이라는 키워드를 맨앞에 넣어주기
		//MAX_AGE = 10;
		
		final int MAX_HEIGHT;
		MAX_HEIGHT = 180; //이렇게 선언하고 초기화하는걸 나눠서하면 선임한테 혼남.. 동시에 해라!!
		
		System.out.println(MAX_HEIGHT);  //맨처음에 180이라고 초기화를 안했으니까 가능! but 상수는 시작할때 넣어주는게 원칙!!! 
	}
}
