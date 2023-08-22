package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        int max = 20;
        int sold = 0;
        int noShow = 17;

        for (int i = 1; i <= 50; i++) {
            System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다.");


            //치킨을 가져가지 않음

            if (i == noShow){
                System.out.println(i +"번 손님, 노쇼로 인해 다음 손님에게 기회가 넘어갑니다.");
                continue; //이 문장을 만나는 순간 밑에 코드는 실행하지 않고 위로 넘어감
            }

            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
                
            }
            
        }
        System.out.println("영업을 종료합니다.");
    }
}
