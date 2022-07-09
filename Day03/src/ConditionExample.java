/*
 * 조건문(Condition) 1.if구문  2.switch
 * 
 * if(조건식) {
 *  ...실행문...
 * }
 * 
 */
public class ConditionExample {

	public static void main(String[] args) {
		
		int gainedPoint = 89;  
				
		//Integer.parseInt(args[0]);
		
		if(gainedPoint >= 90) {
			System.out.println("입사하세요");
		} 
		else if(gainedPoint >= 80) {
			System.out.println("인턴 3개월 하세요");
		}
		else {
			System.out.println("집에가세요");
		}
		
		
		System.out.println(gainedPoint);
		
		
		
		int age = 5;
		int height = 120;
		boolean heartd = false;
		
		if(age >= 6 && height >= 120 && !heartd){
			System.out.println("타라");
		} else {
			System.out.println("가라");
		}
		
		

	}

}
