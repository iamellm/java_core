package exercises;

public class StackTraceElementOutput {
        public static void main(String[] args) {
            System.out.println(getCallerClassAndMethodName());
            anotherMethod();
        }

        private static void anotherMethod() {
            System.out.println(getCallerClassAndMethodName());
        }

        public static String getCallerClassAndMethodName() {
            StackTraceElement[] elements = new Exception().getStackTrace();
            if(elements.length < 3) {
                return null;
            }
            return elements[2].getClassName() + "#" + elements[2].getMethodName();
        }
}

