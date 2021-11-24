package prasad.leetcode.p537;

public class ComplexNumberMultiplication {

    public String complexNumberMultiply(String num1, String num2) {
        String[] realAndImaginary1 = num1.split("\\+");
        String[] realAndImaginary2 = num2.split("\\+");
        int real1 = Integer.parseInt(realAndImaginary1[0]);
        int imaginary1 = Integer.parseInt(realAndImaginary1[1].substring(0, realAndImaginary1[1].length() - 1));
        int real2 = Integer.parseInt(realAndImaginary2[0]);
        int imaginary2 = Integer.parseInt(realAndImaginary2[1].substring(0, realAndImaginary2[1].length() - 1));

        int resultReal = (real1 * real2) + (imaginary1 * imaginary2 * -1);
        int resultImaginary = (real1 * imaginary2) + (real2 * imaginary1);
        return resultReal + "+" + resultImaginary + "i";
    }
}
