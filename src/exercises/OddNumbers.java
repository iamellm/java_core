package exercises;

public class OddNumbers {
    public static void printOddNumbers(int[] arr) {
        String coma = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1 || arr[i] % 2 == -1) {
                System.out.print(coma + arr[i]);
                coma = ",";
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = new int[] {3,5,20,8,7,3,100};
        printOddNumbers(array);
    }
}
