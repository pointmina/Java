package chap_06;

public class _05_Overloading {
    //오버로딩? 이름이 같은 메소드를 여러개 만드는것

    public static int getPower(int number) {
        return number * number;
    }

    public static int getPower(String strNumber) {
        int number = Integer.parseInt(strNumber);
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

        System.out.println(getPower(3));
        System.out.println(getPower("3"));

    }
}
