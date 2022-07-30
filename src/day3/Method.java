package day3;

public class Method {

    int sumOfThreeNumbers(int a, int b, int c) {
        int rsl = a + b + c;
        return rsl;
    }

    int averageSumOfThreeNumbers(int a1, int b1, int c1) {
        int rsl = sumOfThreeNumbers(a1, b1, c1) /3;
        return rsl;
    }
}

class MethodTest{
    public static void main(String[] args) {
        Method method = new Method();
        int sum = method.sumOfThreeNumbers(3, 8, 11);
        System.out.println(sum);
        System.out.println(method.sumOfThreeNumbers(10, 20, 30));
        System.out.println(method.averageSumOfThreeNumbers(20, 40, 60));
    }
}
