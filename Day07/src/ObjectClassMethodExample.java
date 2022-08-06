//p.298 기본API
public class ObjectClassMethodExample {

	public static void main(String[] args) {
		
		String a = "김현주";
		String b = "김현주";
		String c = a;
		
		//System.out.println("a == b : " + a == b); //true 아닌가? 근데 false래.... 머지?????????
		System.out.println("a == b : " + (a == b));
		System.out.println(a == b); //true
		System.out.println("a.equals(b) : " + a.equals(b));  // true
		
		
		
		//String 객체의 hashCode()메소드는 String Class에서 오버라이딩됨. 값이 같으면 같은 해쉬코드를 돌려주도록!!!
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
		System.out.println(System.identityHashCode(c));
		
		
		//Wrapper 클래스 중에 Integer라는게 있어.
		
		int i = 0; // 얘는 i.쳐도 뭐가 안나오잖아.
		Integer objI = new Integer(10);
		String objS = objI.toString(); //toString안써주면 에러남. objI는 숫자고 objS는 문자니까... 숫자를 문자로 바꿔주는 toString을 써줘야지...
		System.out.println(objS); //10
		
		//object clone
		
		//이걸일단 해보자..
		int arrA[] = new int[3];
		arrA[0] = 1;
		arrA[1] = 2;
		arrA[2] = 3;
		
		//int arrB[] = arrA; //주소값을 복사해서, arrA, arrB 변수는 new int[3]을 공동참조한다. arrB를 변경하면, arrA도 변경되겠지!!
		
		int arrB[] = arrA.clone(); //일케하면 방따로 만들고 복사한거니까 arrB가 arrA를 그냥 복사한거기때문에, arrB를 변경해도 arrA는 변경안됨!!wow!!
		
		arrB[2] = 100;
		
		System.out.println(arrA[2]); 
				
	
	}
}
