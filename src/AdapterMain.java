
public class AdapterMain {

    public static void main(String[] args) {
        ShapeDrawer drawer = new ShapeDrawer();

        Rectangle visibleRectangle1 = new Rectangle();
        drawer.addBasicShape(visibleRectangle1);
        Rectangle backroundRectangle = new Rectangle();
        backroundRectangle.changeVisibility();
        System.out.println(backroundRectangle.isVisible());
        drawer.addBasicShape(backroundRectangle);

        Circle visibleCircle = new Circle();
        drawer.addBasicShape(visibleCircle);
        Circle backroundCircle = new Circle();
        backroundCircle.changeVisibility();
        drawer.addBasicShape(backroundCircle);

        Rectangle visibleRectangle2 = new Rectangle();
        drawer.addBasicShape(visibleRectangle2);

        drawer.draw();
        drawer.grow();
        drawer.showVisibility();

    }

}