/*
 * 패키지 p.185~
 */


//import drivers.DriverType01;  --> drivers 패키지 밑에 있는 DriverType01 클래스만 사용하겠다..

import drivers.*; //다른 drivers 패키지에 있으니까 임포트 해줘야지!!!!! drivers패키지 밑에 모든 클래스를 접근해서 사용할수있다. * 쓰면..

public class PackageExample {

	public static void main(String[] args) {

		DriverType01 t1 = new DriverType01(); 
		t1.getDriverInfo();
	}

}
