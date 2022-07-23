/* p.160~ 이해 잘 안돼......................  
 * 
 * 매개변수(인자)
 * 메소드에서만 사용합니다!!!!!!!!!!!
 * 
 * 메소드명(인자.....) -> 일케 선언함
 * 
 * 매개변수 선언방식은 ( 데이터타입 변수명, 데이터타입 변수명 .... ) 이런식으로 한다!!
 * 매개변수도 마찬가지로 지역변수입니다!!!!!
 * 
 * static은 모든 클래스들이 접근해서 사용가능한 공유저장소!!!! 많이쓰면 안좋음............. 프로그램이 끝날때까지 끝나지 않아.. 메모리가 너무 많이 사용이되겠지..
 */
public class ParamExample {

	static void printAddValue(int a, int b) {  //pass by value라고 함!! 복사해서 값만 주는거다..  여기에서 지역변수 몇개?  3개 !!! x,y,z!!!
		int z = a + b;
		a++;
		b++;
		System.out.println("a + b = " + z);
	}
	
	static void printAddArray(int[] x) { //pass by reference
		x[1] = 10;
	}
	
	//--void 를 리턴값(리턴값x) 가지는 메서드의 return 활용
	static void printValueUseReturn() {
		
		int x = 0;
		for(; x<=10; x++) {
			//if(x == 9) break; //하악하악 찍힌다!!!
			if(x == 9) return; //하악하악 안하고 이 함수를 끝내버리고 싶을때!! 하악하악 안찍힌다.. 이렇게 void에서도 return을 사용할수 있는 방법도 있따. 쌤도 좋아하는 방식!!
		}
		
		System.out.println("하악하악 x = " + x);
	}
	
	public static void main(String[] args) {
		
		printValueUseReturn();
		
		int a = 10;
		int b = 20;
		printAddValue(a,b); //기본타입은 stack에서 직접 값(ex. 10,20)을 넣기 때문에, 인자로 넘길때도 그 인자에 메모리 주소값이 아닌 10,20 그 값 자체를 '복사'해준다!!
		//따라서 a,b의 값은 메소드에서 무슨 짓을 하건 영향을 받지 않는다...
		System.out.println("a = " + a);
		
		int[] x = new int[2];
		x[0] = 10;
		x[1] = -10;
		printAddArray(x);
		System.out.println(x[1]);
		//참조타입(레퍼런스타입) x는 stack에 직접 값(ex.4,10...)을 등록하는것이 아니라, 
		//Heap 메모리에 있는 실 데이터의 "주소값"을 "복사"로 넘겨준다!!!
		//따라서 호출된 메소드에서 그 참조값을 변경하는 경우, 
		//실제 값도 영향을 받는다...
		
		//new를 사용해야만 Heap에 저장된다!!!!!!!!!!!!!!!!.. new array... new 클래스명... 
	}
	
	

}
