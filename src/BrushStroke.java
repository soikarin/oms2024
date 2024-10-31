import java.util.Random;

public class BrushStroke extends Visibility implements ShapeBasic, CanBeColored {
	private int thickness;
	private String color = "Yellow";
	private static final Random rand = new Random();

	public BrushStroke() {
		this.thickness = rand.nextInt(10) + 1;
	}

	@Override
	public void draw() {
		System.out.println("Brush strokes with thickness " + thickness);
	}

	@Override
	public void grow() {
		System.out.println("Adding some color..." + getColor());
	}

	@Override
	public String printText() {
		return "Brush Stroke";
	}

	@Override
	public String setColor(String color) {
		this.color = CanBeColored.super.setColor(color);
		return this.color;
	}

	@Override
	public String getColor() {
		if ("No color".equals(this.color)) {
			return "Out of color...";
		}

		return this.color;
	}
}
