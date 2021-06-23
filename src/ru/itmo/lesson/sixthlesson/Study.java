package ru.itmo.lesson.sixthlesson;

/**
 * @author chervinko <br>
 * 23.06.2021
 */
class Study {
    private final String course;

    public Study(String course) {
        this.course = course;
    }

    public String printCourse() {
        return this.course;
    }
}

class JavaProgram {
    public static void main(String[] args) {
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());
    }
}
