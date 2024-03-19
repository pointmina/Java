package chap_04;

public class _10_Break {
    public static void main(String[] args) {

        int customer = 1;
        while (customer <= 50) {
            System.out.println(customer + "번 손님, 주문하신 치킨 나왔습니다.");
            if (customer == 50) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }customer++;
        }
        System.out.println("영업이 종료되었습니다.");
    }
}
