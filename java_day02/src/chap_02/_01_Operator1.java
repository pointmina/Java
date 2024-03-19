package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val);
        System.out.println(++val); //1을 먼저 더하고 val을 프린트

        val = 10;
        System.out.println(val++); //프린트 하고 val에 1더하기

        val = 10;
        System.out.println(val);
        System.out.println(--val);

        val = 10;
        System.out.println(val--);

        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);
        System.out.println("대기 인원 : " + waiting++);


    }

}
