//추상클래스(반조립형태의 클래스로, 미완성설계도)

public abstract class Shape {

	String type;
	Shape(String type){
		this.type = type;
	}
	
	abstract double area();
	abstract double length();
	
}
