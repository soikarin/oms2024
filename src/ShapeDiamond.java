import java.text.DecimalFormat;

public class ShapeDiamond implements ShapeSpecial, CanBeColored {
	private double a = 2.0;
	private double b = 2.0;
	private String color = "No color";
	private static DecimalFormat df2 = new DecimalFormat("#.##");

	public ShapeDiamond() {
	}

	public ShapeDiamond(String color) {
		this.color = setColor(color);
	}

	public ShapeDiamond(double a, double b) {
		this.a = (a >= 2.0) ? a : 2.0;
		this.b = (b >= 2.0) ? b : 2.0;
	}

	public ShapeDiamond(double a, double b, String color) {
		this.a = (a >= 2.0) ? a : 2.0;
		this.b = (b >= 2.0) ? b : 2.0;
		this.color = setColor(color);
	}

	@Override
	public double calculateArea() {
		return a * b;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * (a + b);
	}

	@Override
	public void drawShape() {
		System.out.println("This is a diamond shape with area: " + df2.format(calculateArea())
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
