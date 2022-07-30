package exercises.char_sequence;

public class AsciiCharSequence implements CharSequence {

    public byte[] byteSequence;

    public AsciiCharSequence(byte[] byteSequence) {
        this.byteSequence = byteSequence;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(java.util.Arrays.copyOfRange(byteSequence, start, end));
    }

    @Override
    public String toString() {
        return new String(byteSequence);
    }

    @Override
    public char charAt(int index) {
        return (char) byteSequence[index];
    }

    @Override
    public int length() {
        return byteSequence.length;
    }

    public static void main(String[] args) {
        byte[] example = {72, 101, 108, 108, 111, 33};
        AsciiCharSequence sequence = new AsciiCharSequence(example);
        System.out.println(sequence);
        System.out.println(sequence.length());
        System.out.println(sequence.charAt(4));
        System.out.println(sequence.subSequence(1, 4));
        example[0] = 74;
        System.out.println(sequence);
    }
}
