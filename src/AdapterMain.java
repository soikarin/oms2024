
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

            //Tästä eteenpäin kesken

        Triangle t1 = new Triangle("Other color");
        ShapeDiamond d1 = new ShapeDiamond("PURPLE");
        ShapeDiamond d2 = new ShapeDiamond("somethingElse");
        ShapeDiamond d3 = new ShapeDiamond(4.0, 4.0, "Yellow");
        Triangle t2 = new Triangle(6.0, 6.0, 6.0, "Blue");
        ShapeDiamond d4 = new ShapeDiamond(1.0, 1.0, "Green");
        BrushStroke bs1 = new BrushStroke();
        BrushStroke bs2 = new BrushStroke();
            bs2.setColor("someColor");
        BrushStroke bs3 = new BrushStroke();
            bs3.setColor("RED");

        drawer.draw();
        drawer.grow();
        drawer.showVisibility();

    }

}