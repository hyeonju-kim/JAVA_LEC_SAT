//다차원배열 p.126~~


public class MultipleArrayExample {

	public static void main(String[] args) {
		// 1차원 배열 선언
		int[] arrInt = new int[5];
		
		// 2차원 배열 선언 (3층건물, 한층에 방5개짜리)
		
		// a)생성후 따로 넣기
		int[][] arrIntMulti = new int[3][5]; //앞에가 층수야.. 뒤에가 방개수.....!! 15 + 27 ???
		
		arrIntMulti[0][0] =1;
		arrIntMulti[0][1] =100;
		
		// b) 생성과 동시에 방에 데이터 채워넣기 
		
		int[] arrInt2 = {10,20,30}; //1차원배열은 이렇게 했엇찌?
		int[][] arrIntMulti2 = {
				{1,2,3},
				{4,5,6},
				{4,5,6}
		}; //3층짜리 방3개 만든거야!!! 이렇게 2차원배열 만들면됨!!!
		
		
		int[][] a = new int[3][5];
		for(int x = 0; x < a.length; x++) { //a.length == 3 층의 개수를 구하는것!!
			for(int y = 0; y < a[x].length; y++) { //a[x].length == 5 방의 개수를 구하는것!!
				a[x][y] = x * y;
				System.out.print(a[x][y]);
			}
			System.out.println();
			
		}
		
	}

}
