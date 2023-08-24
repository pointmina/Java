package chap_06;

public class _04_ParameterAndReturn {

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPowerExp(int number, int exponent) {
        int result = 1;
        for (int i = 0; i <exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {

        int retVal = getPower(2);
        System.out.println(retVal);

        retVal = getPowerExp(3,3);
        System.out.println(retVal);
    }
}
