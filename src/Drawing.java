import java.util.ArrayList;
import java.util.List;

abstract class Drawing<T> {

    private List<T> shapes = new ArrayList<T>();
 
    public void addBasicShape(T shape) {
        if (shape != null) {
            shapes.add(shape);
        }
    }

    public List<T> getBasicShapes() {
        return shapes;
    }

    public abstract void draw();

}
