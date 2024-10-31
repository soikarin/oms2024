
public class AdapterMain {

	public static void main(String[] args) {
		ShapeDrawer drawer = new ShapeDrawer();

		Rectangle vr1 = new Rectangle();
		drawer.addBasicShape(vr1);

		Rectangle br = new Rectangle();
		br.changeVisibility();
		drawer.addBasicShape(br);

		Circle vc = new Circle();
		drawer.addBasicShape(vc);

		Circle bc = new Circle();
		bc.changeVisibility();
		drawer.addBasicShape(bc);

		Rectangle vr2 = new Rectangle();
		drawer.addBasicShape(vr2);		

		Triangle t1 = new Triangle("Other color");
		drawer.addBasicShape(new ShapeAdapter(t1));

		ShapeDiamond d1 = new ShapeDiamond("PURPLE");
		drawer.addBasicShape(new ShapeAdapter(d1));

		ShapeDiamond d2 = new ShapeDiamond("somethingElse");
		drawer.addBasicShape(new ShapeAdapter(d2));

		ShapeDiamond d3 = new ShapeDiamond(4.0, 4.0, "Yellow");
		drawer.addBasicShape(new ShapeAdapter(d3));

		Triangle t2 = new Triangle(6.0, 6.0, 6.0, "Blue");
		drawer.addBasicShape(new ShapeAdapter(t2));

		ShapeDiamond d4 = new ShapeDiamond(1.0, 1.0, "Green");
		drawer.addBasicShape(new ShapeAdapter(d4));
		
		BrushStroke bs1 = new BrushStroke();
		drawer.addBasicShape(bs1);

		BrushStroke bs2 = new BrushStroke();
		bs2.setColor("someColor");
		drawer.addBasicShape(bs2);

		BrushStroke bs3 = new BrushStroke();
		bs3.setColor("RED");
		drawer.addBasicShape(bs3);

		drawer.draw();
		drawer.grow();
		drawer.showVisibility();

	}

}