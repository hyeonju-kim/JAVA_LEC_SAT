
public class ShapeExample {

	public static void main(String[] args) {
		Shape shape[] = new Shape[2];
		shape[0] = new Circle(5);
		for(Shape s : shape) {
			System.out.println(s.type);
			s.area();
			s.length();
		}
	}

}
