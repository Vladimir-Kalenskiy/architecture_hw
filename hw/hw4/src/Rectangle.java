// Класс для прямоугольника
/**
 * Класс прямоугольник с полями <b>lenght</b>, <b>width</b>.
 * @autor Каленский В.А.
 * @version 0.1
 */
class Rectangle {
    /** Значение длины. (double) */
    private double length;
    /** Значение ширины. (double) */
    private double width;

    /**
     * Конструктор для создания прямоугольника.
     *
     * @param length длина.
     * @param width  ширина.
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Метод для расчета площади прямоугольника.
     *
     * @return Возвращает площадь прямоугольника.
     * @see Rectangle#length
     * @see Rectangle#width
     * @value double
     */
    double getAreaRectangle() {
        return length * width;
    }

    /**
     * Метод для расчета периметра прямоугольника.
     *
     * @return Возвращает периметр прямоугольника.
     * @see Rectangle#length
     * @see Rectangle#width
     * @value double
     */
    double getPerimeterRectangle() {
        return 2 * (length + width);
    }
}
