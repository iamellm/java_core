package day2;

public class Student {

    int studentId;
    String studentFirstName;
    String studentLastName;
    int yearOfSchool;
    double averageMathGrade;
    double averageEconomicsGrade;
    double averageForeignLanguageGrade;

    Student() {
    }

    Student(int studentId, String studentFirstName, String studentLastName, int yearOfSchool, double averageMathGrade, double averageEconomicsGrade, double averageForeignLanguageGrade) {
        this.studentId = studentId;
        this.studentFirstName = studentFirstName;
        this.studentLastName = studentLastName;
        this.yearOfSchool = yearOfSchool;
        this.averageMathGrade = averageMathGrade;
        this.averageEconomicsGrade = averageEconomicsGrade;
        this.averageForeignLanguageGrade = averageForeignLanguageGrade;
    }

    Student(int studentId, String studentFirstName, String studentLastName, int yearOfSchool) {
        this(studentId, studentFirstName, studentLastName, yearOfSchool, 0.0, 0.0, 0.0);
    }

    static class StudentTest{

        double averageGrade(Student student) {
            double rsl = (student.averageMathGrade + student.averageEconomicsGrade + student.averageForeignLanguageGrade) / 3;
            System.out.println("Student " + student.studentFirstName + " " + student.studentLastName + " has an average grade: " + rsl);
            return rsl;
        }

        public static void main(String[] args) {
            Student student1 = new Student();
            student1.studentId = 1;
            student1.studentFirstName = "Evgeny";
            student1.studentLastName = "Lim";
            student1.yearOfSchool = 2;
            student1.averageMathGrade = 4.4;
            student1.averageEconomicsGrade = 4.1;
            student1.averageForeignLanguageGrade = 4.2;

            Student student2 = new Student(2, "Alina", "Lim", 2);
            student2.averageMathGrade = 4.2;
            student2.averageEconomicsGrade = 4.1;
            student2.averageForeignLanguageGrade = 4.6;

            Student student3 = new Student(3, "Alex", "Goodwill", 3, 4.5, 4.4, 4.6);

            StudentTest sTest = new StudentTest();
            sTest.averageGrade(student1);
            sTest.averageGrade(student2);
            sTest.averageGrade(student3);
        }
    }
}
