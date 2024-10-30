import java.text.DecimalFormat;

public class Triangle implements ShapeSpecial, CanBeColored {

	private double a = 3.0;
	private double b = 3.0;
	private double c = 3.0;
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	private String color = "No color";

	public Triangle() {
	}

	public Triangle(String color) {
		this.color = setColor(color);
	}

	public Triangle(double a, double b, double c) {
		this.a = (a >= 3.0) ? a : 3.0;
		this.b = (b >= 3.0) ? b : 3.0;
		this.c = (c >= 3.0) ? c : 3.0;
	}

	public Triangle(double a, double b, double c, String color) {
		this.a = (a >= 3.0) ? a : 3.0;
		this.b = (b >= 3.0) ? b : 3.0;
		this.c = (c >= 3.0) ? c : 3.0;
		this.color = setColor(color);
	}

	@Override
	public double calculateArea() {
		double p = (a + b + c) / 2;
		return Math.sqrt((p * (p - a) * (p - b) * (p - c)));
	}

	@Override
	public double calculatePerimeter() {
		return a + b + c;
	}

	@Override
	public void drawShape() {
		System.out.println("This is a triangle with area: " + df2.format(calculateArea())
				+ " and perimeter: " + df2.format(calculatePerimeter()) + ". Color: " + getColor());
	}

	@Override
	public String setColor(String color) {
		this.color = CanBeColored.super.setColor(color);
		return this.color;
	}

	@Override
	public String getColor() {
		if ("No color".equals(this.color)) {
			return "The shape is not colored";
		}
		return this.color;
	}
}
