package chap_04;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

public class _04_SwitchCase {
    public static void main(String[] args) {

        int ranking = 1;

        //switch case => 명확한 케이스가 있는 경우 사용

        switch (ranking) {

            case 1 :
                System.out.println("전액 장학금");
                break;

            case 2 :
            case 3 :
                System.out.println("반액 장학금");
                break;

            default:
                System.out.println("장학금 대상 아님");
        }



    }
}
