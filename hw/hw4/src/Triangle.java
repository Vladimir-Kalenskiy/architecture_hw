// Класс для треугольника
/**
 * Класс треугольник с полями <b>side1</b>, <b>side2</b>, <b>side3</b>.
 * @autor Каленский В.А.
 * @version 0.1
 */
class Triangle {
    /** Значение стороны 1. (double) */
    private double side1;
    /** Значение стороны 2. (double) */
    private double side2;
    /** Значение стороны 3. (double) */
    private double side3;

    /**
     * Конструктор для создания треугольника.
     *
     * @param side1 сторона 1.
     * @param side2 сторона 2.
     * @param side3 сторона 3.
     */
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    /**
     * Метод для расчета периметра треугольника.
     *
     * @return Возвращает периметр треугольника.
     * @see Triangle#side1
     * @see Triangle#side2
     * @see Triangle#side3
     * @value double
     */
    double getAreaTriangle() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    /**
     * Метод для расчета периметра треугольника.
     *
     * @return Возвращает периметр треугольника.
     * @see Triangle#side1
     * @see Triangle#side2
     * @see Triangle#side3
     * @value double
     */
    double getPerimeterTriangle() {
        return side1 + side2 + side3;
    }
}
