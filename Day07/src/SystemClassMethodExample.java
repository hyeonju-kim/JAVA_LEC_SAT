import java.lang.*;
import java.util.Properties;

public class SystemClassMethodExample {

	public static void main(String[] args) {
		System.out.println(System.getProperty("java.class.path")); //getProperty는 static메소드임. new안썼잖아...."os.version"넣어도돼!! key에 있는거 다 저렇게 넣으면 나온다 wow!!!
	
		//사용자 컴퓨터의 환경변수를 출력!!
		for(String var : System.getenv().keySet()) {
			System.out.println(var + "=" + System.getenv(var));  //오 일케하니까 모든정보 다나옴;;
		}
		
		//java에서 지원하는 Properties를 사용하는방식
		Properties prop = System.getProperties();
		for(Object obj : prop.elements());
	}
	
	

}
