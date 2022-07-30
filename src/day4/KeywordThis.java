package day4;

public class KeywordThis {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Alina");
        human.setAge(24);
        human.getInfo();
    }
}

class Human {
    String name;
    int age;

    public void setName(String name) {this.name = name;}

    public void setAge(int age) {this.age = age;}

    public String getName() {return name;}

    public int getAge() { return age;}

    public void getInfo() {
        System.out.println(name + ", " + age);
    }
}