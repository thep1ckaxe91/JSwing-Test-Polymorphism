
public class Vec2 {
    private float x;
    private float y;

    public float getX() {
        return this.x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Vec2() {
        x = y = 0;
    }

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vec2(Vec2 oth) {
        this.x = oth.x;
        this.y = oth.y;
    }

    public Vec2 add(Vec2 oth) {
        this.x += oth.x;
        this.y += oth.y;
        return this;
    }

    public float length() {
        return (float) Math.sqrt(this.x * this.x + this.y * this.y);
    }

    @Override
    public String toString() {
        return String.format("(%f,%f)", x, y);
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Vec2 v) {
            return v.x == x && v.y == y;
        }
        return false;
    }
}
