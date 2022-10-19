package exercises;

import java.io.*;


public class Stream {
    public static void main(String[] args) {
        byte[] bytes = {3,5,7,10};
        InputStream inputStream = new ByteArrayInputStream(bytes);
        try {
            System.out.println(sumOfStream(inputStream));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int sumOfStream(InputStream inputStream) throws IOException {
        int sum = 0;
        int digit;
        while ((digit = inputStream.read()) != -1) {
            sum = (byte) digit + sum;
        }
        return sum;
    }
}
