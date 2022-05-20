package _02_structural_patterns._08_composite._04_myexam;

import java.util.ArrayList;
import java.util.List;

// composite
public class CompositeGraphic implements Graphic{

    private List<Graphic> childGraphics = new ArrayList<Graphic>();

    @Override
    public void print() {
        for (Graphic graphic : childGraphics) {
            graphic.print();
        }
    }

    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    public void remove(Graphic graphic) {
        childGraphics.remove(graphic);
    }
}
