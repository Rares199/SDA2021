package shape;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws IllegalArgumentException {
		List<Shape> shape = new ArrayList<>();
		try {
			shape.add(new Circle("#1111", 5, 5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			shape.add(new Square("#1111", 5, 5));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		try {
			shape.add(new Rectangle("#1111", 5, 5, 10));
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		for (Shape s : shape) {
			System.out.println(s.getName() + ";" + s.getArea() + ";" + s.getBorderWidth() + "px");
			s.draw();
		}
	}

}
