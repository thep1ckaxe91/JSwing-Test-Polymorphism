public abstract class Shape {
    public abstract void draw();

    public abstract void move(float dx, float dy);

    @Override
    public abstract  boolean equals(Object o);

    public void delete(Layer layer) {
        layer.remove(this);
    }
}
