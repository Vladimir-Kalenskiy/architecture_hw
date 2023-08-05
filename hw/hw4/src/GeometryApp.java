// Главный класс приложения
public class GeometryApp {
    public static void main(String[] args) {
        // Пример использования конкретных классов геометрических фигур
        Circle circle = new Circle(5.0);
        System.out.println("Площадь круга: " + circle.getAreaCircle());
        System.out.println("Периметр круга: " + circle.getPerimeterCircle());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Площадь прямоугольника: " + rectangle.getAreaRectangle());
        System.out.println("Периметр прямоугольника: " + rectangle.getPerimeterRectangle());

        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Площадь треугольника: " + triangle.getAreaTriangle());
        System.out.println("Периметр треугольника: " + triangle.getPerimeterTriangle());
    }
}