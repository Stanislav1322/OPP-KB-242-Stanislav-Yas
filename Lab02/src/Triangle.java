public class Triangle {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        // Перевірка, чи не вироджений трикутник (площа не повинна бути 0)
        if (area() <= 0) {
            throw new IllegalArgumentException("Трикутник вироджений або точки лежать на одній прямій");
        }
    }

    // Площа трикутника за координатами вершин
    public double area() {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y)) / 2.0);
    }

    // Знаходження центроїда (середнє арифметичне координат)
    public Point centroid() {
        double centerX = (a.x + b.x + c.x) / 3.0;
        double centerY = (a.y + b.y + c.y) / 3.0;
        return new Point(centerX, centerY);
    }
}