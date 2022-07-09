
public class ShiftExample {

	public static void main(String[] args) {
		// 1 << 3 -> 1을 이진수로 바꾸면 0000 0001 ->여기서 3칸 앞으로 이동해야하니까 -> 0000 1000!!!!! 
		
		int x = 2;
		x = x << 2;
		
		System.out.println(x); // 2를 이진수로하면 0010 -> 2칸앞으로 하면 1000 -> 1000을 십진수로 바꾸면 8 !!!!!!!!!!!!!!! 승수계산할때 자주 사용함..
		System.out.println(Integer.toBinaryString(x)); //2를 이진수로하면 0010 -> 2칸앞으로 하면 1000
		//2*2*2 == 2<<2  두개는 동일한 결과가 나옴.. 
		
		
		x = 2;
		x = x << 3;
		System.out.println(Integer.toBinaryString(x)); //2를 이진수로하면 0010 -> 3칸앞으로 하면 10000
		
		x = -1;
		System.out.println(Integer.toBinaryString(x)); //1이 32개 반복해서 나옴
		
		x = x >> 10;
		System.out.println(x); //1이 32개 나온걸 10진수로 변환하면 -1
		System.out.println(Integer.toBinaryString(x));
		
		x = 100;
		System.out.println(Integer.toBinaryString(x)); //1100100
		x = x >> 3;
		System.out.println(x);//12
		System.out.println(Integer.toBinaryString(x)); //1100
		
		x = -1;
		System.out.println(Integer.toBinaryString(x)); //1이 32개
		x = x >>> 3;
		System.out.println(x); 
		System.out.println(Integer.toBinaryString(x)); //1이 32개 였는데 오른쪽을 3개 이동했으니까 앞에 0이 들어가잇는꼴. 생략되서 안보이긴하지만.. 1이 29개 있음!!!
	}

}
