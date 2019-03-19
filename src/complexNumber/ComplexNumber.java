package complexNumber;

import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {

        return re;
    }

    public double getIm() {

        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;}
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ComplexNumber that = (ComplexNumber) obj;
        return Double.compare(that.getRe(), getRe()) == 0 &&
               Double.compare(that.getIm(), getIm()) == 0;
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}