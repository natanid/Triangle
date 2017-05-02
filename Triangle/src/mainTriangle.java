//import java.io.*;
public class mainTriangle {

	public static void main(String[] args) {

		Triangle triangle1 = new Triangle(3, 4, 5);

		Triangle triangle2 = new Triangle(7, 8, 9);

		System.out.println("side1 = " + triangle1.getSide1());
		System.out.println("side2 = " + triangle1.getSide2());
		System.out.println("side3 = " + triangle1.getSide3());

		int perimeter = triangle1.getSide1() + triangle1.getSide2() + triangle1.getSide3();
		System.out.println("perimeter = " + perimeter);

		System.out.println("perimeter = " + triangle1.getPerimeter());
		System.out.println("perimeter2 = " + triangle2.getPerimeter());

		System.out.println("Is triangle scalene?     " + triangle1.is_scalene());
		System.out.println("Is triangle isosceles?   " + triangle1.is_isosceles());
		System.out.println("Is triangle equilateral? " + triangle1.is_equilateral());
	}
}