package bowling.domain;

import java.util.Objects;

public class Point {

    public static final int FINAL_MAX_POINT = 20;
    public static final int MAX_POINT = 10;
    public static final int MIN_POINT = 0;

    private int point;

    public Point(int point) {
        validate(point);
        this.point = point;
    }

    public int currentPoint() {
        return point;
    }

    private void validate(int point) {
        if (point > MAX_POINT || point < MIN_POINT) {
            throw new IllegalArgumentException(MIN_POINT + " ~ " + MAX_POINT + "까지 가능합니다.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point1 = (Point) o;
        return point == point1.point;
    }

    @Override
    public int hashCode() {
        return Objects.hash(point);
    }
}
