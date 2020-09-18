package ru.x5.Task3.StudentTask;

public class Aspirant extends Student {
    private String study;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String study) {
        super(firstName, lastName, group, averageMark);
        this.study = study;
    }

    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
