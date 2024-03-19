package chap_02;

public class _02_Operator {
    public static void main(String[] args) {
        System.out.println(5>3);


        boolean 김치찌개 = true;
        boolean 계란말이 = true;
        boolean 제육볶음 = false;

        System.out.println(김치찌개 || 계란말이 || 제육볶음);
        System.out.println(김치찌개 && 계란말이 && 제육볶음);

        //삼항 연산자
        // 결과 = 조건 ? (참의 경우 결과값) : (거짓의 경우 결과값)
        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x < y) ? x : y;
        System.out.println(min);

        boolean b = (x == y) ? true : false;
        System.out.println(b);
    }
}
