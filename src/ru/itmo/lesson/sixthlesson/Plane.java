package ru.itmo.lesson.sixthlesson;

/**
 * Создайте класс Самолет. В классе создайте вложенный класс - крыло. Внутри класса Крыло, реализуйте:
 * поле для хранения информации про вес крыла;
 * метод, который будет показывать вес крыла.
 * <p>
 * В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла и выведите информацию на экран.
 *
 * @author chervinko <br>
 * 23.06.2021
 */
public class Plane {

    private Wing wing;

    public static void main(String[] args) {
        Plane planeA = new Plane(598);
        System.out.println(planeA);

        Plane planeB = new Plane();
        planeB.setWing(planeB.new Wing(895));
        System.out.println(planeB);
    }

    public Plane() {
    }

    public Plane(double weightWing) {
        this.wing = new Wing(weightWing);
    }

    public Wing getWing() {
        return wing;
    }

    public void setWing(Wing wing) {
        this.wing = wing;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "wing=" + wing +
                '}';
    }

    public class Wing {
        private final double weight;

        public Wing(double weight) {
            this.weight = weight;
        }

        public double getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Wing{" +
                    "weight=" + weight +
                    '}';
        }
    }
}
