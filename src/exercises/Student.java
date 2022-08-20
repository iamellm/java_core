package exercises;

public class Student {
    private String name;
    private int course;
    private double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public static void ifStatement(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Students are equal.");
        } else {
            System.out.println("Students are different.");
        }
    }

    public static void ifNestedStatement(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("Students' names, courses and grades are equal.");
                } else {
                    System.out.println("Students' names and courses are equal but grades");
                }
            } else {
                System.out.println("Students' names are equal but courses");
            }
        } else {
            System.out.println("Students' names are different.");
        }
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Bob Smith", 12112, 4.5);
        Student st2 = new Student("Anna Johnson", 12112, 4.5);
        Student.ifStatement(st1, st2);
        Student.ifNestedStatement(st1, st2);
        st1.setName("Anna Johnson");
        Student.ifNestedStatement(st1, st2);
    }
}