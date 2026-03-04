public class Line {
    private double k;
    private double b;

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line another) {
        // Якщо коефіцієнти нахилу рівні
        if (this.k == another.k) {
            return null; // паралельні або співпадають
        }

        double x = (another.b - this.b) / (this.k - another.k);
        double y = this.k * x + this.b;

        return new Point(x, y);
    }
    public static void main(String[] args) {
        // Створюємо дві лінії: y = 2x + 5 та y = -1x + 2
        Line line1 = new Line(0, 1);
        Line line2 = new Line(-1, 7);

        Point result = line1.intersection(line2);

        if (result != null) {
            System.out.println("Лінії перетинаються у точці:");
            System.out.println("x = " + result.x);
            System.out.println("y = " + result.y);
        } else {
            System.out.println("Лінії паралельні, точок перетину немає.");
        }
    }
}