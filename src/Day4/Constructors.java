package Day4;

public class Constructors {
    public static void main(String[] args) {
        People person1 = new People("Alina");
        People person2 = new People("Evgeny", 28);
    }
}

class People{
    private String name;
    private int age;

    public People() {
        this("Alina", 24);
    }

    public People(String name) {
        System.out.println("Hello from second constructor");
        this.name = name;
    }

    public People(String name, int age) {
        System.out.println("Hello from third constructor");
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
}