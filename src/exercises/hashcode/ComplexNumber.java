package exercises.hashcode;

public class ComplexNumber {
    private double re;
    private double im;

    public ComplexNumber() {
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() { return re;}

    public double getIm() { return im;}

    public boolean equals(Object o) {
        if(this == o) {
            return true;
        }
        if(o == null || o.getClass() != this.getClass()) {
            return false;
        }
        ComplexNumber cNum = (ComplexNumber) o;
        if(Double.compare(re, cNum.re) != 0) {
            return false;
        }
        return Double.compare(im, cNum.im) == 0;
    }

    public int hashCode() {
        int rsl;
        long temp;
        temp = Double.doubleToLongBits(re);
        rsl = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        rsl = 31 * rsl + (int) (temp ^ (temp >>> 32));
        return rsl;
    }
}
