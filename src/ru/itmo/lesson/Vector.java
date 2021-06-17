package ru.itmo.lesson;

/**
 * 5й урок.
 *
 * @author chervinko <br>
 * 17.06.2021
 */
public class Vector {
    private final double x;
    private final double y;
    private final double z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    /**
     * Длинна вектора.
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * Скалярное произведение.
     */
    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    /**
     * Векторное произведение.
     */
    public Vector vectorProduct(Vector vector) {
        return new Vector(y * vector.z - z * vector.y, z * vector.x - x * vector.z, x * vector.y - y * vector.x);
    }

    /**
     * Косинус угла.
     */
    public double cosineAngle(Vector vector) {
        return scalarProduct(vector) / (length() * vector.length());
    }

    /**
     * Сумма векторов.
     */
    public Vector sum(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    /**
     * Разность векторов.
     */
    public Vector difference(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    /**
     * Получить массив случайных векторов размера N.
     */
    public static Vector[] getRandomVector(int n) {
        Vector[] vectors = new Vector[n];
        for (int i = 0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }

        return vectors;
    }
}