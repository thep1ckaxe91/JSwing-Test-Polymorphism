
import java.util.ArrayList;

public class Layer {

    ArrayList<Shape> shapes = new ArrayList<>();

    public void remove(Shape shape) {
        shapes.remove(shapes.indexOf(shape));
    }

    public void drawShapes() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    this.remove(shapes.get(j));
                }
            }
        }
    }

    public static void main(String args[]) {

    }
}
