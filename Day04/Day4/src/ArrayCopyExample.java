import java.util.Arrays;

/*배열복사 p.132~ (헷갈리니까 여러번 보자...)
*배열을 복사하는 이유?
*1. 방을 넓히거나 줄일 목적이 있는 경우
*2. 참조변수이기 때문에, 다른 프로세스(작업)에 영향을 받을 수 있기 때문에 그 영향도를 없애고 독립적으로 사용하고 싶은경우 
 */



public class ArrayCopyExample {

	public static void main(String[] args) {
		//1번 목적인경우
		//학생이 5명인 학교, 5명의 학생 점수를 입력
		
		// A. for 문 사용해서 복사@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	int stdScores[] = {90,80,70,60,50,};
	
	for(int i = 0; i < stdScores.length; i++){
		System.out.println(i + "번째 학생 점수" + stdScores[i] + " 점 "); 

	}
	
	//오늘 한명이 전학을와서 시험봐서 80점을 맞았다. 그럼 어캄?? stdScores는 방이 5개밖에 없는데....? 방을 늘릴수없으니까 
	//이사를 가야만 함..... 어쩔수 없이 10명짜리 방을 만들어서 이사를 가자!!!! stdScores2라는 집을 만들자!!!
	
	int stdScores2[] = new int[10]; //10개짜리 방 만듬!!!
	
	int i = 0;
	for(; i < stdScores.length; i ++) {
		stdScores2[i] = stdScores[i];
	}
	
	stdScores2[i] = 80;
	
	

	System.out.println("\n###이사완료###");
	for(int x = 0; x < stdScores2.length; x++) {
		
		System.out.println(x + "번째 학생 점수" + stdScores2[x] + " 점 "); 
	}
	
	// B. System.arrayCopy() 사용해서 복사하기@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	// devdocs.io/openjdk~11 여기 들어가서 메소드방법 볼수있음
	// 학생 3명이 있는 학교 schoolA에 학생 '괭이'가 전학을 옴
	
	//scr(소스, 원형)
	String[] schoolAstds = {"이종석", "하악이", "뿅뿅이"};
	
	//Dest(Destination) 복사할 대상
	String[] schoolBstds = new String[10];
	
	
	//arraycopy(src, src시작인덱스, dest, dest시작인덱스, 복사할대상의길이)
	System.arraycopy(schoolAstds, 0, schoolBstds, 0, schoolAstds.length);
	
	schoolBstds[3] = "괭이";
	
	System.out.println("\n####학생출력####");
	for(int x = 0; x < schoolBstds.length; x++) {
		System.out.println(x + "번째 학생 " + schoolBstds[x]);
	}
	
	
	
	
	//C. Arrays.copyOf 사용해서 복사하기@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
	
	String[] schoolCstds = Arrays.copyOf(schoolBstds, 20);
	// 대상배열 변수 = Arrays.copyOf(원본배열, 새로생길배열의 총길이)
	
	System.out.println("\n####학생출력2####");
	for(int x = 0; x < schoolCstds.length; x++) {
		System.out.println(x + "번째 학생 " + schoolCstds[x]);
	}
	
	
}
}
