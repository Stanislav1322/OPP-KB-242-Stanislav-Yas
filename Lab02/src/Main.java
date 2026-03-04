public class Main {
    public static void main(String[] args) {
        // Тест завдання 2: Segment
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 3);
        Segment segment = new Segment(p1, p2);
        System.out.println("Довжина відрізка: " + segment.length());
        System.out.println("Середина: " + segment.middle());

        // Тест завдання 3: Triangle
        Triangle tr = new Triangle(new Point(0,0), new Point(4,0), new Point(0,3));
        System.out.println("Площа трикутника: " + tr.area()); // Має бути 6.0
        System.out.println("Центроїд: " + tr.centroid());
    }
}