public class Segment {
    private Point start;
    private Point end;

    public Segment(Point start, Point end) {
        // Перевірка, чи не є початок і кінець однією точкою
        if (start.x == end.x && start.y == end.y) {
            throw new IllegalArgumentException("Відрізок не може бути виродженим у точку");
        }
        this.start = start;
        this.end = end;
    }

    // Метод для обчислення довжини відрізка
    public double length() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

    // Метод для знаходження середньої точки
    public Point middle() {
        return new Point((start.x + end.x) / 2, (start.y + end.y) / 2);
    }

    // Метод перетину відрізків (спрощена логіка для демонстрації)
    public Point intersection(Segment another) {
        return null; // Повернути null, якщо не перетинаються
    }
}