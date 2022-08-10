package exercises.java_masterclass.oop;

public class VipPerson {

    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipPerson() {
        this("default name", 50000.00, "default@email.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipPerson(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
}

class VipPersonTest {
    public static void main(String[] args) {
        VipPerson person1 = new VipPerson("Alina Lim", 100000, "alinalim@gmail.com");
        System.out.println(person1.getName());
        System.out.println(person1.getCreditLimit());

        VipPerson person2 = new VipPerson("Evgeny Lim", 99000);
        System.out.println(person2.getEmail());

        VipPerson person3 = new VipPerson();
        System.out.println(person3.getName());
    }
}
