
public class samhangExample {

	public static void main(String[] args) {
		int point = 90; //커트라인
		int gainedPoint = 80; //얻은점수
		//int isPassed = 0; //pass여부 0이면 fail, 1이면 passed
		String pass = "";  //아 이렇게 ""만 써서 초기화시켜도 되는구나!!!
		
		//isPassed = gainedPoint >= point ? 1 : 0;
		pass = gainedPoint >= point ? "합격" : "불합격";
		
		System.out.println(pass);

		
		
		//연습문제 4번 (p.80)
		
		int age = 6;
		int height = 120;
		Boolean heartDease = true;
		
		System.out.println((age >= 6) && (height >=120) && heartDease);
		
		
	}

}
