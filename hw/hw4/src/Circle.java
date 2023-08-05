// Класс для круга
/**
 * Класс круг с полем <b>radius</b>.
 * @autor Каленский В.А.
 * @version 0.1
 */
class Circle {
    /** Значение радиуса. (double) */
    private double radius;

    /**
     * Конструктор для создания круга.
     *
     * @param radius радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Метод для расчета площади круга.
     *
     * @return Возвращает площадь круга.
     * @see Circle#radius
     * @see Math#PI
     * @value double
     */
     double getAreaCircle() {
        return Math.PI * radius * radius;
    }

    /**
     * Метод для расчета периметра круга.
     *
     * @return Возвращает периметр круга.
     * @see Circle#radius
     * @see Math#PI
     * @value double
     */
    double getPerimeterCircle() {
        return 2 * Math.PI * radius;
    }
}
