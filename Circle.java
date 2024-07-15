public class Circle extends Shape {
    private Vec2 center;
    private float rad;

    public Vec2 getCenter() {
        return this.center;
    }

    public void setCenter(Vec2 center) {
        this.center = center;
    }

    public float getRad() {
        return this.rad;
    }

    public void setRad(float rad) {
        this.rad = rad;
    }

    public Circle(Vec2 center, float rad) {
        this.center = center;
        this.rad = rad;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Circle[%s,r=%f]", center.toString(), rad));
    }

    @Override
    public void move(float dx, float dy) {
        this.center.add(new Vec2(dx, dy));
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Circle c) {
            return this.center.equals(c.center) && rad == c.rad;
        }
        return false;
    }
}
