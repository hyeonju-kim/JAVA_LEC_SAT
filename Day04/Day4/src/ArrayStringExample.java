/*
 * 학생 성적 출력(배열이용)
 * */


public class ArrayStringExample {

	public static void main(String[] args) {
		
		String[] stds = {"이종석", "박은진", "이지우"};
		int[] stdScores = {90, 100, 98}; //stds 와 stdScores의 값은 1대1 매칭된다!!!!!
		int totalScore = 0;
		//1. 점수를 출력한다.
		
		for(int i =0; i < stds.length; i++) {
			System.out.println(stds[i] + ":" + stdScores[i] + "\n");
			totalScore += stdScores[i]; //총합
		}
		
		//2. 총합을 출력한다.
		System.out.println("점수총합 : " + totalScore);
		
		//3. 평균을 구한다.
		System.out.println("평균 : " + (totalScore/ stds.length)+ " 점 "); //string 같은 참조타입도 배열을 쓸수있다는걸 보여주려고 한거야~!
	}

}
