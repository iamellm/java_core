package Day4;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Alina", 24);
        person1.sayHello();
        person1.info();
        int yearsPerson1 = person1.yearsBeforeRetirement();
        System.out.println("Remaining years before retirement for first person: " + yearsPerson1 + " years.");

        Person person2 = new Person();
        person2.setNameAndAge("Evgeny", 28);
        person2.sayHello();
        person2.info();
        int yearsPerson2 = person2.yearsBeforeRetirement();
        System.out.println("Remaining years before retirement for second person: " + yearsPerson2 + " years.");
    }
}

class Person{
    String name;
    int age;

    void setNameAndAge(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void info() {
        System.out.println("My name is " + name + "," + "and I'm " + age + " years old.");
    }
    void sayHello() {
        System.out.println("Hello!!!");
    }
    int yearsBeforeRetirement() {
        return 65 - age;
    }
}
