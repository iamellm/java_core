package exercises;

public class Age {
    public int determineGroup(int age) {
        return (age >= 7 && age <= 13) ? 1 : (age >= 14 && age <= 17) ? 2 : (age >= 18 && age <= 65) ? 3 : 1;
    }

    public static void main(String[] args) {
        Age age = new Age();
        System.out.println(age.determineGroup(28));
    }
}
