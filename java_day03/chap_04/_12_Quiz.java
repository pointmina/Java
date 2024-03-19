package chap_04;

public class _12_Quiz {
    public static void main(String[] args) {
        int fee = 4000;
        String car = "장애인 차량";
        int maxFee = 30000;
        int hour = 5;


        if (car == "일반 차량" && (hour * fee <= 30000)) {
            System.out.println(car + " " + hour + " 시간 주차 시 " + (fee * hour) + " 원");
        } else if (car == "일반 차량" && (hour * fee > maxFee)) {
            System.out.println(car + " " + hour + " 시간 주차 시 " + (maxFee) + "원");
        } else if ((car == "경차" || car == "장애인 차량") && (hour * fee > maxFee)) {
            System.out.println(car + " " + hour + " 시간 주차 시 " + (maxFee * 0.5) + "원");
        } else {
            System.out.println(car + " " + hour + " 시간 주차 시 " + (fee * hour * 0.5) + "원");
        }
    }
}
