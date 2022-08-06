import java.util.*;

//Collection API p.360~
//가변배열이다. 배열과 다르게 길이가 고정되지 않고 유동적이라는 말!! 글고 콜렉션은 인터페이스!!!
public class CollectionExample {
	
	public static void main(String[] args) {
		
		int arrA[] = new int[3];
		arrA[0] = 1;
		arrA[1] = 2;
		arrA[2] = 3;
		
		// System.out.println(arrA[3]);  이거안됨.. 길이가 고정되어있음!!!!
		// Collection은 2개의 인터페이스가 있음. List 와 Set!!!! List는 중복허용, 데이터는 차례대로쌓임./ Set은 중복불가, 지맘대로쌓임
		
		
		List list = new ArrayList(); //List는 꼭 import해줘야돼!!!! List는 java.util에 있으니까 그거 임포트하셈
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		//list.get(0) == arrA[0] 와 의미는 같음
		for(int i = 0; i <= list.size(); i++ ) {  //list는 length로 안쓰고 size로 씀!!!!!
			System.out.println("list.get(" + i + ") = " + list.get(i));
		}
		
		
	}

}

// Student Value Object(Data용으로 사용하는 클래스)
class StudentA{
	public void printName() {
		System.out.println("하악하악");
	}
	
}
