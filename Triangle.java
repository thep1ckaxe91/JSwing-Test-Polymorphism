public class Triangle extends Shape {
    private Vec2 p1;
    private Vec2 p2;
    private Vec2 p3;

    public Vec2 getP1() {
        return this.p1;
    }

    public Vec2 getP2() {
        return this.p2;
    }

    public Vec2 getP3() {
        return this.p3;
    }

    public Triangle(Vec2 p1, Vec2 p2, Vec2 p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public void draw() {
        System.out.println(String.format(
                "Triangle[%s,%s,%s]", p1.toString(), p2.toString(), p3.toString()));
    }

    @Override
    public void move(float dx, float dy) {
        Vec2 d = new Vec2(dx, dy);
        this.p1.add(d);
        this.p2.add(d);
        this.p3.add(d);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Triangle t) {
            return t.p1.equals(p1) && t.p2.equals(p2) && t.p3.equals(p3);
        }
        return false;
    }
}
