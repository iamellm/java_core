package day4;

public class GetterAndSetter {
    public static void main(String[] args) {
        PersonInfo person1 = new PersonInfo();
        person1.setName("Evgeny");
        person1.setAge(28);
        System.out.println("Printing output in method main: " + person1.getName());
        System.out.println("Printing output in method main: " + person1.getAge());
    }
}

class PersonInfo {
    private String name;
    private int age;

    public void setName(String name) {
        if(name.isEmpty() || name.contains(" ")) {
            System.out.println("Please fill your name in.");
        } else {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Your age must have positive numbers.");
        } else {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    void info() {
        System.out.println("My name is " + name + ", and I'm " + age + " years old.");
    }

    void sayHello() {
        System.out.println("Hello!!!");
    }

    int yearsBeforeRetirement() {
        return 65 - age;
    }
}
