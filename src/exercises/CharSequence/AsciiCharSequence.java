package exercises.CharSequence;

import java.util.Arrays;

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
}
