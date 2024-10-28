public class ShapeDrawer extends Drawing<ShapeBasic> {
// En tiiä toimiiko, en tehny main funktiota vielä :D
    @Override
    public void draw() {
        if(getBasicShapes().isEmpty() == true) {
            System.out.println("Drawing is empty!");
        } else {
            for (ShapeBasic shape : this.getBasicShapes()) {
                shape.draw();
            }
        }
    }

    public void grow() {
        if(getBasicShapes().isEmpty() == true) {
            System.out.println("Drawing is empty!");
        } else {
            for (ShapeBasic shape : this.getBasicShapes()) {
                shape.grow();
            }
        }

    }

    public void showVisibility() {
        if(getBasicShapes().isEmpty() == true) {
            System.out.println("Drawing is empty!");
        } else {
            int count = 1;
            for (ShapeBasic shape : this.getBasicShapes()) {
                String visibility = shape.isVisible() ? "visible" : "in the background";
                System.out.println(count + ". shape is " + visibility + ": " + shape.printText());
                ++count;
            }
            System.out.println("Total number of shapes: " + count);
        }
    }
    
}
