
import java.util.Scanner;



public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);// System.in을 입력한순간 , 컴터는 내 입력을 기다리고있음;
//		String input = sc.nextLine(); //String 받아오는 메소드야. 넥스트라인이 !! 뉴라인을 만나기 전까지 다 긁어오는 메소드(?)
//		System.out.println("입력값은 " + input + "입니다");
		
		int width, height;
		
		while(true) {
		System.out.println("가로길이를 입력하세요 : ");
		width = Integer.parseInt(sc.nextLine());
		System.out.println("세로길이를 입력하세요 : ");
		height = Integer.parseInt(sc.nextLine());
		
		Rectangle rc = new Rectangle(width, height);
		
		System.out.println("Shape is " + rc.type);
		System.out.println("사각형의 가로는 " + width + ", 세로는 " + height + "입니다.");
		System.out.println("사각형의 면적은 " + (rc.area() + "이고,"));
		System.out.println("사각형의 길이는 " + (rc.length()+ "입니다."));
		System.out.println("프로그램을 종료하시겠습니까? ( Y / N )");
		String command = sc.nextLine();
		if(command.equals("Y")) {break;}
		
		}
	}

}
