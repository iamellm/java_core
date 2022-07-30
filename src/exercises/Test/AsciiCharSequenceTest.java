package exercises.Test;

import exercises.CharSequence.AsciiCharSequence;

class AsciiCharSequenceTest {

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