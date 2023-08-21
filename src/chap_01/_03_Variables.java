package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "김한토";
        int time = 15;

        System.out.println(name +"님, 안녕하세요. 현재 시간은 " + time+ "시입니다.");

        double score = 90.5;
        char grade = 'A';
        name = "김민아";
        System.out.println(name + "님의 평균 점수는 " + score +"점입니다.");
        System.out.println("학점은 " + grade +"입니다.");

        long l = 1000000000000L;
        l = 1_000_000_000_000L; //보기 편하게




    }

}
