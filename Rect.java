public class Rect extends Shape {
    private Vec2 topleft;
    private Vec2 size;

    public Vec2 getTopleft() {
        return this.topleft;
    }

    public void setTopleft(Vec2 topleft) {
        this.topleft = topleft;
    }

    public Vec2 getSize() {
        return this.size;
    }

    public void setSize(Vec2 size) {
        this.size = size;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Rect[%s,%s]", topleft.toString(), size.toString()));
    }

    @Override
    public void move(float dx, float dy) {
        this.topleft.add(new Vec2(dx, dy));
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Rect r) {
            return this.topleft.equals(r.topleft) && this.size.equals(r.size);
        }
        return false;
    }
}
