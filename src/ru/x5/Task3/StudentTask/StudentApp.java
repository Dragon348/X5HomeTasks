package ru.x5.Task3.StudentTask;

public class StudentApp {
    public static void main(String[] args) {
        Student aspirant = new Aspirant("Олег", "Иванов", "А-101", 5, "Тест 235 тест");
        Student[] students = new Student[4];
        students[0] = aspirant;
        students[1] = new Student("Василий", "Петров", "Б-203", 4.82);
        students[2] = new Aspirant("Пётр", "Петров", "Б-203", 3.22, "Жизнь амёб в океане");
        students[3] = new Student("Марина", "Сидорова", "Б-203", 5);

        for (Student student : students) {
            System.out.println(student.getLastName() + " "
                    + student.getFirstName() + " "
                    + student.getGroup() + " "
                    + student.getAverageMark() + " "
                    + student.getScholarship());
        }
    }

}
