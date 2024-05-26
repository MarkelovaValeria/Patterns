package CodeSmells.newLab6.part2.changeReferenceToValue;

public class ImmutablePoint {
    private final int x;
    private final int y;

    public ImmutablePoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutablePoint that = (ImmutablePoint) o;
        return x == that.x && y == that.y;
    }

    public int hashCode() {
        return 31 * x + y;
    }

    public String toString() {
        return "Immutable Point{" + "x=" + x + ", y=" + y + '}';
    }

}
