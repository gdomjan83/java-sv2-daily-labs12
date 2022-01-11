package day02;

public class MathAlgorithms {

    public int findHighestCommonDivider(int num1, int num2) {
        int result = Math.min(num1, num2);
        while (!((num2 % result == 0) && (num1 % result == 0))) {
            result--;
        }
        return result;
    }
}
